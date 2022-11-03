public class Main {
    public static void main(String[] args) {
        long[] sales = {5, 8, 10};
        SalesManager manager = new SalesManager(sales);
        System.out.println("Max: " + manager.max());

    }
}
