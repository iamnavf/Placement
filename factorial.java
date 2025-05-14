import java.util.Scanner;
class factorial{
public static void main (String []args){
Scanner scan=new Scanner(System.in);
	System.out.println("eneter the number");
	int a=scan.nextInt();
	int sum=1;
for(int i=2;i<=a;i++){
sum*=i;
}
System.out.print(sum);

}

}