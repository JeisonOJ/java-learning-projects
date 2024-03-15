package registerEmployees;

public class permanentEmployee extends Employee {
    public permanentEmployee(String name, int age, int id, double salary) {
        super(name, age, id, salary);
    }

    @Override
    public String toString() {
        return "Permanent employee{} " + super.toString();
    }
}
