import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Cielo de Xela", "Banda Quetzal", 210);
        Cancion c2 = new Cancion("Marimba al Atardecer", "Los Tecomates", 180);

        List<Contenido> catalogo = List.of(c1, c2);
        List<Reproducible> paraEscuchar = List.of(c1, c2);
        List<Descargable> paraDescargar = List.of(c1, c2);

        for (Contenido c : catalogo) {
            System.out.println(c);
        }

        System.out.println("--- Reproduciendo ---");
        for (Reproducible r : paraEscuchar) {
            r.reproducir();
        }
        int seg = tiempoTotalSeg(paraEscuchar);
        System.out.println("Tiempo total: " + seg / 60 + " min " + seg % 60 + " s");

        System.out.println("--- Descargas ---");
        double mb = espacioTotalMB(paraDescargar);
        System.out.println("Espacio necesario: " + mb + " MB");
    }

    static int tiempoTotalSeg(List<Reproducible> lista) {
        int total = 0;
        for (Reproducible r : lista) {
            total += r.getDuracionSeg();
        }
        return total;
    }

    static double espacioTotalMB(List<Descargable> lista) {
        double total = 0;
        for (Descargable d : lista) {
            total += d.calcularTamanoMB();
        }
        return total;
    }
}
