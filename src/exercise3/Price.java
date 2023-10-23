package exercise3;

public class Price implements Comparable<Price>{
    String product;
    String shop;
    int cost;

    public Price(String product, String shop, int cost) {
        this.product = product;
        this.shop = shop;
        this.cost = cost;
    }

    public Price() {
    }

    @Override
    public String toString() {
        return
                "product=' " + product + '\'' +
                ", cost= " + cost +
                '}';
    }

    @Override
    public int compareTo(Price o) {
        return shop.compareTo(o.shop);
    }
}
