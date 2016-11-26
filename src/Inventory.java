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
                           Type type,
            String description,
            String date,
            double price){
        Holiday holiday = new Holiday(name, type, description,date,price);
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
            String name = searchHoliday.getName().toLowerCase();
            if ((name != null) && (!name.equals("")) && (!name.equals(holiday.getName().toLowerCase())))
                continue;

            if(searchHoliday.getType() != holiday.getType())continue ;

            String description = searchHoliday.getDescription().toLowerCase();
            if ((description != null) && (!description.equals("")) && (!description.equals(holiday.getDescription().toLowerCase())))
                continue;

            String date = searchHoliday.getDate().toLowerCase();
            if ((date != null) && (!date.equals("")) && (!date.equals(holiday.getDate().toLowerCase())))
                continue;

            double price = searchHoliday.getPrice();
            if ((price != 0) && (price != holiday.getPrice()))
                continue;
            return holiday;
        }
        return null;
    }

}
