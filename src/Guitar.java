public class Guitar extends Instrument{

    private GuitarSpec spec;

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    @Override
    public GuitarSpec getSpec()
    {
        return spec;
    }
}
