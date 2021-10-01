/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author hazco
 */
public class NoteServlet extends HttpServlet {
    
    String path;
    BufferedReader br;
    PrintWriter pw;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{
            path = getServletContext().getRealPath("/WEB-INF/note.txt");
            br = new BufferedReader(new FileReader(new File(path)));
            if (br.ready()){
                String t = br.readLine();
                System.out.println(t);
                String c = br.readLine();
                System.out.println(c);
                Note note1 = new Note(t, c);
                request.setAttribute("note", note1);
                br.close();
            }
        }
        catch(IOException e){
            request.setAttribute("fileErr", e.getMessage());
        }   
       if(request.getParameter("edit") != null){
           getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request,response);
       }
       else{
           getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
       }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        String ttl = request.getParameter("title");
        System.out.println(ttl);
        String cntds = request.getParameter("content");
        System.out.println(cntds);
        
        pw.println(ttl);
        pw.println(cntds);
        
        Note note2 = new Note(ttl, cntds);
        request.setAttribute("note", note2);
        pw.close();
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
    }
}
