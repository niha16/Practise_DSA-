public class Eqilibirum {
    public static int equili_Index(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        int[] suffix = new int[n];
        suffix[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffix[i] = suffix[i+1] + arr[i];
        }
        
        for (int i = 0; i < suffix.length; i++) {
            if(prefix[i]== suffix[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,3};
        
        System.out.println(equili_Index(arr));
    }
       
}
