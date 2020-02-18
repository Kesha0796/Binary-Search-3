class Solution {
    public int hIndex(int[] citations) {
        if(citations==null || citations.length==0)
            return 0;
        Arrays.sort(citations);
        int val=0;
        int diff=0;
        int n=citations.length;
        for(int i=0;i<n;i++)
        {
            val=citations[i];
            diff=n-i;
            if(val>=diff)
                return n-i;
        }
        return 0;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)