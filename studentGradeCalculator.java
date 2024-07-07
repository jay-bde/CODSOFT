/*
 Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the use
 */
import java.util.Scanner;

public class studentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[] totalMarks = new int[numberOfStudents];
        int[] averagePercentage = new int[numberOfStudents];
        char[] grade = new char[numberOfStudents];
        String[] names = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the name of the student: ");
            String name = input.next();
            names[i] = name;
            int sum = 0;
            System.out.println("Enter the number of subjects: ");
            int numberOfSubjects = input.nextInt();
            System.out.println("Enter the marks of the subject: ");
            for (int j = 0; j < numberOfSubjects; j++) {
                int marks = input.nextInt();
                sum += marks;
            }
            totalMarks[i] = sum;
            averagePercentage[i] = sum / numberOfSubjects;
            if (averagePercentage[i] >= 90 && averagePercentage[i] <= 100) {
                grade[i] = 'S';
            } else if (averagePercentage[i] >= 80 && averagePercentage[i] <= 89) {
                grade[i] = 'A';
            } else if (averagePercentage[i] >= 70 && averagePercentage[i] <= 79) {
                grade[i] = 'B';
            } else if (averagePercentage[i] >= 60 && averagePercentage[i] <= 69) {
                grade[i] = 'C';
            } else if (averagePercentage[i] >= 50 && averagePercentage[i] <= 59) {
                grade[i] = 'D';
            } else if (averagePercentage[i] >= 40 && averagePercentage[i] <= 49) {
                grade[i] = 'E';
            } else {
                grade[i] = 'F';
            }
        }
        input.close();
        System.out.println("The details of the students are: ");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Total Marks: " + totalMarks[i]);
            System.out.println("Average Percentage: " + averagePercentage[i]);
            System.out.println("Grade: " + grade[i]);
        }
    }
}


