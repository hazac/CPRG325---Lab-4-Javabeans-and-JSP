<%-- 
    Document   : editnote
    Created on : Sep 29, 2021, 2:03:22 PM
    Author     : hazco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note - Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <div>
            <form method="POST" action="note">
                <div>
                    <label><b>Title:</b></label>
                    <input type="text" name="title" value="${note.title}">
                </div>
                <div>
                    <label><b>Contents:</b></label>
                    <textarea type="textbox" name="content" value="" rows="8" cols="24">${note.contents}
                    </textarea>
                </div>
                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
        </div>
    </body>
</html>
