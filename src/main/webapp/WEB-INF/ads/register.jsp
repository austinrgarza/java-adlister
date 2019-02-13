<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<jsp:include page="/WEB-INF/partials/head.jsp">--%>
        <%--<jsp:param name="title" value="Register" />--%>
    <%--</jsp:include>--%>
<%--</head>--%>
<%--<body>--%>
    <%--<main class="container">--%>
        <%--<h1>Register</h1>--%>
        <%--<p>Fill out the form below!</p>--%>
        <%--<hr class="hr-4">--%>

        <%--<form action="/register" method="POST">--%>
            <%--<article class="row">--%>
                <%--<label for="email" class="col-5">Enter your email: </label>--%>
                <%--<input type="text" name="email" id="email" class="col-6">--%>
            <%--</article>--%>

            <%--<article class="row">--%>
                <%--<label for="username" class="col-5">Enter your username: </label>--%>
                <%--<input type="text" name="username" id="username" class="col-6">--%>
            <%--</article>--%>

            <%--<article class="row">--%>
                <%--<label for="password" class="col-5">Enter your password:</label>--%>
                <%--<input type="password" name="password" id="password" class="col-6">--%>
            <%--</article>--%>

            <%--<input type="submit">--%>
        <%--</form>--%>
    <%--</main>--%>
<%--</body>--%>
<%--</html>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
        <jsp:include page="/WEB-INF/partials/head.jsp">
            <jsp:param name="Register" value="Register a New User" />
        </jsp:include>
    </head>
    <body>
        <div class="container">
            <h1>Create a new Ad</h1>
            <form action="register" method="post">
                <div class="form-group">
                    <label for="username">Username</label>
                    <input id="username" name="username" class="form-control" type="text">
                    <label for="password">Password</label>
                    <input id="password" name="password" class="form-control" type="password">
                </div>
                <div class="form-group">
                    <label for="email">Email Address</label>
                    <textarea id="email" name="email" class="form-control" type="text"></textarea>
                </div>
                <input type="submit" class="btn btn-block btn-primary">
            </form>
        </div>
    </body>
    </html>
</body>
</html>