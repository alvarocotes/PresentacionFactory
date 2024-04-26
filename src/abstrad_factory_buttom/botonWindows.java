package abstrad_factory_buttom;

public class botonWindows implements boton {


    @Override
    public void renderizar() {
        System.out.println("Botón estilo Windows:");
        System.out.println("- Color de fondo: Azul claro");
        System.out.println("- Texto: En negrita, fuente Segoe UI");
        System.out.println("- Borde: Redondeado con sombra suave");
        System.out.println("- Efecto al hacer clic: Animación de resaltado");
    }
}
