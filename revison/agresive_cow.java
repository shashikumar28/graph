package revison;
import java.util.*;

public class agresive_cow {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();//no of stall
      int noc = sc.nextInt();//no of cows
      int [] stall = new int[n];
      for(int i=0; i<stall.length; i++) {
        stall[i] = sc.nextInt();//stall ki position wali input	
      }
      Arrays.sort(stall);//sort kr diya arr ko 
      System.out.println(largest_distance(stall,noc));
    }
    public static int largest_distance(int[] stall, int noc) {
      int low =0;
      int high = stall[stall.length-1] - stall[0];// last position - first position
      int ans = 0;
      while(low<=high) {
        int mid = (low+high)/2;
        if(isitpossible(stall, noc, mid)) {
          ans=mid;
          low=mid+1;	
        }
        else {
          high = mid -1;	
        }
      }
      return ans;	
    }
    public static boolean isitpossible (int[] stall, int noc,int mid) {
      int cow = 1;
      int pos = stall[0];
      
      for(int i=1; i<stall.length; i++) {
        if(stall[i] - pos>=mid) {
          cow++;
          pos = stall[i];	
        }
        if(cow == noc) {
          return true;
        }	
      }
      return false;
    }
}
