import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Details:");

        int rollNo; 
        String name;
        int mark1, mark2, mark3, mark4, mark5, mark6;

        System.out.print("Roll No: ");
        rollNo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.println("Enter Marks (out of 100):");

        System.out.print("English : ");
        mark1 = scanner.nextInt();

        System.out.print("Hindi : ");
        mark2 = scanner.nextInt();

        System.out.print("Marathi : ");
        mark3 = scanner.nextInt();

        System.out.print("Science : ");
        mark4 = scanner.nextInt();

        System.out.print("Maths : ");
        mark5 = scanner.nextInt();

        System.out.print("SS : ");
        mark6 = scanner.nextInt();

        int totalMarks = mark1 + mark2 + mark3 + mark4 + mark5 + mark6; 
        double percentage = (double) totalMarks / 600 * 100; 

        System.out.println("\nGrade Report:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%"); 

        String grade;
        if (percentage >= 90) {
            grade = "A++";
        } else if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 70) {
            grade = "B++";
        } else if (percentage >= 60) {
            grade = "B+";
        } else if (percentage >= 50) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade: " + grade);

        scanner.close(); 
    }
}
