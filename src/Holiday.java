/**
 * Created by t00191682 on 23/11/2016.
 */
public class Holiday {

    public String name;
    public double price;
    HolidaySpec spec;

    public Holiday(String name, double price, HolidaySpec spec ){

        this.name = name;
        this.price = price;
        this.spec = spec;
    }

    public String getName(){
            return name;
    }

    public double getPrice(){return price;}



    public HolidaySpec getSpec(){
        return spec;
    }




}
