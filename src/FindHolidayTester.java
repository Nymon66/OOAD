import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindHolidayTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map properties = new HashMap();
        properties.put("Type", Type.STANDARD);
        properties.put("description","Try to make a description understandeable" );
        properties.put("date","21-01-2016");

        HolidaySpec customerSearch = new HolidaySpec(properties);

        List holidayList = inventory.search(customerSearch);
        if (!holidayList.isEmpty()) {
            for (Iterator i = holidayList.iterator(); i.hasNext(); ) {
                Holiday holiday = (Holiday) i.next();
                HolidaySpec spec = holiday.getSpec();
                System.out.println("Event found : " + holiday.getName());
                for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext(); ) {
                    String propertyName = (String) j.next();
                    if (propertyName.equals("holidayType"))
                        continue;
                    System.out.println("      " + propertyName + ": " + spec.getProperty(propertyName));
                }
                System.out.printf(" The price is : " + holiday.getPrice()+ " €"   + "\n----");
            }
        } else {
            System.out.println("Any event found :(");
        }
    }


    private static void initializeInventory(Inventory inventory){
        Map properties = new HashMap();
        properties.put("Type", Type.STANDARD);
        properties.put("description","Try to make a description understandeable" );
        properties.put("date","21-01-2016");
        inventory.addHoliday("EnjoyMunichAirsoft", 1234.32, new HolidaySpec(properties));


        properties.put("Type", Type.STANDARD);
        properties.put("description","Try to make a description understandeable two" );
        properties.put("date","21-08-2016");
        inventory.addHoliday("EnjoyTraleeAirsoft", 175.32, new HolidaySpec(properties));


        properties.put("Type", Type.MILSIM);
        properties.put("description","Try to make a description understandeable three" );
        properties.put("date","21-01-2018");
        inventory.addHoliday("EnjoyGalwayAirsoft", 345.32, new HolidaySpec(properties));

        properties.put("Type", Type.ROLEPLAY);
        properties.put("description","Try to make a description understandeable four !!!!" );
        properties.put("date","21-01-2016");
        inventory.addHoliday("EnjoyDingleAirsoft", 1234.32, new HolidaySpec(properties));


        properties.put("Type", Type.ROLEPLAY);
        properties.put("description","Try to make a description understandeable five !!!!!!!!!!" );
        properties.put("date","09-03-2016");
        inventory.addHoliday("EnjoyCorkAirsoft", 2520.00, new HolidaySpec(properties));
    }
}