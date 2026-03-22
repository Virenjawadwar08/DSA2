public class leet1358 {
     public int numberOfSubstrings(String s) {
        int freq[]=new int[3];
        int ans=0;
        int start=0;

        for(int end=0;end<s.length();end++) {
            freq[s.charAt(end)-'a']++;

            while(freq[0]>=1 && freq[1]>=1 && freq[2]>=1) {
                ans+=(s.length()-end);
                freq[s.charAt(start)-'a']--;
                start++;
            }
        }
        return ans;
    }
}
