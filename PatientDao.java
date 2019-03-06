package clinic.dao;
import java.sql.*;
//import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import clinic.entities.Patient;



public class PatientDao {

	public Connection getConnection()
	{
		Connection con= null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
		    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic","root",null);
		    //System.out.println("connected");
			return con;
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
		return null;
	}
	
	
	 public void CreateTable() throws Exception // table Creation
	    {
	    	Connection con=null;
	    	Statement pst= null;
	    	try{
	    		 con= getConnection();
	        	 pst= con.createStatement();
	        	pst.executeUpdate("create table if not exists PatientList(id int unsigned auto_increment not null,name varchar(255) not null,age int not null,address int not null,bg varchar(255) not null,did int not null, primary key(id));");
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
	    	finally
			{
	    		System.out.println("function complete");
				try
				{
					con.close();
					pst.close();
					
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
	    
	 }
	 
	 
	 @SuppressWarnings("finally")
		public int CountRecords() throws Exception //Count the rows
		{
			int count=0;
			ResultSet rs= null;
			  Connection con=null;
			  Statement pst=null;
			
			try
			{
				 con= getConnection();
			     pst= con.createStatement();
				 rs= pst.executeQuery("select *  from PatientList ");
			 while(rs.next())
			 {
				 count++;
			 }
				return count;
				}catch(Exception e)
			{
					System.out.println(e);
			}
			finally
			{
				try
				{
					con.close();
					pst.close();
					rs.close();
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return count;
			}
		}
	 
	 
	 public void Insertion(Patient I) throws Exception   //Insertion into the table
		{
	    	
			  Connection con=null;
			  Statement pst=null;
			
	    try{
	    	 con= getConnection();
	    	
	       pst= con.createStatement();
	    
	    	pst.executeUpdate("insert into PatientList(name,address,age,bg,did)values("+I.getname()+",'"+I.getaddress()+"'"+","+I.getage()+",'"+I.getbg()+I.getdid()+"')");
	    	System.out.println("Insertion Successfull! ");
	    }catch(Exception x)
	    {
	    	System.out.println(x);
	    }
	    finally
		{
			try
			{
				con.close();
				pst.close();
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		}
	 
	 
	 @SuppressWarnings("finally")
	 public void showAllRecords() throws Exception//shows all records for Information
		{
			
		
		 try
			{
				Connection myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic","root",null);
				Statement  myStmt=myconn.createStatement();
				ResultSet myRs=myStmt.executeQuery("select * from PatientList");
				while (myRs.next())
				{
					System.out.println(myRs.getInt("id")+myRs.getString("name")+myRs.getInt("age")+myRs.getInt("address")+myRs.getString("bg")+myRs.getInt("did"));
				}
			}
	catch (Exception e) {
			e.printStackTrace();
			}
		 finally
			{
				try
				{
					Connection myconn = null;
					myconn.close();
					Connection myStmt = null;
					myStmt.close();
					Connection myRs = null;
					myRs.close();
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
	}
	
		
	 
	 
	 public void selectionName( String s) throws Exception    //show an individual information 
		{
			ResultSet rs= null;
			  Connection con=null;
			  Statement pst=null;
			
			try
			{
			  con= getConnection();
				 pst=con.createStatement();
				rs = pst.executeQuery("select * from PatientList where Name="+s);
				while(rs.next())
				{
				System.out.println("ID:"+rs.getInt(1));
	    		System.out.println("Address:"+rs.getInt(2));
	    		System.out.println("Name:"+rs.getString(3));
	    		System.out.println("ID of selected doctor:"+rs.getInt(4));
	    		System.out.println("Blood Group:"+rs.getString(5));
	    		System.out.println("Age:"+rs.getInt(6));
	    		System.out.println("\n");
				}
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				try
				{
					con.close();
					pst.close();
					rs.close();
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
		}
	 
	 public void selectionId( int  id) throws Exception    //show an individual information 
		{
			ResultSet rs= null;
			  Connection con=null;
			  Statement pst=null;
			
			try
			{
			  con= getConnection();
				 pst=con.createStatement();
				rs = pst.executeQuery("select * from PatientList where Id="+id);
				while(rs.next())
				{
				System.out.println("ID:"+rs.getInt(1));
	    		System.out.println("Address:"+rs.getInt(2));
	    		System.out.println("Name:"+rs.getString(3));
	    		System.out.println("ID of selected doctor:"+rs.getInt(4));
	    		System.out.println("Blood Group:"+rs.getString(5));
	    		System.out.println("Age:"+rs.getInt(6));
	    		System.out.println("\n");
				}
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				try
				{
					con.close();
					pst.close();
					rs.close();
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
		}
	 
	 
	 
	 /*public float selectserial( int p) throws Exception    //returns individual's price 
		{
			Connection con=null;
	    	Statement pst= null;
	    	ResultSet rs=null;
	    	int id=0;
	    	int count=0;
			try
			{
				 con= getConnection();
				 pst=con.createStatement();
			     rs = pst.executeQuery("select * from Patientlist ");
				while(rs.next())
				{
					count++;
					if(count==p){
					id= rs.getInt(1) ;
					}
				}
				con.close();
				pst.close();
				rs.close();
				return id;
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
				return id;
			
		}*/
		

}
