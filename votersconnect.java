package VotePro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class votersconnect
{
	
	public static Connection getconnection()
	{
		Connection con=null;
		System.out.println("in connection");
		try{
			System.out.println("before getcon");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("after get con");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aptech", "root", "");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	public static int savev(parties p)
	{
		
		int status=0;
		try
		{
			Connection con=votersconnect.getconnection();
			PreparedStatement ps=con.prepareStatement("insert into party1(voterid,party) values(?,?)");
			ps.setString(1,p.getVoterid());
			ps.setString(2,p.getParty());
			
			status=ps.executeUpdate();
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
		
	}
	public static int updatev(parties p, int voterid)
	{
		int status=0;
		try
		{
			Connection con=votersconnect.getconnection();
			PreparedStatement ps=con.prepareStatement("update party1 set party=? where voterid="+voterid);
			ps.setString(1, p.getParty());
			//ps.setString(2, p.getVoterid());
			
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return status;
		
	}
	public static int save( voter v)
	{
		int status=0;
		try
		{
			Connection con=votersconnect.getconnection();
			PreparedStatement ps=con.prepareStatement("insert into vote1(fname,mname,lname,adharno,mono,gender,voterid) values(?,?,?,?,?,?,?)");
			ps.setString(1, v.getFname());
			ps.setString(2, v.getMname());
			ps.setString(3, v.getLname());
			ps.setInt(4, v.getAdharno());
			ps.setString(5, v.getMono());
			ps.setString(6, v.getGender());
			ps.setString(7, v.getVoterid());
			
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;	
	}
	
	public static int update(voter v)
	{
		int status=0;
		try
		{
			Connection con=votersconnect.getconnection();
			PreparedStatement ps=con.prepareStatement("update vote1 set fname=?, mname=?, lname=?,mono=?,gender=?,voterid=? where adharno=?");
			ps.setString(1, v.getFname());
			ps.setString(2, v.getMname());
			ps.setString(3, v.getLname());
			ps.setString(4, v.getMono());
			ps.setString(5, v.getGender());
			ps.setString(6, v.getVoterid());
			ps.setInt(7, v.getAdharno());
			
			System.out.println("fname="+v.getFname());
			System.out.println("mname="+v.getMname());
			System.out.println("lname="+v.getLname());
			System.out.println(("mono="+v.getMono()));
			System.out.println("gender="+v.getGender());
			System.out.println("voterid="+v.getVoterid());
			System.out.println("adharno="+v.getAdharno());
			
			status=ps.executeUpdate();
			System.out.println("After Update");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return status;	
	}
	public static int delete(int adharno)
	{
		int status=0;
		try
		{
			Connection con=votersconnect.getconnection();
			PreparedStatement ps=con.prepareStatement("delete from vote1 where adharno=?");
			
			ps.setInt(1, adharno);
			status=ps.executeUpdate();
			
			con.close();
		}
		catch(Exception ex1)
		{
			System.out.println(ex1);
		}
		return status;
	}
	public static voter getvoterByAdharno(int adharno)
	{
		voter v=new voter();
		try
		{
			Connection con=votersconnect.getconnection();
			PreparedStatement ps=con.prepareStatement("select * from vote1 where adharno=?");
			ps.setInt(1, adharno);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				v.setFname(rs.getString(1));
				v.setMname(rs.getString(2));
				v.setLname(rs.getString(3));
				v.setAdharno(rs.getInt(4));
				v.setMono(rs.getString(5));
				v.setGender(rs.getString(6));
				v.setVoterid(rs.getString(7));
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return v;
	}
	
	public static List<voter> getAllvoter()
	{
		List<voter> list=new ArrayList<voter>();
		try
		{
			Connection con=votersconnect.getconnection();
			PreparedStatement ps=con.prepareStatement("select * from vote1");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				voter v=new voter();
				v.setFname(rs.getString(1));
				v.setMname(rs.getString(2));
				v.setLname(rs.getString(3));
				v.setAdharno(rs.getInt(4));
				v.setMono(rs.getString(5));
				v.setGender(rs.getString(6));
				v.setVoterid(rs.getString(7));
				
				list.add(v);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}
}
