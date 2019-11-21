public class GuitarSpec extends InstrumentSpec
{
    private NumStrings numStrings;

    public GuitarSpec()
    {
        this.builder = Builder.FENDER;
        this.model = "";
        this.numStrings = NumStrings.SIX;
        this.type = Type.ACOUSTIC;
        this.backWood = Wood.ALDER;
        this.topWood = Wood.CEDAR;
    }

    public GuitarSpec(Builder builder, String model, NumStrings numStrings, Type type, Wood backWood, Wood topWood)
    {
        this.builder = builder;
        this.model = model;
        this.numStrings = numStrings;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public NumStrings getNumStrings()
    {
        return numStrings;
    }
}
