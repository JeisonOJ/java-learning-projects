package registerEmployees;

public class App 
{
    public static void main( String[] args )
    {
        GestionEmpleados empleados = new GestionEmpleados();

        Empleado empleado = new EmpleadoPermanente("jeison",29,1,10000000);
        Empleado empleado2 = new EmpleadoTemporal("daniela",28,2,20000000);

        empleados.agregarEmpleado(empleado);
        empleados.agregarEmpleado(empleado2);

        empleados.mostrarEmpleados();

    }
}
