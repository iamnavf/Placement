import java.util.Scanner; 
class reverse{
public static void main(String []args){
Scanner scan=new Scanner(System.in);
	System.out.println("eneter the number");
	int a=scan.nextInt();
	int rem=0;
	int rev=0;
	for(;a>0;){
	rem=a%10;
	rev=rev*10+rem;
	a=a/10;
}
System.out.print(rev);
}

}