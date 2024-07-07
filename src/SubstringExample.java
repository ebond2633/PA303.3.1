import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String s = scanner.nextLine();

        // Read the start and end indices
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // Get the substring from start to end - 1
        String substring = s.substring(start, end);

        // Print the substring
        System.out.println(substring);

        scanner.close();
    }
}

