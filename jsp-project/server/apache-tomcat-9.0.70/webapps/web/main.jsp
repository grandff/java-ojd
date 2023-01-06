<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%    
    String nowBoardCount = String.valueOf(session.getAttribute("totalCount")).replaceAll("null", "0");   // 현재 게시글 갯수
    String nowUrl = request.getRequestURL().toString();
    boolean mainFlag = nowUrl.indexOf("main.jsp") > -1 ? true : false;  // 현재 메인화면 여부
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>메인화면</title>
    <link rel="stylesheet" href="/css/bootstrap.css" />
    <link rel="stylesheet" href="/css/common.css" />
    <script type="text/javascript" src="/js/bootstrap/bootstrap.min.js"></script>    
    <script type="text/javascript" src="/js/common.js"></script>    
</head>
<body>
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <div class="container-fluid">
            <h1 class="text-light ps-2">JSP Sample</h1>
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link <%=mainFlag ? "active" : ""%>" href="/web/main.jsp">메인화면</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/web/board/list.jsp">게시판</a>
                </li>
            </ul>
        </div>
    </nav>
    <div class="container mt-5">
        <div class ="flex mb-5">
            <h2>현재 당신이 등록한 게시글 수는... <%=nowBoardCount%>건 입니다. </h2>            
        </div>
        <div class="row">
            <div class="col-sm-4">
                <h2>About Me</h2>
                <h5>Photo of me:</h5>
                <div class="fakeimg">Fake Image</div>
                    <p>Some text about me in culpa qui officia deserunt mollit anim..</p>
                    <h3 class="mt-4">Some Links</h3>
                    <p>Lorem ipsum dolor sit ame.</p>
            <ul class="nav nav-pills flex-column">
                <li class="nav-item">
                <a class="nav-link active" href="#">Active</a>
                </li>
                <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
                </li>
                <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
                </li>
                <li class="nav-item">
                <a class="nav-link disabled" href="#">Disabled</a>
                </li>
            </ul>
            <hr class="d-sm-none">
        </div>
        <div class="col-sm-8">
            <h2>TITLE HEADING</h2>
            <h5>Title description, Dec 7, 2020</h5>
            <div class="fakeimg">Fake Image</div>
                <p>Some text..</p>
                <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
                <h2 class="mt-5">TITLE HEADING</h2>
                <h5>Title description, Sep 2, 2020</h5>
                <div class="fakeimg">Fake Image</div>
                    <p>Some text..</p>
                    <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
                </div>
            </div>
        </div>
    </div>
    <div class="mt-5 p-4 bg-dark text-white text-center">
        <p>Copyright 2023. grandff All rights reserved.</p>
    </div>
</body>
</html>