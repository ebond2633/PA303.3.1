public class StringOperations {
    public static void main(String[] args) {
        String A = "hello";
        String B = "world";

        // Sum the lengths of A and B
        int sumLengths = A.length() + B.length();
        System.out.println("Sum of lengths: " + sumLengths);

        // Determine if A is lexicographically larger than B
        boolean isALarger = A.compareTo(B) > 0;
        System.out.println("A is lexicographically larger than B: " + isALarger);

        // Capitalize the first letter in A and B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println("Capitalized strings: " + capitalizedA + " " + capitalizedB);
    }
}

