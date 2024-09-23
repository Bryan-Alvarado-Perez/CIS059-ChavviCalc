package calculator;
import java.util.Scanner;

public class calcApp {
    
    public class Calculator {

        private float num1;
        private float num2;
        private float result;

        public Calculator(float num1, float num2) {
            this.num1 = num1;
            this.num2 = num2;
            this.result = 0;
        }

        public float add() {
            result = num1 + num2;
            return result;
        }
    }
    
        public class Menu {
            
            public static void displayMenu() {
                System.out.println("===============================");
                System.out.println("|======CHAVVI-CALCULATOR======|");
                System.out.println("|=============================|");
                System.out.println("|===[1]-GET-FIRST-NUMBER======|");
                System.out.println("|===[2]-GET-SECOND-NUMBER=====|");
                System.out.println("|===[Q]-QUIT-THE-CALCULATOR===|");
                System.out.println("|===[A]-ADD===================|");
                System.out.println("|===[M]-MULTIPLY==============|");
                System.out.println("|===[S]-SUBTRACT==============|");
                System.out.println("|===[D]-DIVIDE================|");
                System.out.println("|===[C]-CLEAR-VALUES==========|");
                System.out.println("===============================");
            }

            public static String getUserInput(Scanner input) {
                return input.nextLine();
            }
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equals("q")) {
            Menu.displayMenu();
            userInput = Menu.getUserInput(input);
        }
        input.close();
    }
}
