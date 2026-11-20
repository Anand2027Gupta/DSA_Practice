public class ZeroesToEnd {
    public static void main(String[] args){

        int nums[]={10,0,30,0,50,0,70};

        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        while(count<nums.length){
            nums[count++]=0;
        }
        System.out.println("Array after moving zeros to end:");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}

