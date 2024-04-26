package abstrad_factory_buttom;

public class fabricaWindows implements fabrica{
    @Override
    public boton crearBoton() {
        return new botonWindows();
    }
}
