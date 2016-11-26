
public class FindHolidayTester {

    public static void main(String[] args){
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Holiday customerSearch = new Holiday("","event", "21-01-2016", 354.00);

        Holiday holiday = inventory.search(customerSearch);
        if(holiday != null){
            System.out.println("Event found : " + holiday.getName() + " " + holiday.getDate() + "" + holiday.getPrice() + "€\n" + holiday.getDescription() + "\n");

        }else
        {
            System.out.println("Any events found");
        }

    }

    private static void initializeInventory(Inventory inventory){

    }
}