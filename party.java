package VotePro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class party
 */
@WebServlet("/party")
public class party extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		System.out.println("In doget of party");
		
		String party=request.getParameter("parties");
		String voterid=request.getParameter("voterid");
		
		String str=party;
		
		if(str.equals(party))
			System.out.println("party=BJP");
		else 
		System.out.println("party=Congress");
		
		
			
		
		
	}

}
