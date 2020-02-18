class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        if(citations==null || citations.length==0)
            return 0;
        int low=0;
        int val=0;
        int diff=0;
        int high=citations.length-1;
        int n=citations.length;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            val=citations[mid];
            diff=n-mid;
            if(val==diff)
                return val;
            else if(val<diff)
                low=mid+1;
            else
                high=mid-1;
                
        }
        
        return n-low;
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(1)