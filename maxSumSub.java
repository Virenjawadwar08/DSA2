import java.util.*;

public class Solution {

    

    public  int kadane(int numbers[]) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        boolean allNegative=true;
        int maxElement=numbers[0];

        for(int i=0;i<numbers.length;i++) {
            cs=cs+numbers[i];

            if(numbers[i]>=0) {
                allNegative=false;
            }
            maxElement=Math.max(maxElement,numbers[i]);

            if(cs<0) {
                cs=0;
            }

            ms=Math.max(ms,cs);
        }
        if(allNegative) {
            return maxElement;
        } else {
            return ms;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int numbers[]=new int [n];
        for(int i=0;i<n;i++) {
            numbers[i]=sc.nextInt();
        }

        Solution sol=new Solution();

        System.out.println(sol.kadane(numbers));
        
    }
}