import java.util.Scanner;

public class Question1{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: String Concatenation
        // Prompt the user to enter their first name, middle name, and last name separately.
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
       
        System.out.println("Enter your middle name:");
        String middleName = scanner.nextLine();
       
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();
       
        // Concatenate these strings to create a full name in the format: "Last Name, First Name Middle Name".
        String fullName = lastName + ", " + firstName + " " + middleName;
       
        // Display the concatenated full name.
        System.out.println("Full Name: " + fullName);

        // Part 2: String Comparison
        // Prompt the user to enter another full name.
        System.out.println("Enter another full name:");
        String anotherFullName = scanner.nextLine();
       
        // Compare this new full name with the previously concatenated full name (case-insensitive).
        if (fullName.equalsIgnoreCase(anotherFullName)) {
            // Display a message indicating that the names are the same.
            System.out.println("The names are the same.");
        } else {
            // Display a message indicating that the names are different.
            System.out.println("The names are different.");
        }

        // Part 3: String Modification
        // Replace all occurrences of 'a' with '@' and 'e' with '3' in the concatenated full name.
        String modifiedFullName = fullName.replace('a', '@').replace('e', '3');
       
        // Convert the entire full name to uppercase.
        modifiedFullName = modifiedFullName.toUpperCase();
       
        // Display the modified full name.
        System.out.println("Modified Full Name: " + modifiedFullName);

        // Part 4: String Splitting
        // Split the concatenated full name into individual components (Last Name, First Name, Middle Name).
        String[] nameComponents = fullName.split(",\\s|\\s");
       
        // Display each component separately.
        System.out.println("Last Name: " + nameComponents[0]);
        System.out.println("First Name: " + nameComponents[1]);
        if (nameComponents.length > 2) {
            System.out.println("Middle Name: " + nameComponents[2]);
        } else {
            System.out.println("Middle Name: (none)");
        }

        // Part 5: String Trimming
        // Prompt the user to enter a string with leading and trailing spaces.
        System.out.println("Enter a string with leading and trailing spaces:");
        String stringWithSpaces = scanner.nextLine();
       
        // Trim the spaces from the string and display the trimmed string.
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: " + trimmedString);

        // Part 6: Additional Manipulations
        // Count the number of vowels (a, e, i, o, u) in the concatenated full name.
        int vowelCount = 0;
        for (char ch : fullName.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
       
        // Display the number of vowels found.
        System.out.println("Number of vowels in the full name: " + vowelCount);

        scanner.close();
    }
}



