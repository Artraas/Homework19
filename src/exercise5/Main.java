package exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter first value:");
        Scanner a = new Scanner(System.in);
        double first = a.nextDouble();

        System.out.println("Enter second value:");
        Scanner b = new Scanner(System.in);
        double second = b.nextDouble();

        System.out.println("Enter yuor arithmetic operation sign:");
        Scanner c = new Scanner(System.in);
        String sign = c.next();

        Calculator calculator = new Calculator(first, second);

        switch (sign){
            case "+":
                System.out.println(calculator.add(first, second));
                break;
            case "-":
                System.out.println(calculator.sub(first, second));
                break;
            case "*":
                System.out.println(calculator.mul(first, second));
                break;
            case "/":
                System.out.println(calculator.div(first, second));
                break;
        }
    }
}
