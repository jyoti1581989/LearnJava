public class EvenPosition {
    public static void main(String args[]) {
        int num[] = {34, 67, 81, 97, 45, 54, 90, 83};
        int p = 0;
        System.out.println("Even position numbers: ");
        while (p < num.length) {
            if ((p % 2) == 0) {
                System.out.println( num[p]);
            }
            p++;

        }


    }
}
