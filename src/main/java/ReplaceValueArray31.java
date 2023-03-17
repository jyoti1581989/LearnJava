public class ReplaceValueArray31 {
    public static void main(String args[]){
        int num[] = {1,2,3,4,5,6};
        int numToReplace = 3;
        for(int p= 0; p<num.length; p++ ) {
            if (numToReplace == num[p]) {
                num[p] = 9;
            }
                System.out.println(num[p]);

        }
    }
}
