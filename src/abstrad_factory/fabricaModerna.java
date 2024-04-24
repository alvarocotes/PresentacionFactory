package abstrad_factory;

public class fabricaModerna implements fabricaAbstracta{
    @Override
    public silla crearsilla() {
        return new sillaModerna();
    }

    @Override
    public mesa crearmesa() {
        return new mesaModerna();
    }
}
