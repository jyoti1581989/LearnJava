public class SearchNum {
    public static void main(String args[]) {
        int num[] = {34, 67, 81, 87, 45, 54, 90, 83};
        int gn = 54;
        boolean flage = false;

        for (int p = 0; p < num.length; p++)
            if (gn == num[p]) {
                flage = true;
                break;
            }
        if (flage)
            System.out.println("Given number in the list");
        else
            System.out.println("Given number is not in the list");

    }
}