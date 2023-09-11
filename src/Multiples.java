public class Multiples {
    public static void main(String[] args) {
        int j = 0;
        for(int i = 1; i < 1000; i++){
            boolean divided3 = i % 3 == 0;
            boolean divided5 = i % 5 == 0;
            if (divided3 || divided5){
                j ++;
            }

        }
        System.out.println(j);
    }
}
