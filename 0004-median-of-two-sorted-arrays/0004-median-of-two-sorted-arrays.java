class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int k[] = new int[m+n];
        for(int i=0;i<m;i++){
            k[i] = nums1[i];
        }
        for(int i=0;i<n;i++){
            k[m+i] = nums2[i];
        }
        Arrays.sort(k);
        int len = k.length;
        if(len%2==1){
            return k[len/2];
        }
        return ((double) k[len/2-1]+k[len/2])/2;
    }
}