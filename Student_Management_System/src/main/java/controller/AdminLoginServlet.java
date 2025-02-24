package controller;

import java.io.*;
import model.dao.AdminLoginDAO;
import model.AdminBean;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/adminlogin")
public class AdminLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        AdminBean ab = new AdminBean();

        int adminId = Integer.parseInt(req.getParameter("admin-id"));
        String password = req.getParameter("password");

        // Pass the parameters to the DAO for validation
        ab = new AdminLoginDAO().login(adminId, password);

        if (ab != null) {
            HttpSession hs = req.getSession(); // Create a new session
            hs.setAttribute("abean", ab);
            req.getRequestDispatcher("staff_home.jsp").forward(req, res);
        } else {
            req.setAttribute("msg", "Invalid Username or Password");
            RequestDispatcher rd = req.getRequestDispatcher("admin_sign_in.jsp");
            rd.forward(req, res);
        }
    }
}