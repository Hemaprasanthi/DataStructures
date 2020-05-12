Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr.

If there're duplicates in arr, count them seperately.

Example 4:

Input: arr = [1,1,2,2]
Output: 2
Explanation: Two 1s are counted cause 2 is in arr.
    
class Solution {
    public int countElements(int[] arr) {
        int count =0;
        int start = 0;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1] && arr[i-1]+1 == arr[i]){
                count = count + i-start;
                start =i;
            }
            else if(arr[i]!=arr[i-1]) start =i;
        }
        return count;
    }
}
