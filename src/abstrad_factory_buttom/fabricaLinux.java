package abstrad_factory_buttom;

public class fabricaLinux implements fabrica {

    @Override
    public boton crearBoton() {
        return new botonLinux();
    }
}
