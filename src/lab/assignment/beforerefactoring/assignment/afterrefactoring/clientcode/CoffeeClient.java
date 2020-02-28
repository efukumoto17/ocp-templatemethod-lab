package lab.assignment.beforerefactoring.assignment.afterrefactoring.clientcode;

import lab.assignment.beforerefactoring.assignment.afterrefactoring.*;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker mocha  = new MochaCoffee();
        CoffeeMaker capuccino  = new CapuccinoCoffee();
        CoffeeMaker americano  = new MochaCoffee();

        System.out.println("********************");

        mocha.prepareCoffee();
        capuccino.prepareCoffee();
        americano.prepareCoffee();

    }

}
