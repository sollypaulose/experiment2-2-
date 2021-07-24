import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;
class product implements Comparable<product>
{
    int itemid;
    String ShortDescription;
    int price;
    String brand;
    
    public product(int itemid, String ShortDescription , int price , String brand)
    {
        this.itemid=itemid;
        this.ShortDescription=ShortDescription;
        this.price=price;
        this.brand=brand;
    }
    
    public int compareTo(product p)
    {
        if(price==p.price)
            return 0;
        else if(price<p.price)
            return 1;
        else
            return -1;
    }
}    
public class EightStream
{
    public static void main(String[] args)
    {
       ArrayList <product> Item = new ArrayList <product>();
       Item.add(new product(101,"A multipurpose tool",500,"Maxel"));
       Item.add(new product(104,"Grinding machine",1000,"Tguard"));
       Item.add(new product(103,"Kitchen tool",550,"Zams"));
       Item.add(new product(102,"Book stand",700,"Tomre"));
       Item.add(new product(105,"Computer table",350,"blueder"));
       
       System.out.println("\nSorting by price\n");
       Collections.sort(Item);
       for(product pt:Item)
       {
           System.out.println(pt.itemid +" "+ pt.ShortDescription+" "+ pt. price+" "+pt. brand);
       }
       System.out.println("\n FILTERING ITEMS START WITH 'T'");
       List<String> i=Item.stream().filter(s -> s.brand.startsWith("T")).map(s->s.brand).collect(Collectors.toList());
       System.out.println(i);
       
    }
    
}

