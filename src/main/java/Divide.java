import javax.swing.*;

public class Divide {
    public static void main(String args[]){
        int num[]={34,67,81,97,45,54,90,83};
        int countOfTwo=0, countOfThree=0, countOfFive=0;

        for(int p=0; p<num.length; p++) {

            if ((num[p] % 2) == 0) {
                countOfTwo++;
            }
            if ((num[p] % 3) == 0) {
                countOfThree++;
            }
            if ((num[p] % 5) == 0) {
                countOfFive++;
            }
        }
        System.out.println("count of number divisible by 2: "+ countOfTwo);
        System.out.println("count of number divisible by 3: "+ countOfThree);
        System.out.println("count of number divisible by 5: "+ countOfFive);

    }
}
