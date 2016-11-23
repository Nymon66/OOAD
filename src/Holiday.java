/**
 * Created by t00191682 on 23/11/2016.
 */
public class Holiday {

    public String name;
    public String description;
    public String date;
    public double price;

    public Holiday(String name, String description, String date, double price ){

        this.name = name;
        this.description = description;
        this.date = date;
        this.price = price;
    }

    public String getName(){
            return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(float newPrice){
        this.price = newPrice;
    }

    public String description(){
        return description;
    }

    public String getDate(){
        return date;
    }



}
