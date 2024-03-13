package manageCourses;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageCourse manageCourse = new ManageCourse();

        int option;
        do {
            System.out.println("""
                    
                    ....::::: OPTION MENU :::::.....
                        1. Manage courses.
                        2. Manage Students.
                        3. Exit.
                    """);
            option = scanner.nextInt();
            switch (option){
                case 1:
                    manageCourse.menu();
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Leaving...");
                    break;
            }
        } while (option != 3);
    }
}