import java.util.Scanner;

public class prefix_Sum {

    public static int rangeSum( int[] arr, int[] range){
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for(int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        int L = range[0];
        int R = range[1];
        int sum = prefixSum[R] - prefixSum[L-1];
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the no of elements of the array:");
        int[] arr = new int[n]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the range to calculate the range: ");
        int[] range =  new int[2];
        for (int i = 0; i < range.length; i++) {
            range[i] = sc.nextInt();
        }

        System.out.println(rangeSum(arr, range));
    }
}
