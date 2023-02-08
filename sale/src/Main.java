public class Main {
    public static void main(String[] args) {

        int[] sales = {4, 5, 6, 7, 8};
        SalesManager salesManager = new SalesManager(sales);

        System.out.println(salesManager.max());
        System.out.println(average(sales));
    }
    public static int average(int [] array){
        int sum = 0;
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if(min <= array[i]){
                min = array[i];
            }
            if(array[i] >array[i + 1]){
                max = array[i];
            }
            sum += array[i];
        }
        int average = (sum - min - max) / array.length;
        return average;

    }
}
