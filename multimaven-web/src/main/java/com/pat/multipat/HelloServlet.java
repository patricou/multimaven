package com.pat.multipat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by patricou on 22/10/2017.
 */
public class HelloServlet
    extends javax.servlet.http.HttpServlet
implements javax.servlet.Servlet {
        private static final Logger log = LoggerFactory.getLogger(HelloServlet.class);
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            try {
                log.info("hi");
                PrintWriter out = response.getWriter();
                out.println("Projet Maven la centrale-web : Servlet Lancée");
                out.flush();
                out.close();
            }catch (IOException e){
                log.info("Exception in Servlet");
            }
        }
    }
