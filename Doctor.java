package clinic.entities;
import java.util.Scanner;

public class Doctor extends Person {
	Scanner scan;
	private int ft;
    private String dname=new String();
    public String speciality=new String();
    
    
    public Doctor()
    {
        speciality=" ";
            dname=" ";
            ft=0;
            
    }
    
    
    
    public Doctor(String dname,String speciality,int ft) {
		//super(id);
		this.dname = dname;
		this.speciality = speciality;
		this.ft = ft;
		
	}
    
    
    public void getudata()
    {
    	super.get_data();
    	scan=new Scanner(System.in);
		System.out.print("\n\t\tENTER THE NAME OF THE DOCTOR:\n\t\t"+"Dr. ");
		dname=scan.nextLine();
		//scan=new Scanner(System.in);
		System.out.print("\n\t\tENTER THE FIELD OF SPECIALITY:\n\t\t");
		speciality=scan.nextLine();
		System.out.print("\n\t\tENTER VISITING TIME:\n\t\t");
		System.out.print("1.SATURDAY , MONDAY, WEDNESDAY ");
		System.out.print("\n\t\t2.SUNDAY, TUESDAY ,THURSDAY \n\t\t\t");
		ft=scan.nextInt();
    }

    
    
    public void showudata()
    {
    	super.display();
    	System.out.print("\n\t\tNAME: Dr. "+dname+"\n\t\t"+"SPECIALIZED ON: "+speciality+"\n\t\t"
    			);
    	 showtime(ft);
    }
    
    
    
    public void showtime(int x)
    {
    	 if(x==1)
    	 {
    		 System.out.print("\tDOCTOR IS AVAILABLE AT: \n\t\t\t");
    		 System.out.print("1.SATURDAY\n\t\t\t2.MONDAY\n\t\t\t3.WEDNESDAY");
    		 
    		 
    	 }
    	 
    	 else
    	 {
    		 System.out.print("\tDOCTOR IS AVAILABLE AT: \n\t\t\t");
    		 System.out.print("1.SUNDAY\n\t\t\t2.TUESDAY\n\t\t\t3.THURSDAY");
    	 }
    }
    
    
    public int getId()
    {
    	return super.getId();
    }
    
    public String getdname() {
		return dname;
	}
	public void setdname(String dname) {
		this.dname = dname;
	}
	
	public String getspeciality() {
		return speciality;
	}
	public void setspeciality(String speciality) {
		this.speciality = speciality;
	}
	
	
	public int getft() {
		return ft;
	}
	public void setft(int ft) {
		this.ft = ft;
	}
    
    
}
