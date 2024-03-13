package manageCourses;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        ManageCourse manage = new ManageCourse();
        int option;
        do {
            System.out.println("""
                    
                    ....::::: Creating course :::::.....
                        1. Add student.
                        2. Remove student.
                        3. Show students.
                        4. Exit.
                    """);
            option = scanner.nextInt();

            switch (option){
                case 1:
                    scanner.nextLine();
                    System.out.println("...:: Searching course ::...");
                    System.out.print("enter code course: ");
                    String courseFounded = scanner.nextLine();
                    if (manage.searchCourseByCode(courseFounded) != null){
                        Course course = manage.searchCourseByCode(courseFounded);
                        course.addStudent(scanner);

                    }else {
                        System.out.println("There are no course with this code");
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Leaving...");
                    break;

            }

        }while (option!=4);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nIdentification: "+id+"\nStudent name: "+ name +"\nEmail: "+email;
    }
}
