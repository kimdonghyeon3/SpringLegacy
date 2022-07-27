<%@ page import="usr.article.dto.ArticleDto" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    ArticleDto article = (ArticleDto)request.getAttribute("article");
%>

<h1>게시물 상세페이지</h1>

<div>
    <% if ( article != null ) { %>
    <div>
        ID : <%=article.getId()%>
    </div>
    <div>
        TITLE : <%=article.getTitle()%>
    </div>
    <div>
        BODY : <%=article.getBody()%>
    </div>
    <% } %>
</div>

<form method="GET" action="/usr/article/delete/free/<%=article.getId()%>">
    <input type="submit" value="삭제"/>
</form>
<form method="GET" action="/usr/article/modify/free/<%=article.getId()%>">
    <input type="submit" value="수정"/>
</form>