import java.util.Scanner;

public class App {

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the marks in each subject out of 100:");
       int math = input.nextInt();
       int science = input.nextInt();
       int english = input.nextInt();
       int total = math + science + english;
       double average = (double) total / 3;
       String grade;
       if (average >= 90) {
           grade = "A";
       } else if (average >= 80) {
           grade = "B";
       } else if (average >= 70) {
           grade = "C";
       } else if (average>= 60) {
           grade = "D";
       } else {
           grade = "F";
       }

       // Display the result
       System.out.println("Total marks: " + total);
       System.out.println("Average percentage: " + average);
       System.out.println("Grade: " + grade);
   }
}
