package calculator;
import java.util.Scanner;

public class CalculatorApp {
    
  public static class Calculator {
  private float num1;
  private float num2;

  public void setNum1(float num1) {
   this.num1 = num1;
  }

  public void setNum2(float num2) {
    this.num2 = num2;
  }

  public void add() {
    System.out.println("Addition result: " + (num1 + num2));
  }

  public void subtract() {
    System.out.println("Subtraction result: " + (num1 - num2));
  }

  public void multiply() {
    System.out.println("Multiplication result: " + (num1 * num2));
  }

  public void divide() {
    if (num2 == 0) {
      System.out.println("You can't divide by zero");
  } else {
    System.out.println("Division result: " + (num1 / num2));
  }
}

  public void clearValues() {
   num1 = 0;
   num2 = 0;
   System.out.println("The values have been cleared");
  }
}

  public static class Menu {
    private static Calculator calculator = new Calculator();

  public static void handleCases(String userInput, Scanner input) {
    switch(userInput) {
case "1":
System.out.println("Enter the first number: ");
calculator.setNum1(input.nextFloat());
input.nextLine();
break;

case "2":
System.out.println("Enter the second number: ");
calculator.setNum2(input.nextFloat());
input.nextLine();
break;

case "a":
calculator.add();
break;
                    
case "s":
calculator.subtract();
break;
                    
case "m":
calculator.multiply();
break;

case "d":
calculator.divide();
break;

case "c":
calculator.clearValues();
break;

case "q":
System.out.println("You have quit the calculator");
break;

default:
System.out.println("That is an invalid option.");
break;
}
}
            
public static String getUserInput(Scanner input) {
return input.nextLine();
}

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
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String userInput = "";
while (!userInput.equals("q")) {
Menu.displayMenu();
userInput = Menu.getUserInput(input);
userInput = userInput.toLowerCase();
Menu.handleCases(userInput, input);
}
input.close();
}
}
