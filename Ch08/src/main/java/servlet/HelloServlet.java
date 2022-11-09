package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		// 헤당 서블릿이 최초 실행될 때 한번 호출
		System.out.println("HelloServlet init...");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 클라이언트의 요청방식이 GET일 경우 호출되는 메서드
		System.out.println("HelloServlet doGET...");

		resp.setContentType("text/html;charset=UTF-8");

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<head>");
		writer.print("<meta charset='UTF-8'>");
		writer.print("<title>HelloServlet</title>");
		writer.print("</head>");
		writer.print("<body>");
		writer.print("<h3>HelloServlet</h3>");
		writer.print("<p>");
		writer.print("<a href='./1_서블릿.jsp'>서블릿 메인</a><br/>");
		writer.print("<a href='./hello.do'>HelloServlet</a><br/>");
		writer.print("</p>");
		writer.print("</body>");
		writer.print("</html>");
		writer.close();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 클라이언트의 요청방식이 POST일 경우 호출되는 메서드
		System.out.println("HelloServlet doPOST...");

	}

	@Override
	public void destroy() {
		// 서블릿이 종료될떄 호툴되는 메서드
		System.out.println("HelloServlet destory...");

	}

}
