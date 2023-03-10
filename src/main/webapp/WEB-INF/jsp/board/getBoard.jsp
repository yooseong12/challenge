<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>글상세</title>
    <style>
        table {
            width: 100%;
            border: 1px solid #444444;
            border-collapse: collapse;
        }
        table th {
            border: 1px solid #444444;
            text-align: center;
            height: 40px;
            background-color: dodgerblue;
            color: cornsilk;
        }
        table td {
            border: 1px solid #444444;
            text-align: left;
        }
    </style>
</head>
<body>
<div style="text-align: center;">
    <h3>글 상세 조회</h3>
    <hr>
        <table style="width: 700px; margin: auto">
            <tr>
                <td width="70" style="background-color: dodgerblue; color: cornsilk">제목</td>
                <td>${board.title}</td>
            </tr>
            <tr>
                <td style="background-color: dodgerblue; color: cornsilk">작성자</td>
                <td>${board.writer}</td>
            </tr>
            <tr>
                <td style="background-color: dodgerblue; color: cornsilk">내용</td>
                <td>${board.content}</td>
            </tr>
            <tr>
                <td style="background-color: dodgerblue; color: cornsilk">등록일</td>
                <td><fmt:formatDate value="${board.createDate}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
            </tr>
            <tr>
                <td style="background-color: dodgerblue; color: cornsilk">조회수</td>
                <td>${board.cnt}</td>
            </tr>
        </table>
    <hr>
    <!--<a href="deleteBoard?id=${board.id}">글삭제</a> -->
    <a href="getBoardList">글목록</a>
    <a href="updateBoardView?id=${board.id}">글수정</a>
</div>
</body>
</html>