public class ReverseArrInGroups2 {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int k=3;
        int n=arr.length;
        int left=0;
        int right=Math.min(n-1,k-1);

        while(left<n){
            int l=left;
            int r=right;
            while(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;

                l++;
                r--;

            }



            left += k;
            right=Math.min(n-1,right+k);

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
