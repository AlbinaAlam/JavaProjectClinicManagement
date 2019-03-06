package clinic.entities;
import java.util.Scanner;

public class Patient extends Person {

	 Scanner scan;
	 protected  int age;
	   protected static int x;
	   protected int address;
	   private String bg=new String();
	    private int did;
	    //private String sex=new String();
	     private String name=new String();
	    public String day=new String();
	    public float times;
	     
	     
	public Patient()
	{
		age=0;
        address=0;
        bg="";
        //sex="";
        name="";
        did=0;
        day=" ";
         times=(float)0.00;
	}
	
	public Patient(String name,String bg,int age,int address,int did) {
		//super(id);
		this.name = name;
		this.age = age;
		this.address = address;
		this.bg = bg;
		this.did = did;
	}
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId(int id)
	{
		 return this.id=id;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public String getbg() {
		return bg;
	}
	public void setbg(String bg) {
		this.bg = bg;
	}
	
	
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	
	public int getdid() {
		return did;
	}
	public void setdid(int did) {
		this.did = did;
	}
	
	public int getaddress() {
		return address;
	}
	public void setaddress(int address) {
		this.address = address;
	}
	
	
	
	
	public void showid()
	{
		super.display();
		
	}
	
	public void getdata()
	{
		super.get_data();
		scan=new Scanner(System.in);
		System.out.print("\n\t\tENTER NAME :\n\t\t");
		name=scan.nextLine();
		System.out.print("\n\t\tENTER age :\n\t\t");
		age=scan.nextInt();
		System.out.print("\n\t\tENTER ADDRESS :\n\t\t");
		address=scan.nextInt();
		System.out.print("\n\t\tENTER BLOOD GROUP :\n\t\t");
		bg=scan.nextLine();
		System.out.print("\n\t\tENTER THE ID OF YOUR REQUIRED DOCTOR:\n\t\t");
		did=scan.nextInt();
		
	}
	
	
	public void showdata()
	{
		super.display();
		scan=new Scanner(System.in);
		System.out.print("\n\t\tNAME:");
		name=scan.nextLine();
		System.out.print("\n\t\tAGE:");
		age=scan.nextInt();
		System.out.print("\n\t\tADDRESS:");
		address=scan.nextInt();
		System.out.print("\n\t\tBLOOD GROUP:");
		bg=scan.nextLine();
		System.out.print("\n\t\tTHE ID OF YOUR REQUIRED DOCTOR:");
		did=scan.nextInt();
		
	}
	
	

	
}
