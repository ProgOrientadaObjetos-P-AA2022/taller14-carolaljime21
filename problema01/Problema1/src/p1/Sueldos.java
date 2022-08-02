package p1;

public class Sueldos {

    private String cedula, nombre, correo, mes;
    private double sueldo;

    public Sueldos(String c, String n, String co, double s, String m) {
        cedula = c;
        nombre = n;
        correo = co;
        sueldo = s;
        mes = m;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerCorreo(String c) {
        correo = c;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public void establecerSueldo(double c) {
        sueldo = c;
    }
    
    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerMes(String c) {
        mes = c;
    }

    public String obtenerMes() {
        return mes;
    }

    @Override
    public String toString() {
        String data = String.format(
                "Numero de cedula: %s\n"
                + "Nombre: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes: %s\n",
                obtenerCedula(),
                obtenerNombre(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMes());
        return data;
    }
}
