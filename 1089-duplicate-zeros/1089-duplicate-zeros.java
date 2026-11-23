class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i] == 0){
                for(int j=n-1 ; j>i;j--){
                    arr[j] = arr[j-1];
                }
            }
        }
    }
}