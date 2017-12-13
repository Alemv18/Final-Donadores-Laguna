/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import data.DBConnection;
import data.DonadorDAO;
import data.ReceptorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Donador;
import models.Receptor;

/**
 *
 * @author juans
 */
@WebServlet(name = "RegistroReceptorServlet", urlPatterns = {"/registroReceptor"})
public class RegistroReceptorServlet extends HttpServlet {
    
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
        
        
        //Parse birthdate before creating object
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        java.util.Date parsed = null;
        try {
            parsed = format.parse(request.getParameter("nacimiento"));
        } catch (ParseException ex) {
            Logger.getLogger(RegistroReceptorServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.sql.Date fechaNacimiento = new java.sql.Date(parsed.getTime());
        
        //Create receptor object
        Receptor receptor = new Receptor(request.getParameter("nombre"),
                                      request.getParameter("apellidoP") + " " +  request.getParameter("apellidoM"),
                                      fechaNacimiento,
                                      request.getParameter("sexo"),
                                      request.getParameter("sangre2") + request.getParameter("sangre1"),
                                      request.getParameter("diagnostico"),
                                      request.getParameter("ubicacion"));
                                      
        
        
         //Make DB connection
        DBConnection dbConn = new DBConnection();
        Connection conn = dbConn.getConnection();

        ReceptorDAO receptorDao = new ReceptorDAO(conn);
        receptorDao.insert(receptor);
        
        // set User object in request object and set URL
        String resp = "true";
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(message);
        
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
