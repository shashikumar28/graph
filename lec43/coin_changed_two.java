package lec43;
import java.util.*;

public class coin_changed_two {
    public static void main(String[] args) {
        int amount = 5;
        int [] coin = {1, 2, 5};
        int [] [] dp = new int [amount + 1][coin.length];
        for(int [] a : dp){
            Arrays.fill(a, -1);
        }
        System.out.println(Count(coin, amount, 0, dp));
        System.out.println(CountBU(coin, amount));

    }
    public static int CountBU(int [] coin, int amount){
int [] [] dp = new int [coin.length + 1][amount + 1];
for(int i =0; i < dp.length; i++){
    dp[i][0] =1;

}
for(int i= 1; i < dp.length; i++){
    for(int am = 1; am < dp[0].length; am++){
        int inc = 0, exc = 0;
        if(am >= coin[i - 1]){
            inc = dp[i] [am - coin[i-1]];
        }
        exc = dp[i - 1][am];
        dp[i][am] = inc + exc;
    }
}
return dp[dp.length -1] [dp[0].length - 1];
    }
    public static int Count(int [] coin, int amount, int i, int [][] dp){
        if(amount == 0){

            return 1;
        }
        if(i == coin.length){
            return 0;
        }
        int inc=0, exc=0;
        if(amount >= coin[i]){
            inc = Count(coin, amount - coin[i] + 1, exc, dp);
        }
        exc = Count(coin, amount, i + 1, dp);
        return dp[amount] [i] =  inc  + exc;
    }
    
}
