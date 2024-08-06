package revison;

public class wave_print {
    public static void main(String[] args) {
        int [] [] arr = { { 1, 4, 7, 11, 15 }, 
        { 3, 6, 9, 16, 22 }, 
        { 10, 13, 14, 17, 24 },
        { 18, 21, 23, 26, 30 } };
        waveprint(arr);   
    }
    public static void waveprint(int[][] arr){
        for(int col = 0; col < arr.length; col++){
            if(col % 2 == 0){
                for(int row = 0; row < arr.length; row++){
                System.out.print(arr[row][col] + " ");
            }
        }
            else{
                for(int row = arr.length -1; row>=0; row--){
                   System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
    
}
