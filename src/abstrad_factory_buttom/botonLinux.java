package abstrad_factory_buttom;

public class botonLinux implements boton{
    @Override
    public void renderizar() {
        System.out.println("Botón estilo Linux:");
        System.out.println("- Color de fondo: Gris oscuro");
        System.out.println("- Texto: En blanco, fuente Ubuntu");
        System.out.println("- Borde: Cuadrado sin sombra");
        System.out.println("- Efecto al hacer clic: Cambio de color a azul claro");
    }
}
