package registerEmployees;

import java.util.ArrayList;

public class GestionEmpleados {
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public GestionEmpleados() {

    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public void removerEmpleado(int id){
        empleados.removeIf(empleado -> empleado.getId() == id);
    }

    public void mostrarEmpleados(){
        for (Empleado empleado: empleados){
            System.out.println(empleado);
        }
    }
}
