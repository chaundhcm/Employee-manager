<%-- 
    Document   : showdepart
    Created on : Feb 21, 2020, 10:16:51 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC Group</title>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.9/angular.min.js"></script>
    </head>
    <body>
        <h2 style="padding: 10px; font-weight: bold"><s:message code="admin.depart.showDepart.title"/></h2>
        <p class="text-success" >${message}</p>
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal-lg">
                  <s:message code="admin.depart.showDepart.btnNew"/>
                </button>

                <div class="card-tools">
                  <div class="input-group input-group-sm" style="width: 150px;">
                    <input type="text" name="table_search" class="form-control float-right" placeholder="Search" id="myInput">
                    <div class="input-group-append">
                      <button type="submit" class="btn btn-default"><i class="fas fa-search"></i></button>
                    </div>
                  </div>
                </div>
              </div>
              <div class="card-body table-responsive p-0" style="height: 300px;">
                  <table class="table table-head-fixed text-nowrap" >
                  <thead>
                    <tr style="text-align: center">
                      <th><s:message code="admin.depart.showDepart.table.id"/></th>
                      <th><s:message code="admin.depart.showDepart.table.name"/></th>
                      <th></th>
                    </tr>
                  </thead>
                  <tbody id="myTable">
                    <c:forEach var="u" items="${departs}">
                        <tr style="text-align: center">
                      <td>${u.id}</td>
                      <td><span class="badge badge-success">${u.name}</span></td>
                      <td>
                          <a href="admin/depart/upd/${u.id}.htm" class="fas fa-edit" />
                          <a href="admin/depart/delete/${u.id}.htm" class="fas fa-trash-alt" style="padding-left: 10px;" />
                      </td>
                    </tr>
                    </c:forEach>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
<!-- Modal -->
      <div class="modal fade" id="modal-lg">
        <div class="modal-dialog modal-lg">
          <div class="modal-content">
            <div class="modal-header">
              <h4 class="modal-title">Thêm mới depart</h4>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
                <!----- -->
                    <form action="admin/depart/insert.htm" method="post">
                    <div class="form-group">
                    <label>ID:</label>
                    <input type="text" class="form-control" placeholder="Nhập id" name="id" required>
                    </div>
                    <div class="form-group">
                      <label>Tên phòng: </label>
                      <input type="text" class="form-control" placeholder="Nhập tên phòng" name="name" required>
                    </div>
                    <hr>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary" style="margin-left: 600px;" >Lưu</button>
                    </form>

                <!-- ----->
            </div>
          </div>
          <!-- /.modal-content -->
        </div>
        <!-- /.modal-dialog -->
      </div>

    <script>
    $(document).ready(function(){
      $("#myInput").on("keyup", function() {
        var value = $(this).val().toLowerCase();
        $("#myTable tr").filter(function() {
          $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
      });
    });
    </script>       
    </body>
</html>
