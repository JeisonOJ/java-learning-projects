package registerEmployees;

public class Employee extends Persona{
    private int id;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", salary=" + salary +
                "} " + super.toString();
    }

    public Employee(String name, int age, int id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }


}
