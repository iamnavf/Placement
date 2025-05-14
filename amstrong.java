import java.lang.Math;
import java.util.*;
class amstrong{
	public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	System.out.println("eneter the number");
	int a=scan.nextInt();
int rem=0;
int org=a;
int tr=a;
int total=0;
int count=0;
for(;tr>0;){
tr=tr/10;
count++;
}
tr=a;

	for(;tr>0;){
	rem=tr%10;
	total+=Math.pow(rem,count);
	tr=tr/10;
	
}
if(total==org){
System.out.println("it is armstrong");
}
else{
System.out.println("it is not armstrong");
System.out.println(org);
System.out.println(total);

}


}
}