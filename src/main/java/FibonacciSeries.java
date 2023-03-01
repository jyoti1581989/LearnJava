public class FibonacciSeries {
    public static void main(String args[]){
        int num1 = 0,num2 = 1,num3 =0,n=10;
        for(int i=1; i<n; i++) {
            num3= num1 + num2;
            num1= num2;
            num2= num3;
            System.out.println(num3);
        }


    }
}
