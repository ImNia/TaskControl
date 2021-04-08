<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
    <head><title>HomePage</title></head>
    <body>
        <p>
        Hello, my friends!
        <c:forEach items="${task}" var="taskCur">
        <table bordercolor="yellow">
            <tr>
            <td>${taskCur.idTask}</td>
            <td>${taskCur.description}</td>
            <td><form action="/task/${taskCur.idTask}" method="get">
                <input type="submit" value="edit"/>
                </form>
            </td>
            </tr>
        </table>
        </c:forEach>

        </p>
        <p>
            <form action="/createTask" method="get">
                <input type="submit" value="Create New Task" />
            </form>
        </p>
    </body>
</html>