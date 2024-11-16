class Solution {
    void pushZerosToEnd(int[] arr) {
        int n=arr.length;
        int l=0,r=1;
            while(r<n){
                if(arr[l]==0 && arr[r]!=0)
                    {
                        int temp=arr[l];
                        arr[l]=arr[r];
                        arr[r]=temp;
                        l++;
                    }
                else if(arr[l]!=0)
                    {
                        l++;
                    }
                 r++;
         }
    }
}
