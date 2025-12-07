class Solution {
    public int[] sortByReflection(int[] nums) {
        int[][] result = new int[nums.length][2];
        for(int i = 0 ; i < nums.length ; i++){
            int currNumber = nums[i];
            String bString = Integer.toBinaryString(currNumber);
            StringBuilder sb = new StringBuilder(bString);
            String reflection = sb.reverse().toString();
            int final_number = Integer.parseInt(reflection, 2);

            result[i][0] = currNumber;
            result[i][1] = final_number;
        }

        Arrays.sort(result, (a,b)->{
            if(a[1] != b[1]){
                return a[1] - b[1];
            }
            return a[0]-b[0];
        });

        int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = result[i][0];
        }
        return ans;
    }
}
