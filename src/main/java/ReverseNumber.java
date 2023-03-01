public class ReverseNumber {
    public static void main(String args[]){
      /*  int num = 1234;
        int reminder;
        int quotient;
        int m =0;
        while(num>0) {
            reminder = num % 10;
            quotient = num / 10;
            m = m * 10 + reminder;
            num = quotient;
        }
        System.out.print(m);
        */
      int num=1234,lastDigit,revers=0;
      while(num>0) {
          lastDigit = num % 10;
          revers = (revers * 10) + lastDigit;
          num = num / 10;

      }
          System.out.println(revers);

    }
}
