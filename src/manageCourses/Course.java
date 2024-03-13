package manageCourses;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private String code;
    private String name;
    private ArrayList<Student> studentsList;

    public static int idEstudent = 0;
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
        studentsList = new ArrayList<>();
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void addStudent(Scanner scanner) {
        System.out.println("...::New Student::...");
        System.out.print("Student name: ");
        String nameStudent = scanner.nextLine();
        System.out.print("Student email: ");
        String emailStudent = scanner.nextLine();

        Student student = new Student(idEstudent,nameStudent,emailStudent);
        idEstudent++;
        if (studentsList.add(student)){
            System.out.println("Student added succesfully!!");
        }else {
            System.out.println("Student couldn't be added");
        }
    }

    public void removerStudent(Scanner scanner){
        showStudents();
        System.out.print("Please enter the id to remove student: ");
        int id = scanner.nextInt();
        if (studentsList.removeIf(student -> student.getId() == id)){
            System.out.println("Student removed succesfully!!");
        }
        else {
            System.out.println("There are no student with this id");
        }
    }

    public void showStudents(){
        if (!studentsList.isEmpty()){
            StringBuilder message = new StringBuilder();
            for (Student student: studentsList
            ) {
                message.append(student.toString());
            }
            System.out.println(name+" - Students list\n"+message);

        } else {
            System.out.println(name+" - Students list\n Students list is empty");
        }
    }

    @Override
    public String toString() {
        return "\nCourse name: "+name+"\nCode: "+code;
    }
}
