import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> instruments;

    public Inventory()
    {
        instruments = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec)
    {
        //create a guitar object and add to the list
        Guitar guitar = new Guitar(serialNumber,price,spec);
        instruments.add(guitar);
    }

    public void addMandolin(String serialNumber, double price, MandolinSpec spec)
    {
        Mandolin mandolin = new Mandolin(serialNumber,price,spec);
        instruments.add(mandolin);
    }

    public List search(InstrumentSpec searchSpec)
    {
        List<Instrument> matchingInstruments = new LinkedList();

        for (Iterator i = instruments.iterator(); i.hasNext(); )
        {
            Instrument instrument = (Instrument) i.next();

            InstrumentSpec instrumentSpec = instrument.getSpec();

            if (searchSpec.getBuilder() != instrumentSpec.getBuilder())
                    continue;

            String model = searchSpec.getModel().toLowerCase();

            if ((model != null) && (!model.equals("")) &&
                   (!model.equals(instrumentSpec.getModel().toLowerCase())))
                continue;

            if(searchSpec instanceof GuitarSpec)
            {
                if (((GuitarSpec) searchSpec).getNumStrings() != ((GuitarSpec) instrumentSpec).getNumStrings())
                    continue;
            }

            else if(searchSpec instanceof MandolinSpec)
            {
                if(((MandolinSpec) searchSpec).getStyle() != ((MandolinSpec) searchSpec).getStyle())
                    continue;
            }

            if (searchSpec.getType() != instrumentSpec.getType())
                continue;

            if (searchSpec.getBackWood() != instrumentSpec.getBackWood())
                continue;

            if (searchSpec.getTopWood() != instrumentSpec.getTopWood())
                continue;

            matchingInstruments.add(instrument);
        }
        return matchingInstruments;
    }
}

