package exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Price first = new Price();
        Price second = new Price();

        for (int i = 0; i < 2; i++) {

            System.out.println("Enter the name of the product:");
            Scanner n = new Scanner(System.in);
            String name = n.next();
            System.out.println("Enter the name of the shop:");
            Scanner sh = new Scanner(System.in);
            String shop = sh.next();
            System.out.println("Enter the price of the product");
            Scanner pr = new Scanner(System.in);
            int price = pr.nextInt();

            if (i == 0) {
                first.product = name;
                first.shop = shop;
                first.cost = price;
            }
            if (i == 1) {
                second.product = name;
                second.shop = shop;
                second.cost = price;
            }
        }

        Price[] prices = {first, second};

        Arrays.sort(prices);

        System.out.println(Arrays.toString(prices));

        System.out.println("Enter the name of the shop: ");
        Scanner sn = new Scanner(System.in);
        String shopName = sn.next();

        Exception ex = new Exception();

        if (shopName.equals(first.shop) && shopName.equals(second.shop)) {
            System.out.println(Arrays.toString(prices));
        } else if (shopName.equals(first.shop)) {
            System.out.println(first.toString());
        } else if (shopName.equals(second.shop)) {
            System.out.println(second.toString());
        } else try {
            throw ex;
        } catch (Exception e) {
            System.out.println("No shop what sells it!");
        }
    }
}
