public class fizzbuzz2 {
    public static void main(String[] args){
        int j = 1;
        while(j <= 100){
            j = doFizzBuzz(j);
        }
    }

    private static int doFizzBuzz(int j) {
        boolean dividedby3 = j % 3 == 0;
        boolean dividedby5 = j % 5 == 0;
        if(dividedby3 && dividedby5){
            System.out.println("FizzBuzz");
        }else if(dividedby3){
            System.out.println("Fizz");
        } else if (dividedby5) {
            System.out.println("Buzz");
        }else{
            System.out.println(j);
        }
        j++;
        return j;
    }
}
