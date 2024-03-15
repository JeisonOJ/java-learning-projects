package registerEmployees;

import java.util.ArrayList;

public class manageEmployee {
    private ArrayList<Employee> employees = new ArrayList<>();

    public manageEmployee() {

    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(int id){
        employees.removeIf(employee -> employee.getId() == id);
    }

    public void showEmployees(){
        for (Employee employee: employees){
            System.out.println(employee);
        }
    }
}
