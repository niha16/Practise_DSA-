public class SplitArraySumEqual {
    public static boolean SplitArraySum(int[] arr){
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }

        int prefixSum  = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if(prefixSum == suffixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,0};
        if (SplitArraySum(arr)){
            System.out.println("Yes, the array can be split.");
        }
        else{
            System.out.println("No, the array can't be split.");
        }

    }
}
