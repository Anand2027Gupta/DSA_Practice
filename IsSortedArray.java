public class IsSortedArray {
    public static void main(String[] args){

        int nums[]={10,20,30,40,50};

        boolean isSorted=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is Sorted");

        }
        else{
System.out.println("Array is not Sorted");
        }
    }
}
