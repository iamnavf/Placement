import java.util.Scanner;
class Palindrome{
    public int reverse(int n){
        int a;
        int b=0;
        while(n>0){
            a=n%10;
            b=(b*10)+a;
            n=n/10;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner num= new Scanner (System.in);
        System.out.print("enter the num of element");
        int x =num.nextInt();
        
        Palindrome me=new Palindrome();
        int z= me.reverse(x);
        if(z==x){
            System.out.println("its palindrome"+z+":"+x);
        }
        else{
            System.out.println("its  not palindrome");
        }
    }

}