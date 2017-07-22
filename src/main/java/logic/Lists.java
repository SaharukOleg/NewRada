package logic;

import lombok.Getter;
import object.Deputy;
import object.Fraction;

import java.util.ArrayList;
import java.util.List;

@Getter

public class Lists {
    public static List<Deputy> deputyList = new ArrayList<>();
    public static List<Fraction> fractionList = new ArrayList<>();


    public static Fraction getFraByName(String name) {
        for (Fraction fraction : fractionList) {
            if (fraction.getNameOfFraction().equals(name)) {
                return fraction;
            }
        }
        return null;
    }
}
