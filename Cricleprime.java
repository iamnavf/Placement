import java.util.*;

class method{
    public  static int reverse(int a){
        int b=0;
        int c;
        while(a>0)
        c=a%10;
        b=(b*10)+c;
        a=a/10;
        return b;
        }
}
class Cricleprime{
    public static void main(String[] args) {
        int n;
        Scanner num = new Scanner(System.in);
        System.out.print("eneter the number");
        n=num.nextInt();
        for(int i=2;i<n;i++){
            if(n%2==0){
            System.out.println("its not prime");
            break;
        }
        else{
            System.out.println("its prime");
            break;
        }
    }
    method obj=new method();
    int rev=obj.reverse(1193);
    System.out.println(rev);
    }
}