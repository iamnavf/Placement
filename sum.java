import java.util.Scanner;
class sum{
public static void main(String []args){
Scanner scan=new Scanner(System.in);
	System.out.println("eneter the number");
	int a=scan.nextInt();
	int rem=0;
	int sum=0;
	for(;a>0;){
	rem=a%10;
	sum=sum+rem;
	a=a/10;

}
System.out.print(sum);
}

}