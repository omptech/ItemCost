package itempackage;
import itempackage.Item;
import itempackage.Tax;

import java.util.ArrayList;
import java.util.Scanner;

public class EffectiveCost {

	public static void main(String[] args) {
		
		
		double raw=0,manuf=0,imported=0;
		String temp;
		
        Tax tax=new Tax();
		Scanner o=new Scanner(System.in);
		Item item=new Item();
		ArrayList<Item> list = new ArrayList<Item>();
		
		do{
		System.out.print("Name :");
		o.next();
		item.setName(o.nextLine());
		System.out.print("Price :");
		item.setPrice(o.nextInt());
		System.out.print("Quantity :");
		item.setQuantity(o.nextInt());
		System.out.print("Type:");
		item.setType(o.next());
		
		list.add(item);
		System.out.println("Do you want to enter details of any other item (y/n)");
		
	   
	   temp=o.next();
	   }while(temp.equals("y"));
		
		for (Item i : list) {
			
			System.out.println(i.getName());
			System.out.println(i.getPrice());
			
			switch(i.getType().toLowerCase()){
			   
			case "raw": raw=tax.getRaw(i.getPrice());
			            System.out.println(i.getTa());
			            System.out.println(raw);
			            break;
			
			case "manufactured":manuf=tax.getManuf(i.getPrice());
			                    System.out.println(i.getTa());
		                       	System.out.println(manuf);
			                    break;
			                     
			case "imported": imported=tax.getImport(i.getPrice());
			                 System.out.println(i.getTa());
			                 System.out.println(imported);
			                 break;
			
			}
		}
		
	}

}
