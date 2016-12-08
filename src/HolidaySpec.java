/**
 * Created by Antoine on 08/12/2016.
 */
public class HolidaySpec {
    private Type type;
    private String description;
    private String date;

    public HolidaySpec(Type type, String description, String date){
        this.type = type;
        this.description = description;
        this.date = date;

    }

    public boolean matches(HolidaySpec otherSpec){


        if (type != otherSpec.type)
            return false;

        if ((description != null) && (!description.equals(otherSpec.description)) &&(!description.equals("")))
            return false;

        if ((date != null) && (!date.equals(otherSpec.date)) && (!date.equals("")))
            return false;

return true;


    }

    public Type getType(){
        return type;
    }

    public String getDescription(){
        return description;
    }

    public String getDate(){
        return date;
    }

}
