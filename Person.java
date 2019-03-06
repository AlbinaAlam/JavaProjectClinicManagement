package clinic.entities;
import java.util.*;

public class Person {
	protected int id;
	Scanner scan;
	
	public Person()
	{
		id=0;
	}
public Person( int id) {
		
		
		this.id=id;
}
	
	public void get_data()
	{
		 scan=new Scanner(System.in);
		 System.out.print("\n\n\t\tENTER ID NO:\n\t\t");
		 id=scan.nextInt();
		 
	}
	
	public void display()
	{
		System.out.print("\n\n\t\tID :"+id);
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


}
