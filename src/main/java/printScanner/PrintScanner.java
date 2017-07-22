package printScanner;

import java.util.Scanner;

public class PrintScanner {

        private static Scanner scanner;

        private static Scanner getScanner() {
            if (scanner == null) {
                scanner = new Scanner(System.in);
            }
            return scanner;
        }

        public static int getIntNumber() {
            String str;
            while (true) {
                str = getScanner().nextLine();
                if (str.matches("\\d+")) {
                    return Integer.parseInt(str);
                }
                System.out.println("Wrong Input!! Repeat!");
            }
        }
    }


