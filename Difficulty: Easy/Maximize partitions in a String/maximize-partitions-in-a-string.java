//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.maxPartitions(s);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxPartitions(String s) {
        // code here
      int i = 0, j = 0, k = 0; 
      int c = 0, r = 0; 
      HashMap<Character, Integer> m = new HashMap<>(); 
      for (i = s.length() - 1; 
           i >= 0; i--) 
      {
        if (!m.containsKey(s.charAt(i))) 
        { 
          m.put(s.charAt(i), i);
        } 
      } 
     
      i = 0; 
      k = m.get(s.charAt(i)); 
     
      for (i = 0; i < s.length(); i++) 
      {
        if (i <= k) 
        { 
          c = c + 1; 
          k = Math.max(k, m.get(s.charAt(i))); 
        } 
        else
        {
          r = r + 1; 
          c = 1; 
          k = Math.max(k, m.get(s.charAt(i))); 
        } 
      } 
      if (c != 0) 
      { 
        r = r + 1; 
      } 
      return r; 
    }
}