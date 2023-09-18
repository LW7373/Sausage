/*
Moses Dong, Nicholas Xu, and Lindsay Wang
Schenk
AP CSA - Period 7
Glizzy Goblin
19 September 2023
*/

package wangxu.seven;
import wangxu.seven.MeatTypeEnum.MeatType;

public class Main {
  public static void main(String[] args) {
    
    // Default constructor - Lindsay
    Sausage defaultSausage = new Sausage();

    // Dump
    System.out.println(defaultSausage);

    // Change
    defaultSausage.setProductName("Perfect Piggy Pizzazz");
    defaultSausage.setMeatType(MeatType.pork);
    defaultSausage.setProductionCost(1.50);
    defaultSausage.setSellingPrice(4.49);
    defaultSausage.setPackageWeight(700);
    defaultSausage.setNumSausages(6);
    defaultSausage.setSausageLength(4.5);
    defaultSausage.setLeanMeatPercentage(25);
    defaultSausage.setFatPercentage(75);
    defaultSausage.setIsCooked(true);

    // Dump
    System.out.println(defaultSausage);
    
    /*
    // Partial constructor 1 - Nicholas
    Sausage sausageTwo = new Sausage();
    sausageTwo.setProductName("Merry Meat Mash");
    sausageTwo.setMeatType(MeatType.mystery);
    sausageTwo.setPackageWeight(954);
    sausageTwo.setSausageLength(5.97);

    System.out.println(sausageTwo);
    
    // Partial constructor 2 - Nicholas
    

    */
    // Full constructor - Lindsay
    Sausage fullSausage = new Sausage("Cheery Chump Chick", MeatType.chicken, 1.00, 3.99, 700, 6, 5.0, 20, 80, true);

    // Dump
    System.out.println(fullSausage);

    // Change
    fullSausage.setProductName("Terrific Twisted Turkey");
    fullSausage.setMeatType(MeatType.turkey);
    fullSausage.setProductionCost(1.75);
    fullSausage.setSellingPrice(4.99);
    fullSausage.setPackageWeight(850);
    fullSausage.setNumSausages(8);
    fullSausage.setSausageLength(4.25);
    fullSausage.setLeanMeatPercentage(40);
    fullSausage.setFatPercentage(60);
    fullSausage.setIsCooked(false);

    // Dump
    System.out.println(fullSausage);
  }
}
