public class SecondLargest {

    public static void main(String[] args){

        int nums[]={10,20,30,70,50,100,80};

        int largest=nums[0];
        int secondLargest=Integer.MIN_VALUE;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                secondLargest=largest;
                largest=nums[i];
            }

            if(nums[i]>secondLargest && nums[i]<largest){
                secondLargest=nums[i];
            }
        }
        System.out.println("Second Largest Number is :"+secondLargest);
    }
    
}
