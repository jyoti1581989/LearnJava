public class Average {
    public static void main(String args[]){
        int num[]={1,2,3,4,5,6};
        double avg=0;
       double total=0;
          for(int p=0; p<num.length; p++) {
              total = total + num[p];
          }
          avg = total = total/num.length;
        System.out.println("Average of the numbers is: "+avg);

        }
    }

