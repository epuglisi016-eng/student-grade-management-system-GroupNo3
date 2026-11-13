import java.util.Scanner;

public class StudentGradeManagementSystem {

    //ADD STUDENT AND GRADE
    public static int addStudent(Scanner input, String[] names, int[] grades, int count) {
        //Check if the array is full
        
        //Ask for student name

        //Ask for student grade

        //Validate grade input (is an int and between 0-100)

        //Store the student grades in array

        //Increase student count and display successful message

    }

    //DISPLAY STUDENTS AND GRADES
    public static void displayStudents(String[] names, int[] grades, int count) {
        //Check if there are students

        //Display each students information


    }
    //FIND A STUDENTS GRADE
    public static void findStudent(Scanner input, String[] names, int[] grades, int count) {
        //Check if there are students

        //Ask for students name

        //Search for student in the array

        //Display a message if student is not found
    }
    //CLASS AVERAGE
    public static void calculateAverage(int[] grades, int count) {
        //Check if there are students

        //Add all of the grades together

        //Divide that number by the amount of students within the array
    }
    //HIGHEST AND LOWEST GRADES
    public static void findHighestLowest(String[] names, int[] grades, int count) {
        //Check if there are students

        //Assume the first student has the highest and lowest grade

        //Compare all of the students in order to find the true highest and lowest

        //Display the highest and lowest grades
    }
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
                    //assigns the updated student count from add student back into studentCount in the main method
                    studentCount = addStudent(input, studentNames, studentGrades, studentCount);
                    break;

                case 2: 
                    //DISPLAY STUDENTS AND GRADES
                    displayStudents(studentNames, studentGrades, studentCount);
                    break;

                case 3:
                    //FIND A STUDENTS GRADE
                    findStudent(input, studentNames, studentGrades, studentCount);
                    break;

                case 4:
                    //CLASS AVERAGE
                    calculateAverage(studentGrades, studentCount);
                    break;

                case 5:
                    //HIGHEST AND LOWEST GRADES
                    findHighestLowest(studentNames, studentGrades, studentCount);
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
