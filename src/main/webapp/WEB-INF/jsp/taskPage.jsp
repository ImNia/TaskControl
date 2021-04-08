<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
    <head><title>Page task ${task.idTask}</title></head>
    <body>
        <h3> Task  ${task.idTask} </h3>

        <table>
            <tr>
                <td>Id task: </td>
                <td>${task.idTask}</td>
            </tr>
            <tr>
                <td>Status task: </td>
                <td>${task.status}</td>
            </tr>
            <tr>
                <td>Priority: </td>
                <td>${task.priority}</td>
            </tr>
            <tr>
                <td>Description: </td>
                <td>${task.description}</td>
            </tr>
            <tr>
                <td>dateStart: </td>
                <td>${task.dateStart}</td>
            </tr>
            <tr>
                <td>dateEnd: </td>
                <td>${task.dateEnd}</td>
            </tr>

        </table>

        <p>
            <form action="/home" method="get">
                <input type="submit" value="Home" />
            </form>
        </p>
    </body>
</html>