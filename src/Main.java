// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Solution{
    public int findMaxConsecutiveOnes(int[] nums){
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] ==1){
                count++;
            }else{
                result = Math.max(result, count);
                count=0;
             }
        }
        return Math.max(result,count);
    }
}