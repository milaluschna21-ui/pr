public class Java {
    public static void main(String[] args) {
        int[] numbers = {1, 4, -5, 7, 3, 2, 9, -45, -1, -12, -33, 11};
        insertionSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>0) {
                System.out.println(numbers[i]);
            }
        }
    }
    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int num = numbers[i];
            int j;
            for (j = i; j > 0 && num < numbers[j - 1]; j--) {
                numbers[j] = numbers[j - 1];
            }
            numbers[j] = num;
        }
    }
}


