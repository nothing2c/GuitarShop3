public class MandolinSpec extends InstrumentSpec{

    private Style style;

    public MandolinSpec()
    {
        this.builder = Builder.FENDER;
        this.model = "";
        this.style = Style.A;
        this.type = Type.ACOUSTIC;
        this.backWood = Wood.ALDER;
        this.topWood = Wood.CEDAR;
    }

    public MandolinSpec(Builder builder, String model, Style style, Type type, Wood backWood, Wood topWood)
    {
        this.builder = builder;
        this.model = model;
        this.style = style;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Style getStyle()
    {
        return style;
    }
}
