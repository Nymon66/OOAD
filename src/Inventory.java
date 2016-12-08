import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//antoine crinquette
public class Inventory {

    private List holidays;

    public Inventory(){
        holidays = new LinkedList();
    }

    public void addHoliday(String name, double price,
                           HolidaySpec spec){
        Holiday holiday = new Holiday(name,price,spec);
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

    public List search(HolidaySpec searchSpec){
        List holidayList = new LinkedList();

        for (Iterator i = holidays.iterator(); i.hasNext();){
            Holiday holiday = (Holiday)i.next();
            if (holiday.getSpec().matches(searchSpec))
                holidayList.add(holiday);

        }
        return holidayList;

    }

}
