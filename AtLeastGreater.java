import java.util.*;
public class AtLeastGreater{


    public static void main(String[] args){
        int arr[]={1,5,7,8,2};

        Arrays.sort(arr);

        int n=arr.length;

        int k=n-2;

        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }


    }
}