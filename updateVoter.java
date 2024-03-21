
package VotePro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateVoter
 */
@WebServlet("/updateVoter")
public class updateVoter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			System.out.println("update voters");
			PrintWriter out=response.getWriter();
			String sadharno=request.getParameter("adharno");
			int adharno=Integer.parseInt(sadharno);
			
			String fname=request.getParameter("fname");
			String mname=request.getParameter("mname");
			String lname=request.getParameter("lname");
			String mono=request.getParameter("mono");
			String gender=request.getParameter("gender");
			String voterid=request.getParameter("voterid");
			
			voter v=new voter();
			
			v.setFname(fname);
			v.setMname(mname);
			v.setLname(lname);
			v.setAdharno(adharno);
			v.setMono(mono);
			v.setGender(gender);
			v.setVoterid(voterid);
			
			int status=votersconnect.update(v);
			out.println("status="+status);
			
			if(status>0)
			{
				response.sendRedirect("viewVoter");
				request.getRequestDispatcher("/viewVoter").include(request, response);
			}
			else
			{
				out.println("Sorry! Unable to save record");
			}
	}

}
