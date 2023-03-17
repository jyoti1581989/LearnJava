public class Prime10013 {
    public static void main(String[] args){
       int num= 2;
        boolean isPrime = true;
        for( ; num<100; num++) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
            if(isPrime) {
                System.out.println("prime numbers in 1 to 100 are :" + num);
            }


        }
    }







