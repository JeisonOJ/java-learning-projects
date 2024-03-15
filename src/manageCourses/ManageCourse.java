package manageCourses;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageCourse {
    private ArrayList<Course> courseList;

    public ManageCourse() {
        courseList = new ArrayList<>();
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("""
                    
                    ....::::: Creating course :::::.....
                        1. Create course.
                        2. Search course by code.
                        3. Show courses.
                        4. Exit.
                    """);
            option = scanner.nextInt();

            switch (option){
                case 1:
                    addCourse(scanner);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("...:: Searching course ::...");
                    System.out.print("enter code course: ");
                    String courseFounded = scanner.nextLine();
                    if (searchCourseByCode(courseFounded) != null){
                        System.out.println(searchCourseByCode(courseFounded).toString());

                    }else {
                        System.out.println("There are no course with this code");
                    }
                    break;
                case 3:
                    showCourses();
                    break;
                case 4:
                    System.out.println("Leaving manage Courses...");
                    break;

            }

        }while (option!=4);
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourse(Scanner scanner){
        scanner.nextLine();
        System.out.println("...::ADD COURSE::...");
        System.out.print("Enter the course name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the course code: ");
        String code = scanner.nextLine();
        if (searchCourseByCode(code) == null){
            Course course = new Course(code,name);
            courseList.add(course);
        }else {
            System.out.println("the course already exist");
        }
    }

    public Course searchCourseByCode(String code){
        for (Course course: courseList
             ) {
            if (course.getCode().equalsIgnoreCase(code)){
                return course;
            }

        }
        return null;
    }

    public void showCourses(){
        if (!courseList.isEmpty()){
            StringBuilder message = new StringBuilder();
            for (Course course: courseList
            ) {
                message.append(course.toString());
            }
            System.out.println("Courses list\n"+message);

        } else {
            System.out.println("Courses list\n Courses list is empty");
        }
    }

}
