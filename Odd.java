import java.util.Scanner;
class Odd{
public static void main(String []args){
Scanner scan=new Scanner(System.in);
System.out.println("eneter the number");
int a=scan.nextInt();
if(a%2!=0){
	System.out.print(a+" "+"its odd");
}
else{
System.out.print("its even");
}
}
}