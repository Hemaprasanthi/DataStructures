Write an algorithm to determine if a number n is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Return True if n is a happy number, and False if not.
    
class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> ar = new ArrayList<>();
        int happy =0;
        while(n>0){
            ar.add(happy);
            happy =0;
            while(n>0){
                happy = happy + (n%10)*(n%10);
                n=n/10;
            }
            n = happy;
            if(n==1) return true;
            if(ar.contains(n)) return false;
        }
        return false;
    }
}
