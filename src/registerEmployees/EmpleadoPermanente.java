package registerEmployees;

public class EmpleadoPermanente extends Empleado{
    public EmpleadoPermanente(String name, int age, int id, double salary) {
        super(name, age, id, salary);
    }

    @Override
    public String toString() {
        return "EmpleadoPermanente{} " + super.toString();
    }
}
