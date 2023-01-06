<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" import="java.util.*"%>
<%
    String totalCount = String.valueOf(session.getAttribute("totalCount")).replaceAll("null","0");
    int boardCount = Integer.parseInt(totalCount);
%>
<%@ include file="../common/header.jsp" %>
<body>
    <%@ include file="../common/nav.jsp" %>
    <div class="container mt-5">
        <h2>게시판</h2>
        <p>기본 게시판</p>
        <table class="table">
            <colgroup>
                <col style="width:20%">
                <col style="width:80%">
            </colgroup>
            <thead>
                <tr>
                    <th>순번</th>
                    <th>제목</th>                
                </tr>
            </thead>
            <tbody>
            <% if(boardCount == 0) { %>
                <tr>
                    <td colspan="2">등록된 게시물이 없습니다.</td>
                </tr>
            <% }else{ 
                ArrayList<HashMap<String,String>> boardList = (ArrayList) session.getAttribute("list"); // 게시글 목록
                for(HashMap<String,String> board : boardList){
            %>
                <tr>
                    <td><%=board.get("num")%></td>
                    <td><a href="#" onclick="goToDetail(<%=board.get("num")%>)"><%=board.get("title")%></a></td>
                </tr>                            
            <%
                }
            %>
            <% } %>            
            </tbody>
        </table>
        <div class="d-flex justify-content-end">
            <button class="btn btn-primary" onclick="goToForm();">등록</button>
        </div>
    </div>
</body>
<%@ include file="../common/footer.jsp" %>