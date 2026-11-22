public class GetMoreAndLess {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=0;

        int count1=0;
        int count2=0;
        int []nums={0,0};

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=target){
                count1++;

            }

            if(arr[i]>=target){
                count2++;
            }
        }
        nums[0]=count1;
        nums[1]=count2;


        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
