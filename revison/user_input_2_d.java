package revison;
import java.util.*;

public class user_input_2_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//row
        int m = sc.nextInt();//colume
        int [] [] arr = new int [n][m];
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Dispaly (arr);
    }

    private static void Dispaly(int[][] arr) {
        // TODO Auto-generated method stub
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]  + " ");
            }
            System.out.println();
        }

    }
    
}
