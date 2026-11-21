public class MissNumber {
    public static void main(String[] args){
        int nums[]={1,2,3,4,6,7,8};

        int n=nums.length+1;
        int total=(n*(n+1))/2;

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];

        }
        int missNumber=total-sum;

        System.out.println("Missing Number is :"+missNumber);

    }
}
