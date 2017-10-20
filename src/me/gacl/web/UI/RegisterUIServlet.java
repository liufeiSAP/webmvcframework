package me.gacl.web.UI;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author gacl
 * 涓虹敤鎴锋彁渚涙敞鍐岀殑鐢ㄦ埛鐣岄潰鐨凷ervlet
 * RegisterUIServlet璐熻矗涓虹敤鎴疯緭鍑烘敞鍐岀晫闈�
 * 褰撶敤鎴疯闂甊egisterUIServlet鏃讹紝灏辫烦杞埌WEB-INF/pages鐩綍涓嬬殑register.jsp椤甸潰
 */
public class RegisterUIServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/pages/register.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
