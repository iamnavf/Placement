import java.util.Scanner;
class palindromenote{
public static void main(String []args){
Scanner scan=new Scanner(System.in);
	System.out.println("eneter the number");
	int a=scan.nextInt();
int rem=0;
int rev=0;
int replace=a;
	for(;a>0;){
	rem=a%10;
rev=rev*10+rem;
a=a/10;
}

if(replace==rev){
System.out.print(rev+" "+"it is palindrome");
}
else{
System.out.print(rev+" "+a+" "+"it is not palindrome");
}
}

}