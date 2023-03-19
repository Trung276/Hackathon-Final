package controller;


import model.Team;
import service.TeamServices;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "SearchTeamServlet", value = {"/search"})
public class SearchTeamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/search.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchTeam = request.getParameter("search-team");
        try {
            TeamServices teamServices = new TeamServices();
            List<Team> teams = teamServices.findTeamByName(searchTeam);
            request.setAttribute("teams", teams);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/search-result.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
