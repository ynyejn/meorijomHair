package salon.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import salon.service.SalonService;
import salon.vo.SalonList;

/**
 * Servlet implementation class BranchmanagementServlet
 */
@WebServlet(name = "Branchmanagement", urlPatterns = { "/branchmanagement" })
public class BranchmanagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BranchmanagementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int reqPage = Integer.parseInt(request.getParameter("reqPage"));
		SalonList af = new	SalonService().selectAffilates(reqPage);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/company/branchmanagement.jsp");
		
		request.setAttribute("list", af.getAffilateList());
		request.setAttribute("pageNavi", af.getPageNavi());
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
