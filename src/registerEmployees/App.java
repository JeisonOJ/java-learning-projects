package registerEmployees;

public class App
{
    public static void main( String[] args )
    {
        manageEmployee employees = new manageEmployee();

        Employee employee = new permanentEmployee("jeison",29,1,10000000);
        Employee employee2 = new EmployeeTemporal("daniela",28,2,20000000);

        employees.addEmployee(employee);
        employees.addEmployee(employee2);

        employees.showEmployees();

        employees.removeEmployee(1);
        System.out.println("remove employee by id = 1");
        employees.showEmployees();

    }
}
