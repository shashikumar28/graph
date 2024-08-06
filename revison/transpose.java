package revison;

public class transpose {
    public static void main(String[] args) {
  int[] [] arr =  {{1,2,3,4},
  {7,8,9,6}, 
  {3,11,15,16}, 
  {10,12,13,14}};
  transpos(arr);
  for(int i = 0; i < arr.length; i++){
  for(int j =0; j < arr[0].length; j++){
    System.out.print(arr[i][j]+" ");
  }
  System.out.println();
  }
   
    } 
    public static void transpos(int [] []arr) {
     for(int i = 0; i < arr.length; i++){
        for(int j = i + 1; j < arr[0].length; j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp; 
        }
     }
    }
}
