public class convertFive {

    public static void main(String[] args){
        int n=0;

        if(n==0){
            System.out.println(5);
            return;
            
        }

        int result=0;
        int place=1;
        while(n>0){
            int digit=n%10;

            if(digit==0){
                digit=5;
            }

                result=result+digit*place;

                place=place*10;
                n=n/10;
            
        }

        System.out.println(result);
        

    }
    
}
