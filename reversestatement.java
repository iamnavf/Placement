import java.util.Scanner;
class reversestatement{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          System.out.println("Enter the Statement:");  
        String input = scan.nextLine();  
        StringBuilder rev = new StringBuilder();
        String[] arr = input.trim().split("\\s+"); 
        for (int i = arr.length - 1; i >= 0; i--) {
            rev.append(arr[i]);
            if (i != 0) {
                rev.append(" ");  
            }
            
        }
        System.out.println("Reversed text: " + rev.toString());  
    }
}
