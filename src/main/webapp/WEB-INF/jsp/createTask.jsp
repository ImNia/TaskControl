<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html xmlns:th="https://www.thymeleaf.org">
    <head><title>Create Task</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Create Task</h1>
        <form:form action="/createTask" method="post" modelAttribute="task">
            <form:label path="idTask">Id: </form:label>
            <form:input path="idTask" readonly="true"/><br/>

            <form:label path="status">Status: </form:label>
            <form:input path="status" readonly="true"/><br/>
            <form:label path="priority">Priority: </form:label>
            <form:input path="priority" /><br/>

            <form:label path="description">Description: </form:label>
            <form:input path="description" /><br/>

            <form:label path="dateStart">Date Start: </form:label>
            <form:input path="dateStart" /><br/>

            <form:label path="dateEnd">Date End: </form:label>
            <form:input path="dateEnd" /><br/>

            <form:button>Create</form:button>
        </form:form>
        <form action="/home" method="get">
            <input type="submit" value="Home Page" />
        </form>
    </body>
</html>