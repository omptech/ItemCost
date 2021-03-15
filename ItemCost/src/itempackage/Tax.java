package itempackage;

public class Tax extends Item{
	Item i=new Item();
	public double getRaw(int cost) {
		 double tax=12.5*cost/100;
		 i.setTa(tax);
		 double total=tax+cost;
		 return total;
	}
	
	public double getManuf(int cost) {
		 double tax=(12.5*cost/100)+2*(12.5*cost/100+cost)/100;
		 i.setTa(tax);
		 double total=tax+cost;
		 return total;
	}
	public double getImport(int cost) {
		 double tax=10*cost/100;
		 i.setTa(tax);
		 double total=tax+cost;
		 if(total<=100) {
			 total=total+5;
		 }else if(total>100 && total<=200) {
			 total=total+10;
		 }else if(total>200) {
			 total=total+5*total/100;
		 }
		 return total;
	}
}
