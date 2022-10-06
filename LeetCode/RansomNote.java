class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<magazine.length();i++)
            a[magazine.charAt(i)-'a']++;
        for(int i=0;i<ransomNote.length();i++)
            b[ransomNote.charAt(i)-'a']++;

        for(int i=0;i<26;i++)
        {
            if(b[i]>a[i])
            return false;
        }
        return true;
    }
}
