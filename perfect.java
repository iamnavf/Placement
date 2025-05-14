import java.util.Scanner;
class perfect{
public static void main(String []args){
Scanner scan=new Scanner(System.in);
	System.out.println("eneter the number");
	int a=scan.nextInt();
	int sum=0;
	int org=a;
	for(int i=1;i<a;i++){
	if(a%i==0){
	sum=sum+i;
}
}
if(org==sum){
System.out.print("it is perfect");
}
else{
System.out.print("it is not perfect");
}
}


}