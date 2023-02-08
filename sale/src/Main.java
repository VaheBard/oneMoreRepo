public class Main {
    public static void main(String[] args) {

        long[] sales = {45, 65, 76, 23, 876, 1231, 675, 978, 123};
        SalesManager salesManager = new SalesManager(sales);

        System.out.println(salesManager.max());
    }
}
