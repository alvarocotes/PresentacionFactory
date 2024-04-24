package abstrad_factory;


public class Main {
    public static void main(String[] args) {

        fabricaAbstracta fabricaMueblesModernos = new fabricaModerna();

        silla sillamoderna = fabricaMueblesModernos.crearsilla();
        mesa mesamoderna = fabricaMueblesModernos.crearmesa();

        sillamoderna.sentarse();
        mesamoderna.sostiene();

        fabricaAbstracta fabricaMueblesVictorianos = new fabricaVictoriana();

        silla sillavictoriana = fabricaMueblesVictorianos.crearsilla();
        mesa mesavictoriana = fabricaMueblesModernos.crearmesa();

        sillavictoriana.sentarse();
        mesavictoriana.sostiene();



    }
}
