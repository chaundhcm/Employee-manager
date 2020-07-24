<%-- 
    Document   : login
    Created on : Feb 22, 2020, 3:03:12 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body class="hold-transition login-page">
        <div class="login-box">
  <div class="login-logo">
    <a href="home/index.htm"><b>ABC</b> Group</a>
  </div>
  <!-- /.login-logo -->
  <div class="card">
    <div class="card-body login-card-body">
        <p class="login-box-msg" style="font-variant-caps: all-petite-caps; font-size: larger;">Sign in</p>
      <p class="text-success" >${message}</p>
      <form action="home/login.htm" method="post">
        <div class="input-group mb-3">
          <input type="text" class="form-control" placeholder="Email" name="id">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="password" class="form-control" placeholder="Password" name="password">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="row">
          <!-- /.col -->
          <div class="col-12">
            <button type="submit" class="btn btn-primary btn-block">Sign In</button>
          </div>
          <!-- /.col -->
        </div>
      </form>
      <br>
      <!-- /.social-auth-links -->

      <p class="mb-1">
        <a href="home/rspass.htm">I forgot my password</a>
      </p>
      <p class="mb-0">
        <a href="home/register.htm" class="text-center">Register a new membership</a>
      </p>
    </div>
    <!-- /.login-card-body -->
  </div>
</div>
    </body>
</html>
