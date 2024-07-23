package Lab02;

import java.util.Scanner;

public class Marks{ 

    static int n; // Number of students
    static int[][] marks; // Marks array

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students
        System.out.print("Enter the number of students: ");
        n = scanner.nextInt();
        marks = new int[n][3]; // Initialize the marks array

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add student marks: add [studentID]");
            System.out.println("2. Update student mark: update [studentID] [subjectID]");
            System.out.println("3. Get the average for a subject: average_s [subjectID]");
            System.out.println("4. Get the average for a student: average [studentID]");
            System.out.println("5. Get the total mark of a student: total [studentID]");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.next();

            switch (choice) {
                case "add":
                    int studentID = scanner.nextInt() - 1;
                    addMarks(studentID, scanner);
                    break;

                case "update":
                    studentID = scanner.nextInt() - 1;
                    int subjectID = scanner.nextInt() - 1;
                    updateMark(studentID, subjectID, scanner);
                    break;

                case "average_s":
                    subjectID = scanner.nextInt() - 1;
                    System.out.println("Average mark for subject " + (subjectID + 1) + ": " + getAverageForSubject(subjectID));
                    break;

                case "average":
                    studentID = scanner.nextInt() - 1;
                    System.out.println("Average mark for student " + (studentID + 1) + ": " + getAverageForStudent(studentID));
                    break;

                case "total":
                    studentID = scanner.nextInt() - 1;
                    System.out.println("Total mark for student " + (studentID + 1) + ": " + getTotalMarkForStudent(studentID));
                    break;

                case "6":
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addMarks(int studentID, Scanner scanner) {
        System.out.println("Enter marks for student " + (studentID + 1) + " (Mathematics, Chemistry, Physics): ");
        for (int i = 0; i < 3; i++) {
            marks[studentID][i] = scanner.nextInt();
        }
    }

    public static void updateMark(int studentID, int subjectID, Scanner scanner) {
        System.out.print("Enter new mark for subject " + (subjectID + 1) + ": ");
        marks[studentID][subjectID] = scanner.nextInt();
    }

    public static double getAverageForSubject(int subjectID) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += marks[i][subjectID];
        }
        return (double) total / n;
    }

    public static double getAverageForStudent(int studentID) {
        int total = getTotalMarkForStudent(studentID);
        return (double) total / 3;
    }

    public static int getTotalMarkForStudent(int studentID) {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += marks[studentID][i];
        }
        return total;
    }
}
