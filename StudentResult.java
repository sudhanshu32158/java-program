import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mathematics marks: ");
        String mathInput = sc.nextLine();

        System.out.print("Enter Computer Science marks: ");
        String csInput = sc.nextLine();

        System.out.print("Enter English marks: ");
        String englishInput = sc.nextLine();

        System.out.print("Enter attendance percentage: ");
        String attendanceInput = sc.nextLine();

        // Convert String into numeric values
        int math = Integer.parseInt(mathInput);
        int cs = Integer.parseInt(csInput);
        int english = Integer.parseInt(englishInput);

        double attendance = Double.parseDouble(attendanceInput);

        // Calculate total and average
        int total = math + cs + english;
        double average = total / 3.0;

        // Determine result
        String result;

        if (math < 40 || cs < 40 || english < 40) {
            result = "Fail";
        } else {
            result = "Pass";
        }

        // Check scholarship eligibility
        String scholarship;

        if (average >= 85 && attendance >= 75) {
            scholarship = "Eligible";
        } else {
            scholarship = "Not Eligible";
        }

        // Output
        System.out.println("Student: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + result);
        System.out.println("Scholarship: " + scholarship);

        sc.close();
    }
}