package calculator;
import java.util.Scanner;

public class calcApp {
    
    public class Calculator {

        private StringBuilder userInput = new StringBuilder();
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
                System.out.println("Test");
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
