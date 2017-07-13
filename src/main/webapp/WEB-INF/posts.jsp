<%@ page import="com.first.Main" %>
<%@ page import="java.util.List" %>
<%@ page import="com.first.Post" %><%--
  Created by IntelliJ IDEA.
  User: Igor
  Date: 02.06.2017
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%--<%= Main.test()%> <br> <%= "qqqqq"%>--%>
  <% List<Post> posts = (List<Post>) request.getAttribute ("posts"); %>

   <ul>
       <% for (Post post : posts) {  %>
          <li> <%= post.getTxt() %> </li>
       <% } %>
   </ul>

  </body>
</html>
