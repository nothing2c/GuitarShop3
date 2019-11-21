public abstract class Instrument {

    protected String serialNumber;
    protected double price;

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public double getPrice()
    {
        return price;
    }

    private void setPrice(double newPrice)
    {
        this.price = newPrice;
    }

    public abstract InstrumentSpec getSpec();
}
