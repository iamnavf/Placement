import java.util.*;
class Gcd{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	System.out.println("eneter the number");
	int a=scan.nextInt();
	System.out.println("eneter the number");
	int b=scan.nextInt();
int val=0;
	int lar= a>b?a:b;
	for(int i=1;i<=lar;i++){
	if(a%i==0&&b%i==0){
		val=i;
}

}
System.out.print(val);

	

}
}