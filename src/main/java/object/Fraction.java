package object;

import logic.Lists;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@EqualsAndHashCode


public class Fraction {
    Scanner sc = new Scanner(System.in);
    private String nameOfFraction;
    private List<Deputy> thisClassDeputyLists = new ArrayList<>();


    public void addDeputy(String firstName, String lastName) {
        List<Deputy> deputyList = Lists.deputyList;
        boolean wasAdd = false;
        for (Deputy x : deputyList) {
            if (x.getFirstName().equals(firstName) && x.getLastName().equals(lastName)) {
                thisClassDeputyLists.add(x);
                wasAdd = true;
                break;
            }
        }
        if (!wasAdd) {
            System.out.println("there is not deputy : " + firstName + "  " + lastName);
        }
    }


    public void removeDeputyFromFraction() {
        System.out.println("enter name of fraction");
        String nameOfFraction = sc.next();
        for (Fraction f : Lists.fractionList) {
            if (f.getNameOfFraction().equals(nameOfFraction)) {
                System.out.println("enter name of dep");
                String firstName = sc.next();
                System.out.println("enter last name");
                String lastName = sc.next();
                for (Deputy x : Lists.deputyList) {
                    if (x.getFirstName().equals(firstName) && x.getLastName().equals(lastName)) {
                        Lists.deputyList.remove(x);
                    }
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Fraction{" +
                "nameOfFraction='" + nameOfFraction + '\'' +
                ",\n thisClassDeputyLists=" + thisClassDeputyLists +
                '}';
    }
}
