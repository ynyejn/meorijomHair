package affiliate.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import affilate.service.AffilateService;
import affilate.vo.AffilateList;

/**
 * Servlet implementation class AffilateoneServlet
 */
@WebServlet(name = "Affilateone", urlPatterns = { "/affilateone" })
public class AffilateoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AffilateoneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sq = request.getParameter("search1");
		
		AffilateList af = new	AffilateService().selectAffilate(sq);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/company/branchList.jsp");
		request.setAttribute("list", af.getAffilateList());
		request.setAttribute("star", af.getReviewStar());
		
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
