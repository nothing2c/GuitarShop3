public class Mandolin extends Instrument{

    private MandolinSpec spec;

    public Mandolin(String serialNumber, double price, MandolinSpec spec)
    {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    @Override
    public MandolinSpec getSpec() {
        return spec;
    }
}
