import java.util.Scanner;
class fibanoci{
public static void main(String []args){
Scanner scan=new Scanner(System.in);
	System.out.println("eneter the number");
	int a=scan.nextInt();
int num1=0,num2=1;
for(int i=0;i<=a;i++){
System.out.print(num1);
int num3= num1+num2;
num1=num2;
num2=num3;
}



}
}