package abstrad_factory;

public class fabricaVictoriana implements fabricaAbstracta{
    @Override
    public silla crearsilla() {
        return new sillaVictoriana();
    }

    @Override
    public mesa crearmesa() {
        return new mesaVictoriana();

    }
}
