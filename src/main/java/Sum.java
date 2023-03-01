public class Sum {
    public static void main(String args[]){
        int num=4356,sum=0;
        while(num>0) {
           int quotient= num/10;
           int remainder= num%10;
           sum= sum + remainder ;
           num= quotient;
        }
        System.out.println("sum of 4+3+5+6 = "+sum );
    }
}
