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

    public static void main (String[] args){

    };
}
