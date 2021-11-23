
import java.util.ArrayList;
/*
public class text {
    public static void main (String[] args) {
       System.out.println(revHash(6933552791181934L));
        System.out.println(hash("justdoit")); //574318821802
    }

    public static String letters = "cdefghijlmnoqstuvxz";

   public static String[] revHash(long hash) {
       double b;
       int e = 0;
       String[] count = {};
       long a = hash;
       //while (a <= 7) {

           for (int j = 0; j < 18; j++) {
               b = (a - j) % 23;
               if (b == 0) {
                   count[e] = "j";
                   a = (a - j) / 23;
                   System.out.println(a);

               }
          // e = e + 1;
           }
       //}
       return count;
   }

    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}
        */


public class text {
    public static String letters = "cdefghijlmnoqstuvxz";
    public static void main(String[] args) {
        int e = 0 , k = 0;
        double b;
        long a = 6933552791181934L;
        char[] count = {};
            for (int j = 0; j <= 18; j++) {
                b = (a - j) % 23;
                if (b == 0) {
                    a = (a - j) / 23;

                    System.out.println(j);
                    System.out.println(a);
                    System.out.println(letters.charAt(j));
                    //count[e] = letters.charAt(j);
                    //System.out.println(count[0]);
                    j = 0;
                    //e++;
                    k++;
                }
                b = (a - j) % 23;
                if (b == 0) {
                    a = (a - j) / 23;
                    System.out.println(j);
                    System.out.println(a);
                    System.out.println(letters.charAt(j));
                    //count[e] = letters.charAt(j);
                    j = 0;
                   // e++;
                    k++;
                }
                if(a <= 7){
                    break;
                }
            }
    }
}