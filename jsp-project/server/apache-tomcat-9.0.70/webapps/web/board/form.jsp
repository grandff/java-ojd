<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ include file="../common/header.jsp" %>
<%
    String totalCount = String.valueOf(session.getAttribute("totalCount")).replaceAll("null","0");
    int boardCount = Integer.parseInt(totalCount);
    int num = boardCount + 1;
%>
<body>
    <%@ include file="../common/nav.jsp" %>
    <div class="container mt-5">
        <h2>게시판</h2>
        <p>게시글 등록</p>
        <form name="form" id="form" method="post" action="/web/board/action.jsp">
            <input type="hidden" name="num" id="num" value="<%=num%>" />
            <div class="mb-3 mt-3">
                <label for="title" class="form-label">제목</label>
                <input type="text" class="form-control" id="title" placeholder="제목을 입력하세요" name="title" maxlength="100">
            </div>
            <div class="mb-3">
                <label for="ctt" class="form-label">내용</label>
                <textarea class="form-control" rows="5" id="ctt" name="ctt"></textarea>         
            </div>
            <div class="mb-3">
                <label for="pwd" class="form-label">비밀번호</label>
                <input type="password" class="form-control" id="pwd" placeholder="비밀번호를 입력하세요" name="pwd">
            </div>            
        </form>
        <div class="d-flex justify-content-end">
            <button type="button" class="btn btn-primary" onclick="insertBoard();">등록</button>
            <button type="button" class="btn btn-danger ms-1" onclick="">취소</button>
        </div>
    </div>
    <button id="modalToggleBtn" type="button" class="invisible btn btn-primary" data-bs-toggle="modal" data-bs-target="#myModal">    
    </button>
    <!-- The Modal -->
    <div class="modal fade" id="myModal">
        <div class="modal-dialog">
            <div class="modal-content">

            <!-- Modal Header -->
            <div class="modal-header">
                <h4 class="modal-title">등록 실패</h4>
                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
            </div>

            <!-- Modal body -->
            <div class="modal-body">
                필수값을 확인해주세요.
            </div>

            <!-- Modal footer -->
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
    </div>
</body>
<%@ include file="../common/footer.jsp" %>