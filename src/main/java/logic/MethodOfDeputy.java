package logic;

import object.Deputy;
import object.Fraction;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static logic.Lists.deputyList;


public class MethodOfDeputy {
    Scanner sc = new Scanner(System.in);

    public void addDeputy() {
        System.out.println("enter name of dep");
        String name = sc.next();
        System.out.println("enter last name");
        String lastName = sc.next();
        System.out.println("enter age");
        int age = sc.nextInt();

        Deputy deputy=new Deputy();
        giveBribe(deputy);
        deputy.setFirstName(name);
        deputy.setLastName(lastName);
        deputy.setAge(age);
        deputyList.add(deputy);
    }


    public void giveBribe(Deputy deputy) {
        System.out.println("Enter bribe-taker deputy or not -> (true of false)");
        boolean ChoosingBribeOrNot = sc.nextBoolean();

        if (!ChoosingBribeOrNot) {
            System.out.println("This deputy does not take bribe");

        } else if (ChoosingBribeOrNot == true) {
            System.out.println("Enter sum of bribe ");
            int sumOfBribe = sc.nextInt();
            if (sumOfBribe > 5000) {
                deputy.setBribe(true);
                deputy.setSumOfBribe(sumOfBribe);
                System.out.println("The police seized the deputy");

            } else {
                deputy.setBribe(true);
                deputy.setSumOfBribe(sumOfBribe);
                System.out.println("sum of bribe =  " + sumOfBribe);
            }
        }
    }

    public void print() {
        for (Deputy x : deputyList) {
            System.out.println(x);
        }
    }

    public void removeDeputy() {
        Deputy deputy1 = new Deputy();
        System.out.println("enter name of dep");
        String name = sc.next();
        System.out.println("enter last name");
        String lastName = sc.next();
        System.out.println("enter age");
        int age = sc.nextInt();
        giveBribe(deputy1);
        deputy1.setFirstName(name);
        deputy1.setLastName(lastName);
        deputy1.setAge(age);
        deputyList.remove(deputy1);
    }

    public void sortedBySizeofBribe(List<Deputy> deputyList) {
        deputyList.sort((Comparator.comparing(Deputy::getSumOfBribe)).reversed());
        deputyList.forEach(System.out::println);
    }


    public void addDeputyToFraction(){
        System.out.println("enter name of fraction");
        String nameOfFraction = sc.next();

        System.out.println("enter name of dep");
        String name = sc.next();
        System.out.println("enter last name");
        String lastName = sc.next();

      Fraction fraction= Lists.getFraByName(nameOfFraction);
      if(fraction==null){
          System.out.println("there is not entered fraction");
      }

      fraction.addDeputy(name,lastName);

    }

}
