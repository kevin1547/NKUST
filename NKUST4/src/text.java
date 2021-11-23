public class text {
    public static void main (String[] args) {
        System.out.println(revHash(6933552791181934L));
        System.out.println(hash("justdoit")); //574318821802
    }

    public static String letters = "cdefghijlmnoqstuvxz";

   public static String revHash(long hash) {
       double b;
       //char result = hash.charAt(0);
       String t ="000";
       long a = hash;
       for (int j = 0; j < 18; j++){
           b = ( a - j ) % 23;
           if( b == 0){
               System.out.println(j);
           }

       }
       return t;
    }

    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}
