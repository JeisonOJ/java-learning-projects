package manageCourses;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageCourse manageCourse = new ManageCourse();
        boolean enterCourse = false;
        int option;
        do {
            System.out.println("""
                                        
                    ....::::: OPTION MENU :::::..... 
                        1. Manage courses.
                        2. Manage student subscriptions for courses..
                        3. Exit.
                        
                    """);
            option = scanner.nextInt();
            if (option==2){
                //if option is a number 2, clear buffer, because option 2 already has other nextline.
                scanner.nextLine();
            }

            switch (option) {
                case 1:
                    manageCourse.menu();
                    break;
                case 2:
                    Course course = new Course();
                    int option2;

                    do {
                        while (!enterCourse){
                            System.out.println("\nFirst, enter the course to manage students.\nPRESS ENTER TO CONTINUE");
                            scanner.nextLine();
                            System.out.println("...:: Searching course ::...");
                            System.out.print("enter code course: ");
                            String courseFounded = scanner.nextLine();
                            if (manageCourse.searchCourseByCode(courseFounded) != null) {
                                course = manageCourse.searchCourseByCode(courseFounded);
                                enterCourse = true;
                            } else {
                                System.out.println("There are no course with this code");
                            }
                        }


                        System.out.println("""
                                                    
                                ....::::: Course subscriptions :::::.....
                                    1. Add student.
                                    2. Remove student.
                                    3. Show students.
                                    4. Exit.
                                    
                                """);
                        option2 = scanner.nextInt();

                        switch (option2) {
                            case 1:
                                course.addStudent(scanner);
                                break;
                            case 2:
                                course.removerStudent(scanner);
                                break;
                            case 3:
                                scanner.nextLine();
                                course.showStudents();
                                break;
                            case 4:
                                System.out.println("Leaving Manage Students...");
                                enterCourse = false;
                                break;

                        }

                    } while (option2 != 4);
                    break;
                case 3:
                    System.out.println("Leaving Program...");
                    break;
            }
        } while (option != 3);
    }
}