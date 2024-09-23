package calculator;
import java.util.Scanner;

public class calcApp {
    
    public class Calculator {

        private StringBuilder userInput = new StringBuilder();
        private float num1;
        private float num2;
        private float result;

        public Calculator(float num1, float num2, float result) {
            this.num1 = 0;
            this.num2 = 0;
            this.result = 0;
        }


        public float add() {
            return this.result = this.num1 + this.num2;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = "";

        while (userInput != "q") {
            Menu.displayMenu();
            userInput = Menu.getUserInput(input);
        }
        input.close();
    }
}
