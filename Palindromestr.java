public class Palindromestr {

    public static void main(String[] args) {
        strbuilder m=new strbuilder();
        m.builder("saas laal");
    }
}

class strbuilder{

    public void builder(String s){

        StringBuilder s1 = new StringBuilder(s);

        
        s1.reverse();
        if (s.equals(s1.toString())) {
            System.out.println("\"" + s + "\" is a palindrome string.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome string.");
        }

    }
}
class strbuffer extends strbuilder{
     public void builder(String s){
        super.builder(s);
         StringBuffer s1 = new StringBuffer(s);

        
        s1.reverse();
        if (s.equals(s1.toString())) {
            System.out.println("\"" + s + "\" is a palindrome string.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome string.");
        }
}
}