 import java.util.Scanner;

 class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

      
        String uppercase = input.toUpperCase();
        System.out.println("Uppercase string: " + uppercase);

       
        StringBuffer buffer = new StringBuffer(input);
        String reversed = buffer.reverse().toString();
        System.out.println("Reversed string: " + reversed);

       
        System.out.print("Enter a character to count: ");
        char targetChar = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                count++;
            }
        }
        System.out.println("Number of occurrences of " + targetChar + ": " + count);

        scanner.close();
    }
}
