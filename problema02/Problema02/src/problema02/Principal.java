package problema02;

public class Principal {

    public static void main(String[] args) {
        Enlace e = new Enlace();

        for (int i = 0; i < e.obtenerDataCalificaciones().size(); i++) {
            System.out.printf("%s\n", e.obtenerDataCalificaciones().get(i));
        }
    }

}
