<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Buyer Form</title>
</head>
<body>
<h2>Buyer Form</h2>

<form action="<c:url value='/buyers'/>" method="post">
    <!-- Hidden field for editing -->
    <input type="hidden" name="id" value="${buyer.id}"/>

    Name: <input type="text" name="name" value="${buyer.name}" required/><br/><br/>
    Email: <input type="email" name="email" value="${buyer.email}" required/><br/><br/>

    <input type="submit" value="Save"/>
    <a href="<c:url value='/buyers'/>">Cancel</a>
</form>

</body>
</html>