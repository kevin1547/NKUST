public class exercise {
    public static void main(String[] args) {
        int num = 20;
        int j;
        for(int i = 1; i <= 20; i++){
            j = num % i;
            if(j == 0){
                System.out.println(i);
            }
        }
    }
}
