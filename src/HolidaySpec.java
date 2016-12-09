import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Antoine on 08/12/2016.
 */
public class HolidaySpec {

    private Map properties;

    public HolidaySpec(Map properties){
        if(properties == null){
        this.properties = new HashMap();
        }
        else
        {
            this.properties = new HashMap(properties);
        }
    }

    public Object getProperty(String propertyName){
        return properties.get(propertyName);
    }

    public Map getProperties(){
        return properties;
    }



    public boolean matches(HolidaySpec otherSpec){


       for(Iterator i = otherSpec.getProperties().keySet().iterator();i.hasNext();){
           String propertyName = (String)i.next();
           if (!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))){
               return false;
           }
       }

        return true;


    }

}
