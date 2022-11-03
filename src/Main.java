public class Main {
    public static void main(String[] args) {
        int[] sales = {5, 8, 10};
        SalesManager manager = new SalesManager(sales);
        System.out.println("Max: " + manager.max());
        System.out.println("Среднее: " + manager.srednee());

    }
}
