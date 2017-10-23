package com.pat.multipat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by patricou on 22/10/2017.
 */
public class HelloServlet
    extends javax.servlet.http.HttpServlet
implements javax.servlet.Servlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("Projet Maven la centrale-web : Servlet Lancée");
            out.flush();
            out.close();
        }
    }
