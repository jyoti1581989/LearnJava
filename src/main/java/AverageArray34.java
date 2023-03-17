public class AverageArray34 {
    public static void main(String args[]){
        int num[] ={4,2,7,9,3};
        int avg= 0;
        int total= 0;
        for (int p= 0; p<num.length; p++) {
            total = total + num[p];
        }
        avg = total/num.length;
        System.out.println("average of numbers in array :"+avg);
        }

    }

