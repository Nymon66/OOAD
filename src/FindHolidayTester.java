import java.util.Iterator;
import java.util.List;

public class FindHolidayTester {

    public static void main(String[] args){
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        HolidaySpec customerSearch = new HolidaySpec(Type.STANDARD,"Try to make a description understandeable" ,  "");

        List holidayList = inventory.search(customerSearch);
        if(!holidayList.isEmpty()){
            for(Iterator i = holidayList.iterator(); i.hasNext();){
                Holiday holiday = (Holiday)i.next();
                HolidaySpec spec = holiday.getSpec();
                System.out.println("Event found : " + holiday.getName() + " " + spec.getType() + " " + spec.getDescription() +" "+ spec.getDate() + " " + holiday.getPrice() + "€ \n");

            }
        }else
        {
            System.out.println("Any events found");
        }

    }

    private static void initializeInventory(Inventory inventory){
            inventory.addHoliday("EnjoyLimerickAirsoft", 354.00, new HolidaySpec(Type.STANDARD, "Try to make a description understandeable","21-01-2016"));
            inventory.addHoliday("EnjoyTraleeAirsoft", 175.00, new HolidaySpec(Type.STANDARD, "Try to make a description understandeable number two !","08-01-2016"));
        inventory.addHoliday("EnjoyDublinAirsoft", 250.00, new HolidaySpec(Type.ROLEPLAY, "Try to make a description understandeable tree","19-01-2016"));
        inventory.addHoliday("EnjoyGalwayAirsoft", 3250.00, new HolidaySpec(Type.STANDARD, "Try to make a description understandeable number four !","08-01-2016"));
        inventory.addHoliday("EnjoyDinglekAirsoft", 1354.00, new HolidaySpec(Type.MILSIM, "Try to make a description understandeable five ","13-01-2016"));
        inventory.addHoliday("EnjoyCorkAirsoft", 2520.00, new HolidaySpec(Type.STANDARD, "Try to make a description understandeable number six !!!!! !","08-01-2016"));

    }
}