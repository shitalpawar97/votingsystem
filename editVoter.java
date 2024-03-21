package VotePro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import CURD.Emp;
//import CURD.Empconnect;

/**
 * Servlet implementation class editVoter
 */
@WebServlet("/editVoter")
public class editVoter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		out.println("<h1>Update Voter</h1>");
		String sadharno=request.getParameter("adharno");
		int adharno=Integer.parseInt(sadharno);
		
		voter v=votersconnect.getvoterByAdharno(adharno);
		
		out.println("<form action='updateVoter' method='get'>");
		out.println("<table>");
		out.println("<tr><td>fname:</td><td><input type='text' name='fname' value='"+v.getFname()+"'></tr>");
		out.println("<tr>"
				+"<td>mname:</td><td><input type='text' name='mname' value='"+v.getMname()+"'></td>"
				+"</tr>"
				+"<tr>"
				+"<td>lname:</td><td><input type='text' name='lname' value='"+v.getLname()+"'></td>"
		        +"</tr>"
				+"<tr>"
		        +"<td>adharno:</td><td><input type='text' name='adharno' value='"+v.getAdharno()+"'></td>"
		        +"</tr>"
		        +"<tr>"
		        +"<td>mono</td><td><input type='text' name='mono' value='"+v.getMono()+"'></td>"
		        +"</tr>"
		        +"<tr>"
		        	+"<td>gender:</td>"
		        		+"<td><select name='gender' style='width:120px'>"
		        		+"<option>male</option>"
		        		+"<option>female</option>"
		        		+"</select>"
		        	+"</td>"
		        +"</tr>"
		        +"<tr>"
		        +"<td>voterid:</td><td><input type='text' name='voterid' value='"+v.getVoterid()+"'></td>"
		        +"</tr>"
		        +"<tr>"
		        	+"<td colspan='2'><input type='submit' value='Submit and Save Voters'></td>"
		        +"</tr>"
		        +"</table>"
		        +"</form>");

	
	}

}
