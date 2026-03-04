<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Buyers List</title>
    <style>
        table { border-collapse: collapse; width: 50%; }
        th, td { border: 1px solid #333; padding: 8px; text-align: left; }
        th { background-color: #f2f2f2; }
        a { text-decoration: none; margin: 0 5px; }
    </style>
</head>
<body>
<h2>Buyers</h2>

<p><a href="<c:url value='/buyers/new'/>">Add New Buyer</a></p>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${buyers}" var="buyer">
        <tr>
            <td>${buyer.id}</td>
            <td>${buyer.name}</td>
            <td>${buyer.email}</td>
            <td>
                <a href="<c:url value='/buyers/edit/${buyer.id}'/>">Edit</a>
                <a href="<c:url value='/buyers/delete/${buyer.id}'/>" onclick="return confirm('Delete this buyer?');">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>