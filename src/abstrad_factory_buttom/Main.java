package abstrad_factory_buttom;

public class Main {
    public static void main(String[] args) {
        fabrica botonDeWindows = new fabricaWindows();
        fabrica botonDeLinux = new fabricaLinux();

        boton botonParaWindows = botonDeWindows.crearBoton();
        botonParaWindows.renderizar();

        System.out.println(" ");

        boton botonParaLinux = botonDeLinux.crearBoton();
        botonParaLinux.renderizar();



    }
}
