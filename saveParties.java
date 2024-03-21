package VotePro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class saveParties
 */
@WebServlet("/saveParties")
public class saveParties extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	
		PrintWriter out=response.getWriter();
		String voterid=request.getParameter("voterid");
		String party=request.getParameter("party");
		
		response.setContentType("text/html");
		out.println("<body background='thanku.jpeg' bakground-repeat:no-repeat>");
		
		//out.println("<link rel='stylesheet' type='text/css' href='partyservlet.css'>");
		
		parties p=new parties();
		p.setVoterid(voterid);
		p.setParty(party);
		
		int status=votersconnect.savev(p);
		
		if(status>0)
		{
			out.println("<p>Saved records successfully..!</p>");		
		}
		else
		{
			out.println("Sorry! Unable to save record");
		}
		/*String party = null;
		
		if(party.equals("BJP"))
		{
			System.out.println("Congratulations");
		}
		else if(party.equals("Congress"))
		{
			System.out.println("Congratulations");
		}
		else if(party.equals("Shivsena"))
		{
			System.out.println("Congratulations");
			
		}
		else if(party.equals("NDA"))
		{
			System.out.println("Congratulations");
		}
		else
		{
			System.out.println("Sorry");
		}
		*/
	}

}
