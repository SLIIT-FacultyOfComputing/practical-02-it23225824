
import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter the number of students: ");
    
    int n = scanner.nextInt(); 
    
    int[][] matrix = new int[n][4];
    
    System.out.println("Student ID Col 0, Maths Col 1, Chemistry Col 2, Physics Col 3 \n");
    
     for (int i=0; i<matrix.length; i++) {
      for (int j=0; j<1; j++) {
        System.out.println("Enter the ID :");
        matrix[i][j] = scanner.nextInt();
 
      }
      System.out.println("Enter the marks Maths,Chemistry and Physics in order:");
      for (int j=1; j<4; j++){
      
      System.out.println("Enter the marks :");
      matrix[i][j] = scanner.nextInt();
      }
       System.out.println("\n");
     }

    System.out.println("\n");
    System.out.println("Stu ID   Maths  Chemistry Physics \n");

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.printf("%d        ", matrix[i][j]);
        }
        System.out.println("\n");
    }

    System.out.println("\n");

    System.out.println("Maths Col 1, Chemistry Col 2, Physics Col 3 \n");

    System.out.println("Enter the column number of the subject which average need to be found:");
    int column = scanner.nextInt();

    double total = 0;

    for (int i=0; i<matrix.length; i++) {
      for (int j=column; j<column+1; j++) {
        total = total + matrix[i][j];
      }
    }

    System.out.println("\n");
    
    double average_s = total/n;
    System.out.println("The average of the subject is: \n" + average_s);
    
    System.out.println("\n");
    System.out.println("Enter the ID number of the student which average need to be found:");
    int ID = scanner.nextInt();

    double totalStu =0;
    for (int i=ID-1; i<ID; i++){
      for (int j=1; j<matrix[i].length; j++){
        
        totalStu = totalStu + matrix[i][j];
      }
    }

    System.out.println("\n");

    double average_stu = totalStu/3;
    System.out.println("The average of the student is: \n" + average_stu);
    System.out.println("\n");

    System.out.println("The total of the student is: \n" + totalStu);
    System.out.println("\n");


    System.out.println("Enter the student ID of the student which the grade need to be found: ");
    int Stud = scanner.nextInt();

    System.out.println("\n");
    
    System.out.println("Stu ID   Maths  Chemistry Physics \n");

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.printf("%d        ", matrix[i][j]);
        }
        System.out.println("\n");
    }

    System.out.println("\n");
    System.out.println("Maths Col 1, Chemistry Col 2, Physics Col 3 \n");
    System.out.println("\n");

    System.out.println("Enter the Column number of the subject grade need to be found:");
    int SubCol = scanner.nextInt();

    if(matrix[Stud-1][SubCol] >= 90)
       System.out.println("The grade is A");
     else if(matrix[Stud-1][SubCol] >= 80 )
       System.out.println("The grade is B");
      else if(matrix[Stud-1][SubCol] >= 70 )
        System.out.println("The grade is C");
       else if(matrix[Stud-1][SubCol] >= 60 )
         System.out.println("The grade is D");
        else 
          System.out.println("The grade is Fail");
       
    
    scanner.close();
  }

  
}

