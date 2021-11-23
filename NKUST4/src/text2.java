import java.util.HashSet;
import java.util.ArrayList;

public class text2 {
    public static void main(String[] args) {
       /* int[] num1 = {0,0,1,1,1,2,2,3,3,4};
        String b = "_";
        int a;
        a = num1.length;
        for(int i = 0; i <= a; i++){
            for(int j = 0; j <= a; j++){
                if( i == num1[j] ){
                    System.out.println(j);
                }
            }
        }*/
        HashSet<String> num = new HashSet<String>();
        num.add("0");
        num.add("0");
        num.add("1");
        num.add("1");
        num.add("1");
        num.add("2");
        num.add("2");
        num.add("3");
        num.add("3");
        num.add("4");
        System.out.println(num);

        String a = "_";
        String[] num1 = {"0" , "0", "1" , "1" , "1" , "2" , "2" , "3" , "3" , "4"};

        System.out.println(num.size());
        System.out.println(num1.length);

    }

}
