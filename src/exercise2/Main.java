package exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Worker first = new Worker();
        Worker second = new Worker();
        Worker third = new Worker();
        Worker fourth = new Worker();
        Worker fifth = new Worker();
        
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the name:");
            Scanner n = new Scanner(System.in);
            String name = n.next();
            System.out.println("Enter the position:");
            Scanner pos = new Scanner(System.in);
            String position = pos.next();
            System.out.println("Enter the yearOfEmployment:");
            Scanner year = new Scanner(System.in);
            int yearOfEmployment = year.nextInt();

            Exception ex = new Exception();
            if (yearOfEmployment > 2023 || yearOfEmployment < 1923) {
                try {
                    throw ex;
                } catch (Exception e) {
                    System.out.println("Invalid year format");
                }
            }

            if (i == 0) {
                first.name = name;
                first.position = position;
                first.yearOfEmployment = yearOfEmployment;
            }
            if (i == 1) {
                second.name = name;
                second.position = position;
                second.yearOfEmployment = yearOfEmployment;
            }
            if (i == 2) {
                third.name = name;
                third.position = position;
                third.yearOfEmployment = yearOfEmployment;
            }
            if (i == 3) {
                fourth.name = name;
                fourth.position = position;
                fourth.yearOfEmployment = yearOfEmployment;
            }
            if (i == 4) {
                fifth.name = name;
                fifth.position = position;
                fifth.yearOfEmployment = yearOfEmployment;
            }
        }

        Worker[] workers = {first, second, third, fourth, fifth};

        Arrays.sort(workers);

        System.out.println(Arrays.toString(workers));

//        мається на увазі кількість років на посаді (наприклад 2, 3, 5...) , а не рік надходження
        System.out.println("Enter the years ago: ");
        Scanner y = new Scanner(System.in);
        int year = y.nextInt();

        for (int i = 0; i < workers.length; i++) {
            if ((2023 - workers[i].getYearOfEmployment()) >= year) {
                String a =  workers[i].getName();
                System.out.println(a);
            }
        }
    }
}