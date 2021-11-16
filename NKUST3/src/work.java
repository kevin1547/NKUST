public class work {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int j ;
        for(int i = 1; i <= 100; i++){
            j = i % (3 * 7);
            if(j == 0){
                System.out.println(i);
            }
        }
    }
}
