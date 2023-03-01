public class Factors {
    public static void main(String args[]){
        int num=12;
        System.out.println("Factors of number are:");
        for(int i=1; i<=12; i++){
            if((num%i)==0){
                System.out.println(i);
            }
        }
    }
}
