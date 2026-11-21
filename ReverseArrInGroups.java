public class ReverseArrInGroups {
    public static void main(String[] args){

       int arr[]={1,2,3,4,5};
       int k=3;
       int left=0;
       int n=arr.length;
       int right=Math.min(n-1,k-1);

       while(left<n){
        for(int i=right;i>=left;i--){
            System.out.print(arr[i]+" ");
        }
        left += k;
        right=Math.min(n-1,right+k);
       }


    }
}
