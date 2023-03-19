package controller;


import model.Team;
import service.TeamDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "SearchTeamServlet", value = {"/SearchTeamServlet"})
public class SearchTeamServlet extends HttpServlet {
    private TeamDao teamDao;
    public void init(){
        teamDao = new TeamDao();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchTeam = request.getParameter("searchTeam");
        List<Team> teamList = null;
        try {
            teamList = teamDao.findTeam(searchTeam);
            request.setAttribute("teamList", teamList);
            request.getRequestDispatcher("/WEB-INF/views/dashboard/dashboard.jsp").forward(request,response);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
