package controller;

import model.User;
import service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/login")
public class  LoginServlet extends HttpServlet {

    LoginService service = new LoginService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        if(action.equals("/login")) {
            response.setContentType("html/text");
            response.setCharacterEncoding("UTF-8");
            request.getRequestDispatcher("WEB-INF/views/login/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        if(action.equals("/login")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username == null || password == null) {
                request.setAttribute("message", "Lỗi Đăng Nhập");
                request.getRequestDispatcher("WEB-INF/views/login/login.jsp").forward(request, response);
            } else {
                User user = service.login(username, password);
                if(user == null){
                    request.setAttribute("message", "Lỗi Đăng Nhập");
                    request.getRequestDispatcher("WEB-INF/views/login/login.jsp").forward(request, response);
                } else {
                    request.setAttribute("message", "Đăng Nhập Thành Công");
                    request.getRequestDispatcher("WEB-INF/views/dashboard/dashboard.jsp").forward(request, response);
                }
            }
        }
    }
}
