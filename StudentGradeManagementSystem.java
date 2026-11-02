import java.util.Scanner;

public class StudentGradeManagementSystem {
    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in);

        //Create parallel arrays for student information
        String[] studentNames = new String[50];
        int[] studentGrades = new int[50];

        //Keep count of the number of students
        int studentCount = 0;

        //Store the users menu choice
        int choice;

        //Display welcome message
        System.out.println("Welcome to the Student Grade Management System.");

        do {

            //Display the menu choices
            System.out.println("\n----- MAIN MENU -----");
            System.out.println("1. Add Student and Grade");
            System.out.println("2. Display All Students and Grades");
            System.out.println("3. Find a Student's Grade");
            System.out.println("4. Calculate Class Average");
            System.out.println("5. Find Highest and Lowest Grades");
            System.out.println("6. Exit");

            //Ask user for menu selection
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            //Use a switch statement to determine which choice the user made
            switch (choice) {
                case 1: 
                    //ADD STUDENT AND GRADE
                    //Check if there is room in the arrays

                    //Ask user for student name and grade

                    //Make sure the grade is between 0 and 100(Make them reenter if not)

                    //Store the student information in the array

                    //Increment the student count
                
                    break;

                case 2: 
                    //DISPLAY STUDENTS AND GRADES

                    //Make sure the student exists

                    //Loop through the arrays to display all the records
                    break;

                case 3:
                    //FIND A STUDENTS GRADE

                    //Ask the user for the students name

                    //Search through the studentNames array

                    //Display grade if student is found

                    //If the student is not found, display a student not found message

                    break;

                case 4:
                    //CLASS AVERAGE

                    //Add together all of the grades

                    //Divide the sum by the studentCount

                    //Display the class average
                    break;

                case 5:
                    //HIGHEST AND LOWEST GRADES

                    //Comapre all of the grades using a loop

                    //Identify the highest and lowest with a loop

                    //Display to the user what the highest and lowest grades are

                    break;
                
                case 6:
                    //EXIT PROGRAM
                    System.out.println("Thank you for using the Student Grade Management System!");
                    break;

                default:
                    //Invalid menu choice
                    System.out.println("Invalid choice! Please select 1-6.");
            }
        }while (choice != 6); //This causes the menu to repeat until the user decides to exit
    }
}
