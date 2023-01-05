<%@ page language="java" 
contentType="text/html; charset=UTF-8"  
pageEncoding="UTF-8"
import="java.util.*"
%>
<%
    // session check
    ArrayList<HashMap<String,String>> boardList  = new ArrayList<HashMap<String,String>>();    
    boolean successFlag = true;
    try{
        boardList  = (ArrayList) session.getAttribute("list");        
    }catch(Exception e){        
        boardList = new ArrayList<HashMap<String,String>>();        
    }    

    try{
        // get parameter
        String num = String.valueOf(request.getParameter("num"));       // 순번
        String title = String.valueOf(request.getParameter("title"));   // 제목
        String ctt = String.valueOf(request.getParameter("ctt"));       // 내용
        String pwd = String.valueOf(request.getParameter("pwd"));       // 비밀번호
        
        // data save
        HashMap<String, String> map = new HashMap<String,String>();
        map.put("num", num);
        map.put("title", title);
        map.put("ctt", ctt);
        map.put("pwd", pwd);        
        boardList.add(map);

        // session save        
        session.setAttribute("list", boardList);
        session.setAttribute("totalCount", boardList.size());

    }catch(NullPointerException e){        
        successFlag = false;        
    }finally{
%>
<script>
    alert(<%=successFlag%> ? "등록완료" : "등록실패");
    location.href= "/web/board/list.jsp"
</script>
<%
    }
%>