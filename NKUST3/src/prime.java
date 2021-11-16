public class prime {
    public static void main(String[] args) {
        int a = 0;
        for(int i = 2; i <= 100; i++){
            for(int j = 1; j <= i; j++){
                a = i % j;
                if(a != 0 && j != 1){

                }
                System.out.println(i);
            }

        }
    }
}
