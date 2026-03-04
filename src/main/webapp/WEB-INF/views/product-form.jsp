<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product Form</title>
</head>
<body>
<h2>Product Form</h2>

<form action="<c:url value='/products'/>" method="post">
    <!-- Hidden field for editing -->
    <input type="hidden" name="id" value="${product.id}"/>

    Name: <input type="text" name="name" value="${product.name}" required/><br/><br/>
    Price: <input type="number" step="0.01" name="price" value="${product.price}" required/><br/><br/>
    Quantity: <input type="number" name="quantity" value="${product.quantity}" required/><br/><br/>

    <input type="submit" value="Save"/>
    <a href="<c:url value='/products'/>">Cancel</a>
</form>

</body>
</html>