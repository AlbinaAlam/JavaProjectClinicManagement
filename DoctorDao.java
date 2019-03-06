package clinic.dao;
import java.sql.*;
//import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import clinic.entities.Doctor;



public class DoctorDao {

	public Connection getConnection()
	{
		Connection con= null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
		    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic","root",null);
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
	        	pst.executeUpdate("create table if not exists DoctorList(id int unsigned auto_increment not 

null,dname varchar(255) not null,speciality varchar(255) not null,ft int not null, primary key(id));");
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
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
				 rs= pst.executeQuery("select *  from DoctorList ");
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
	 
	 
	 public void Insertion(Doctor I) throws Exception   //Insertion into the table
		{
	    	
			  Connection con=null;
			  Statement pst=null;
			
	    try{
	    	 con= getConnection();
	    	
	       pst= con.createStatement();
	    
	    	pst.executeUpdate("insert into DoctorList(dname,speciality,ft)values("+I.getdname()+",'"+I.getspeciality

()+"'"+","+I.getft()+"')");
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
			
		
		 ResultSet rs= null;
		  Connection con=null;
		  Statement pst=null;
		
try{
	  con = getConnection();
	 pst= con.createStatement();
	 rs=pst.executeQuery("Select * from DoctorList");
	 JFrame frame= new JFrame("DoctorList");
	
	 
			 
	 String[][]data= new String[40][22];
	int k=0;
	while(rs.next())
	{
		data[k][0]=String.valueOf(rs.getInt(1));
		data[k][1]=rs.getString(2);
		data[k][2]=rs.getString(3);
		data[k][3]=String.valueOf(rs.getInt(4));
		
		
		
		k++;
		
	}
	String column[]={"ID","Name","Speciality","Available Time"};
	JTable table= new JTable(data,column);
	table.setBounds(30,40,400,300);
	 JScrollPane sp = new JScrollPane(table);
     frame.add(sp);
     frame.setVisible(true);
	 frame.setSize(900,800);
	
	System.out.println("All selected!");
	
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
			rs.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	}
	 
	 
	 public void selection( int p) throws Exception    //show an individual information 
		{
			ResultSet rs= null;
			  Connection con=null;
			  Statement pst=null;
			
			try
			{
			  con= getConnection();
				 pst=con.createStatement();
				rs = pst.executeQuery("select * from DoctorList where ID="+p);
				while(rs.next())
				{
					System.out.println("ID:"+rs.getInt(1));
		    		System.out.println("Doctor's Name:"+rs.getString(2));
		    		System.out.println("Speciality:"+rs.getString(3));
		    		System.out.println("Available Time:"+rs.getInt(4));
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
	 
	 
	 
	 public float selectserial( int p) throws Exception    //returns individual's price 
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
			     rs = pst.executeQuery("select * from Doctorlist ");
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
			
		}
		

}
