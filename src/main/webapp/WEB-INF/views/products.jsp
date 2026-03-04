<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Products List</title>
    <style>
        table { border-collapse: collapse; width: 70%; }
        th, td { border: 1px solid #333; padding: 8px; text-align: left; }
        th { background-color: #f2f2f2; }
        a { text-decoration: none; margin: 0 5px; }
    </style>
</head>
<body>
<h2>Products</h2>

<!-- Link to add new product -->
<p><a href="<c:url value='/products/new'/>">Add New Product</a></p>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.quantity}</td>
            <td>
                <a href="<c:url value='/products/edit/${product.id}'/>">Edit</a>
                <a href="<c:url value='/products/delete/${product.id}'/>" onclick="return confirm('Delete this product?');">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>