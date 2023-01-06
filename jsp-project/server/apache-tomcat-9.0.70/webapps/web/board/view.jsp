<%@ page language="java" contentType="text/html; charset=UTF-8"  
pageEncoding="UTF-8" import="java.util.*,java.util.stream.Collectors"%>
<%
    String num = request.getParameter("num");   // 게시글 번호
    List<HashMap<String,String>> boardList  = (List) session.getAttribute("list");    // 게시글 목록

    // 게시글 번호로 해당 게시글 정보 조회
    List<HashMap<String, String>> detailList = boardList.stream()
        .filter(t -> num.equals(t.get("num")))
        .collect(Collectors.toList());
    HashMap<String,String> detailMap = detailList.get(0);
    
%>
<%@ include file="../common/header.jsp" %>
<body>
    <%@ include file="../common/nav.jsp" %>
    <div class="container mt-5">
        <div class="mb-3 mt-3">
            <label for="num" class="form-label">게시글 번호</label>
            <input type="text" class="form-control" id="num" name="num" readonly value="<%=detailMap.get("num")%>">
        </div>
        <div class="mb-3">
            <label for="title" class="form-label">제목</label>
            <input type="text" class="form-control" id="title" name="title" readonly value="<%=detailMap.get("title")%>">
        </div>  
        <div class="mb-3">
            <label for="pwd" class="form-label">내용</label>
            <textarea class="form-control" rows="5" id="ctt" name="ctt" readonly><%=detailMap.get("ctt")%></textarea>                     
        </div>          
        <div class="d-flex justify-content-end">
            <button class="btn btn-secondary" onclick="goToList();">목록</button>
        </div>
    </div>
</body>
<%@ include file="../common/footer.jsp" %>