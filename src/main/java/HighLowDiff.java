public class HighLowDiff {
    public static void main(String args[]) {
        int num[] = {1, 15, -1, 23, 45, 70, 99, -13, -5};

        int max = 0;
        int min = 0;
        int position = 0;
        int diff;
        while (position < num.length) {

            if (num[position] > max)
                max = num[position];
            else if (num[position] < min)
                min = num[position];
            position++;
        }
        System.out.println("The highest number is:" + max);
        System.out.println("The lowest number is:" + min);

        diff = max - min;
        System.out.println("Difference between highest and lowest  number is:" + diff);
    }
}
