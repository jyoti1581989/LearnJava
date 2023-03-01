public class SearchNum2 {
    public static void main(String args[]) {
        int num[] = {34, 67, 81, 87, 45, 54, 90, 83};
        int givenNum = 40;
        boolean foundForty = false;
        for (int p = 0; p < num.length; p++) {
            if (givenNum == num[p]) {
                foundForty = true;
                break;
            }
        }
        if (foundForty)
            System.out.println("Given number is in the list");
        else
            System.out.println("Given number is not in the list");
    }
}
