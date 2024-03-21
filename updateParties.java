package VotePro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateParties
 */
@WebServlet("/updateParties")
public class updateParties extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String svoterid=request.getParameter("voterid");
		int voterid=Integer.parseInt(svoterid);
		
		String party=request.getParameter("party");
		
		parties p=new parties();
		p.setVoterid(svoterid);
		p.setParty(party);
		
		int status=votersconnect.updatev(p, voterid);
		out.println("staus="+status);
		
		String party1 = null;
		if(party1.equals("BJP"))
		{
			System.out.println("Congratulations");
		}
		else if(party1.equals("NCP"))
		{
			System.out.println("Congratulations");
		}
		else if(party1.equals("RJD"))
		{
			System.out.println("Congratulations");
		}
		else if(party1.equals("AAP"))
		{
			System.out.println("Congratulations");
		}
		else
		{
			System.out.println("Sorry");
		}
		
	}

}
