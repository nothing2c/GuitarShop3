import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec(Builder.FENDER, "Stratocastor", NumStrings.TWELVE, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        List matchingGuitars = inventory.search(whatLookingFor);
        if (!matchingGuitars.isEmpty()){
            System.out.println("You might like these: ");

            for(Iterator i = matchingGuitars.iterator(); i.hasNext(); ){
                Guitar guitar = (Guitar)i.next();
                //guitar = guitar.getSpec();
                System.out.println("We have a " + guitar.getSerialNumber() + guitar.getSpec().getBuilder() +
                        " " + guitar.getSpec().getModel() + " " + guitar.getSpec().getType() + " guitar: " +
                        guitar.getPrice());
            }
        }
        else {
            System.out.println("Sorry, we have nothing for you.");
        }

    }

    public static void initialiseInventory(Inventory inventory){
        //add guitars to the inventory
        //create a GuitarSpec object

        GuitarSpec spec = new GuitarSpec(Builder.FENDER, "Stratocaster", NumStrings.TWELVE, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        inventory.addGuitar("V00001",1499.99, spec);
        inventory.addGuitar("V00002",1199.99, spec);
        inventory.addGuitar("V00003",1699.99, spec);

        GuitarSpec spec2 = new GuitarSpec(Builder.GIBSON, "Stratocaster", NumStrings.SIX, Type.ACOUSTIC, Wood.CEDAR, Wood.ALDER);

        inventory.addGuitar("V00004",1499.99, spec2);
        inventory.addGuitar("V00005",1199.99, spec2);
        inventory.addGuitar("V00006",1699.99, spec2);

        MandolinSpec mSpec = new MandolinSpec(Builder.GIBSON, "Stratocaster", Style.A, Type.ACOUSTIC, Wood.CEDAR, Wood.ALDER);

        inventory.addMandolin("V00007",1499.99, mSpec);
        inventory.addMandolin("V00008",1199.99, mSpec);
        inventory.addMandolin("V00009",1699.99, mSpec);
    }

}
