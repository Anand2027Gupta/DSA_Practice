public class Reverse {

    public static void main(String[] args){

        int nums[]={10,20,30,40,50};

        System.out.println("Original Array is :");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

        System.out.println("\nReversed Array is :");
        for(int i=nums.length-1;i>=0;i--){
            System.out.print(nums[i]+" ");
        }
    }
    
}
