<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%
    String nowUrl = request.getRequestURL().toString();
    boolean mainFlag = nowUrl.indexOf("main.jsp") > -1 ? true : false;  // 현재 메인화면 여부
    boolean listFlag = nowUrl.indexOf("/board/") > -1 ? true : false;   // 게시판 여부
%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
        <h1 class="text-light ps-2">JSP Sample</h1>
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link <%=mainFlag ? "active" : ""%>" href="/web/main.jsp">메인화면</a>
            </li>
            <li class="nav-item">
                <a class="nav-link <%=listFlag ? "active" : ""%>" href="/web/board/list.jsp">게시판</a>
            </li>
        </ul>
    </div>
</nav>