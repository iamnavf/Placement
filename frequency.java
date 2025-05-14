import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();
        
        String[] words = input.toLowerCase().split("\\W+");
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()) continue;
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = ""; // Mark as counted
                }
            }
            System.out.println(words[i] + ": " + count);
        }
    }
}