package lec43;

public class uncrossed_lines {
    public static void main(String[] args) {
        int [] nums1 =  {2,5,1,2,5}, nums2 = {10,5,2,1,5,2};
        System.out.println(lcsBu(nums1, nums2));
    }
    public static int lcsBu(int[] s1, int[] s2){
        int [] [] dp = new int [s1.length + 1][s2.length + 1];
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp.length; j++){
                if (s1[i - 1] == s2[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    int f = dp[i - 1][j];
                    int s = dp[i][j - 1];
                    dp[i][j] = Math.max(f, s);
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
            
        

    
    

