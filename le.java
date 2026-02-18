import java.util.Scanner;

public class le {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите количество элементов в массиве");
        int n = s.nextInt();
        int [] numbers= new int[n];
        System.out.println("введите "+n+" чисел: ");
        for(int i=0;i<n;i++){
            numbers[i]=s.nextInt();
        }
        shakeSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>0) {
                System.out.println(numbers[i]);
            }
        }
        s.close();
    }
    public static void shakeSort(int[] numbers) {
        int left =0;
        int right = numbers.length-1;
        while(left<=right){
            for(int i=right;i>left;i--){
                if(numbers[i-1]>numbers[i]){
                    int t = numbers[i];
                    numbers[i]=numbers[i-1];
                    numbers[i-1]=t;
                }
            }
            ++left;
            for(int i =left;i<right;++i){
                if(numbers[i]>numbers[i+1]){
                    int t = numbers[i+1];
                    numbers[i+1]=numbers[i];
                    numbers[i]=t;
                }
            }
            --right;
        }
    }
}
