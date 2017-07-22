package menu;


import logic.Lists;
import logic.MethodOfDeputy;
import logic.MethodsOfFraction;
import object.Deputy;
import object.Fraction;
import printScanner.PrintScanner;

public class Menu {
    public void show() {

        MethodOfDeputy methodOfDeputy = new MethodOfDeputy();
        MethodsOfFraction methodsOfFraction=new MethodsOfFraction();
        Fraction fraction=new Fraction();
        while (true) {

            System.out.println(">1 Add deputy");
            System.out.println(">2 Print all deputy");
            System.out.println(">3 Remove deputy");
            System.out.println(">4 Sorted deputy by sum of bribe");
            System.out.println(">5 add fraction");
            System.out.println(">6 print fraction");
            System.out.println(">7 add deputy to fraction");
            System.out.println(">8 remove deputy from fraction");
            System.out.println(">9 ");
            System.out.println(">0 ");

            switch (PrintScanner.getIntNumber()) {
                case 1:
                    methodOfDeputy.addDeputy();
                    break;
                case 2:
                   methodOfDeputy.print();
                    break;
                case 3:
                    methodOfDeputy.removeDeputy();
                    break;
                case 4:
                    methodOfDeputy.sortedBySizeofBribe(Lists.deputyList);
                    break;
                case 5:
                    methodsOfFraction.addFriction(fraction);
                    break;
                case 6:
                    methodsOfFraction.printFraction();
                    break;

                case 7:
                    methodOfDeputy.addDeputyToFraction();
                    break;
                case 8:
                    fraction.removeDeputyFromFraction();


            }
        }
    }
}
