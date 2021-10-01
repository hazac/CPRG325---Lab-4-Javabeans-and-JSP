<%-- 
    Document   : viewnote
    Created on : Sep 29, 2021, 2:03:01 PM
    Author     : hazco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note - Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <div>
            <p><span><b>Title:</b></span> ${note.title}</p>
        </div>
        <div>
            <div>
                <span><b>Contents:</b></span>
            </div>
            <div>
                <span>${note.contents}</span>
            </div>
            <p><a href="note?edit">Edit</a></p>
        </div>
    </body>
</html>
