class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(a[i]))
            mp.put(a[i],mp.get(a[i])+1);
            else
            mp.put(a[i],1);
            if(mp.get(a[i])==k)
            return a[i];
        }
        return -1;
    } 
}
