package VotePro;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class viewVoter
 */
@WebServlet("/viewVoter")
public class viewVoter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		out.println("<a href='registrationform.html'>Add New Voter's</a>");
		out.println("<h1>Voter's List</h1>");
		
		List <voter> list=votersconnect.getAllvoter();
		

		out.println("<table border=1 width='100%'>");
		out.println("<tr><th>Fname<th>Mname<th>Lname<th>Adhar No<th>Mobile No<th>Gender<th>Voterid<th>Edit</tr>");
		
		for(voter v:list)
		{
			out.println("<tr><td>" 
					+v.getFname()+"<td>"
					+v.getMname()+ "<td>"
					+v.getLname() +"<td>"
					+v.getAdharno()+"<td>"
					+v.getMono()+"<td>"
					+v.getGender()+"<td>"
					+v.getVoterid()
					+"<td><a href=editVoter?adharno="+v.getAdharno()+" "+">Edit</a></tr>");
			
					//+"<td><a href=deleteVoter?adharno="+v.getAdharno()+" "+">Delete</a></tr>");
		}
		out.println("</table>");
	}

}
