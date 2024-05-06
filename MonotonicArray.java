public class MonotonicArray {
    public static int longestMonotonicSubarray(int[] nums) {
        int out1 = 1;
        int out2 = 1;
        int count1 = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                count1++;
            }else{
                if(count1 > out1){
                    out1 = count1;
                }
                count1 = 1;
            }
        }

        int count2 = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] < nums[i-1]){
                count2++;
            }else{
                if(count2 > out2){
                    out2 = count2;
                }
                count2 = 1;
            }
        }
        out1 = Math.max(out1,out2);
        count1 = Math.max(count1,count2);
        return Math.max(out1,count1);
    }

    public static void main(String[] args) {
        int[] nums = {3,22,18,20,36,17,42,33,25,35};
        System.out.println(longestMonotonicSubarray(nums));
    }
}
