package revison;

public class twod_array {
    public static void main(String[] args) {
        int [] [] arr= new int [3][4];
        System.out.println(arr);
        int [] [] other = arr;
        System.out.println(arr.length);//row ki length
        System.out.println(arr[0].length);//colume ki length
        System.out.println(arr[1][2]);
    }
    
}
