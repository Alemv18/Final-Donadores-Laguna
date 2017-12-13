/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import com.google.gson.Gson;
import data.DBConnection;
import data.DonadorDAO;
import data.ReceptorDAO;
import data.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Donador;
import org.json.simple.JSONObject;

/**
 *
 * @author juans
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {
     
    private static final Logger logger = Logger.getLogger(login.class.getName());
    public static String message = "";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "";
        
        
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        
        logger.log(Level.SEVERE, "{0}{1}", new Object[]{user, password});
        System.out.println(user+password);
        
        JSONObject json = new JSONObject();
        
        //Make DB connection
         DBConnection dbConn = new DBConnection();
         Connection conn = dbConn.getConnection();

         UserDAO usuarioDao = new UserDAO(conn);
         Boolean isAuth = usuarioDao.search(user, password);

         if (isAuth){
            
            url = "admin-site/";
            json.put("url", url);
         }
         else {
             json.put("message", message);
         }
         

        // forward request and response objects to specified URL
        String resp = json.toString();
        
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(resp);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
