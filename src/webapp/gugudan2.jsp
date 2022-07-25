<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    int dan = (int)request.getAttribute("dan");
    int limit = (int)request.getAttribute("limit");
%>

<h1><%=dan%>단</h1>
<h2> modle 2 방식</h2>>
<% for ( int i = 1; i <= limit; i++ ) { %>
<div><%=dan%> * <%=i%> = <%=dan * i%></div>
<% } %>