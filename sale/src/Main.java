public class Main {
    public static void main(String[] args) {

        long[] sales = {45, 65, 76, 23, 876, 1231, 675, 978, 123};

        SalesManager salesManager = new SalesManager(sales);

        System.out.println(salesManager.max());
        System.out.println(average(sales));
    }
    public static long average(long [] array){
        long sum = 0;
        long min = 0;
        long max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if(min <= array[i]){
                min = array[i];
            }
            if(array[i] >array[i + 1]){
                max = array[i];
            }
            sum += array[i];
        }
        long average = (sum - min - max) / array.length;
        return average;

    }
}
