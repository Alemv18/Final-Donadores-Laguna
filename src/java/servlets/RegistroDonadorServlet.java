/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import data.DBConnection;
import data.DonadorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
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

@WebServlet(name = "RegistroDonadorServlet", urlPatterns = {"/registroDonador"})
public class RegistroDonadorServlet extends HttpServlet {

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
        
        //Parse birthdate before creating object
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        java.util.Date parsed = null;
        try {
            parsed = format.parse(request.getParameter("nacimiento"));
        } catch (ParseException ex) {
            Logger.getLogger(RegistroDonadorServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.sql.Date fechaNacimiento = new java.sql.Date(parsed.getTime());
        
        //Create donador object
        Donador donador = new Donador(request.getParameter("nombre"),
                                      request.getParameter("apellidoP") + " " +  request.getParameter("apellidoM"),
                                      fechaNacimiento,
                                      request.getParameter("sexo"),
                                      request.getParameter("sangre2") + request.getParameter("sangre1"),
                                      request.getParameter("email"),
                                      request.getParameter("telefono"),
                                      request.getParameter("direccion"),
                                      Integer.parseInt(request.getParameter("cp")));
        
        
         //Make DB connection
        DBConnection dbConn = new DBConnection();
        Connection conn = dbConn.getConnection();

        DonadorDAO donadorDao = new DonadorDAO(conn);
        donadorDao.insert(donador);

        Boolean isReg = true;
        
        // set User object in request object and set URL
        
        request.setAttribute("isReg", isReg);
        request.setAttribute("donador", donador);
        url = "/index.jsp"; // the "thanks" page

            
        // forward request and response objects to specified URL
        getServletContext()
        .getRequestDispatcher(url)
        .forward(request, response);
        
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
