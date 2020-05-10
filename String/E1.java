You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:

direction can be 0 (for left shift) or 1 (for right shift). 
amount is the amount by which string s is to be shifted.
A left shift by 1 means remove the first character of s and append it to the end.
Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
Return the final string after all operations.

 
class Solution {
  public String stringShift(String string, int[][] shift) {
    int len = string.length();
    for (int[] move : shift) {
      int direction = move[0];
      int amount = move[1] % len;
      if (direction == 0) {
        // Move necessary amount of characters from front to end 
        string = string.substring(amount) + string.substring(0, amount);
      } else {
        // Move necessary amount of characters from end to front
        string = string.substring(len - amount) + string.substring(0, len - amount);
      }
    }
    return string;
  }
}
