package VotePro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class saveVoter
 */
@WebServlet("/saveVoter")
public class saveVoter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
		String mname=request.getParameter("mname");
		String lname=request.getParameter("lname");
		int adharno=Integer.parseInt(request.getParameter("adharno"));
		String mobile=request.getParameter("mono");
		String gender=request.getParameter("gender");
		String voterid=request.getParameter("voterid");
		
		voter v=new voter();
		v.setFname(fname);
		v.setMname(mname);
		v.setLname(lname);
		v.setAdharno(adharno);
		v.setMono(mobile);
		v.setGender(gender);
		v.setVoterid(voterid);
		
		int status=votersconnect.save(v);
		
		parties p=new parties();
		p.setVoterid(voterid);
		int st=votersconnect.savev(p);
		
		if(status>0)
		{
			out.println("<p>Saved records successfully</p>");
			request.getRequestDispatcher("voterpoll.html").include(request, response);
		}
		else
		{
			out.println("Sorry!Unable to save records");
		}
	}

}
