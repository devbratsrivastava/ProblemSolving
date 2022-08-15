class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long min=(long)(a.get(m-1)-a.get(0));
        for(int i=1;i<=n-m;i++)
        min=(long)Math.min(min,(a.get(i+m-1)-a.get(i)));
        return min;
    }
}
