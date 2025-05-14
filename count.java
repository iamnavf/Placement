import java.util.*;
class amstrong{
	public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	System.out.println("eneter the number");
	int a=scan.nextInt();
int count=0;
for(;a>0;){
a=a/10;
count++;
}
System.out.println(count);
}
}