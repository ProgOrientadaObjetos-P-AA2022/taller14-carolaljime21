package problema02;

public class Calificaciones {

    private String nombre;
    private String apellido;
    private double nota1, nota2, nota3, promedio;

    public Calificaciones(String nom, String ap, double n1, double n2, double n3) {
        nombre = nom;
        apellido = ap;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerNota1(double c) {
        nota1 = c;
    }

    public double obtenerNota1() {
        return nota1;
    }

    public void estableceNota2(double c) {
        nota2 = c;
    }

    public double obtenerNota2() {
        return nota2;
    }

    public void establecerNota3(double c) {
        nota3 = c;
    }

    public double obtenerNota3() {
        return nota3;
    }

    public void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s %s\n"
                + "\tCalificaciones:\n"
                + "\t%.2f\n"
                + "\t%.2f\n"
                + "\t%.2f\n"
                + "\tPromedio: %.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerNota1(),
                obtenerNota2(),
                obtenerNota3(),
                obtenerPromedio());
        return cadena;

    }
}
