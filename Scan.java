import java.util.Scanner;
class Scan{
    public static void main(String[] args) {
        Scanner num= new Scanner (System.in);
        System.out.print("enter the num of element");
        int n =num.nextInt();
        System.out.println(n);
	Scanner.close();
    }
}