

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formulaire_servlet
 */
@WebServlet("/formulaire_servlet")
public class formulaire_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formulaire_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opr1=request.getParameter("opr1");
		String opr2=request.getParameter("opr2");
		String operation=request.getParameter("operation");
		String page="";
		if(((opr1.equals(""))||(opr2.equals("")))||(!(opr1.matches("[0-9]*"))||!(opr2.matches("[0-9]*")))||(operation==null))
{page="erreur.jsp";} else {page="response.jsp";}
RequestDispatcher dispinfo=request.getRequestDispatcher(page);
dispinfo.forward(request, response);
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
