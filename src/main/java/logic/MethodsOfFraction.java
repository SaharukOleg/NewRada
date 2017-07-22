package logic;

import object.Fraction;
import java.util.Scanner;

public class MethodsOfFraction {
    Scanner sc = new Scanner(System.in);

    public void addFriction(Fraction fraction) {

        System.out.println("enter name of fraction");
        String name = sc.next();
       fraction.setNameOfFraction(name);
        Lists.fractionList.add(fraction);
    }

    public void printFraction() {
        for (Fraction x : Lists.fractionList) {
            System.out.println(x);
        }

    }
}
