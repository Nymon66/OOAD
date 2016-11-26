import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//antoine crinquette
public class Inventory {

    private List holidays;

    public Inventory(){
        holidays = new LinkedList();
    }

    public void addHoliday(String name,
            String description,
            String date,
            double price){
        Holiday holiday = new Holiday(name,description,date,price);
        holidays.add(holiday);
    }

    public Holiday getHoliday(String name){
        for (Iterator i = holidays.iterator(); i.hasNext();){
            Holiday holiday =(Holiday)i.next();
            if (holiday.getName().equals(name)){
                return holiday;
            }
        }
        return null;
    }

    public Holiday search(Holiday searchHoliday){
        for (Iterator i = holidays.iterator(); i.hasNext();){
            Holiday holiday = (Holiday)i.next();
            String name = searchHoliday.getName();
            if ((name != null) && (!name.equals("")) && (!name.equals(holiday.getName())))
                continue;

            String description = searchHoliday.getDescription();
            if ((description != null) && (!description.equals("")) && (!description.equals(holiday.getDescription())))
                continue;

            String date = searchHoliday.getDate();
            if ((date != null) && (!date.equals("")) && (!date.equals(holiday.getDate())))
                continue;

            double price = searchHoliday.getPrice();
            if ((price != 0) && (price != holiday.getPrice()))
                continue;

        }
        return null;
    }

}
