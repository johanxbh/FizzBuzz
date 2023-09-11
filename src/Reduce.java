public class Reduce {
    public static void main(String[] args) {
        int j = 0;
        int n = 100;
        while(n != 0){
            j = j + 1;
            if(n %2 == 0){
                n = n / 2;
            } else{
                n = n - 1;
            }
        }
        System.out.println(j);
    }
}
