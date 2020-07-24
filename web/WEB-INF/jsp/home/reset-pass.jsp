<%-- 
    Document   : reset-pass
    Created on : Feb 22, 2020, 3:04:35 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <base href="${pageContext.servletContext.contextPath}/">
        
    </head>
    <body class="hold-transition login-page">
    <div class="login-box">
  <div class="login-logo">
    <a href="home/index.htm"><b>ABC</b> Group</a>
  </div>
  <!-- /.login-logo -->
  <div class="card">
    <div class="card-body login-card-body">
      <p class="login-box-msg">You forgot your password? Here you can easily retrieve a new password.</p>
      ${message}
      <form action="home/recover-password.htm" method="post">
        <div class="input-group mb-3">
          <input type="email" class="form-control" placeholder="Email" name="to">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-12">
            <button type="submit" class="btn btn-primary btn-block">Request new password</button>
          </div>
          <!-- /.col -->
        </div>
      </form>

      <p class="mt-3 mb-1">
        <a href="home/index.htm">Login</a>
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
