<%-- 
    Document   : showrecord
    Created on : Feb 21, 2020, 10:16:36 PM
    Author     : PC
--%>

<%@page import="entity.Select"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.Depart"%>
<%@page import="java.util.List"%>
<%@page import="controller.RecordController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC Group</title>
        <base href="${pageContext.servletContext.contextPath}/">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.9/angular.min.js"></script>
    </head>
    <body>
        <h2 style="padding: 10px; font-weight: bold"><s:message code="admin.record.showRecord.title"/></h2>
        <p class="text-success" >${message}</p>
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header pb-0">
                  <div class="form-row">
                  <div class="form-group col-2">
                  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal-lg">
                  <s:message code="admin.record.showRecord.btnNew"/>
                </button>
                      </div>
                  <div class="form-group col-8">
                      <form action="admin/record/search.htm" >
                    <div class="row">
                    <div class="form-row col-3.5">
                        <input type="date" class="form-control" name="startdate" value="${startdate}" />
                    </div>
                    <div class="form-row col-3.5">
                        <input type="date" class="form-control" name="enddate" value="${enddate}" />
                    </div>
                    <div class="form-group col-3">
                    <select id="scripts" name="depart_id" class="form-control">
                        <option value="All" label="All" selected="${depart_id}" />
                        <%
                            RecordController dao = new RecordController();
                            ArrayList<Select> ds = dao.fillAllDepart();
                            for(int i =0; i<ds.size();i++){
                                out.print("<option value="+ds.get(i).getId()+">"+ds.get(i).getName()+"</option>");
                            }

                        %>
                    </select>
                  </div>    
                    <div class="form-row col-2">
                    <button type="submit" class="btn btn-primary" style="height: 40px;"><i class="fas fa-filter"></i></button>
                    </div>
                    </div>
                  </form>
                  </div>
                  <div class="form-group col-2">
                <div class="card-tools">
                  <div class="input-group input-group-sm" style="width: 150px;">
                    <input type="text" name="table_search" class="form-control float-right" placeholder="Search" id="myInput" >
                    <div class="input-group-append">
                      <button type="submit" class="btn btn-default"><i class="fas fa-search"></i></button>
                    </div>
                  </div>
                </div>
                </div>
                      </div>
              </div>
              <div class="card-body table-responsive p-0" style="height: 300px;">
                  <table class="table table-head-fixed text-nowrap" >
                  <thead>
                    <tr style="text-align: center">
                      <th><s:message code="admin.record.showRecord.table.staffid"/></th>
                      <th><s:message code="admin.record.showRecord.table.fullname"/></th>
                      <th><s:message code="admin.record.showRecord.table.photo"/></th>
                      <th><s:message code="admin.record.showRecord.table.depart"/></th>
                      <th><s:message code="admin.record.showRecord.table.type"/></th>
                      <th><s:message code="admin.record.showRecord.table.reason"/></th>
                      <th><s:message code="admin.record.showRecord.table.date"/></th>
                      <th></th>
                    </tr>
                  </thead>
                  <tbody id="myTable">
                    <c:forEach var="u" items="${records}">
                        <tr style="text-align: center">
                      <td>${u.staff.id}</td>
                      <td>${u.staff.name}</td>
                      <td><img src="images/${u.staff.photo}" style="width: 50px; height: 50px;"/></td>
                      <th style="color: blue; font-weight: normal; ">${u.staff.depart.name}</th>
                      <td><span class="badge badge-success">${u.type?"Khen thưởng":"Kỷ Luật"}</span></td>
                      <td>${u.reason}</td>
                      <td>${u.date}</td>
                      <td>
                          <a href="admin/record/upd/${u.id}.htm" class="fas fa-edit" />
                          <a href="admin/record/delete/${u.id}.htm" class="fas fa-trash-alt" style="padding-left: 10px;" />
                          <a href="admin/record/maildanhgia/${u.id}.htm" class="fas fa-envelope" style="padding-left: 10px;" />
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
              <h4 class="modal-title">Thêm mới Record</h4>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
                <!----- -->
                    <form action="admin/record/insert.htm" method="post">
                    <div class="form-group">
                    <label>StaffID:</label>
                    <input type="text" class="form-control" placeholder="Nhập StaffID" name="staff.id" value="${staffid.id}" required>
                    </div>
                    <div class="form-group">
                        <label >Kiểu đánh giá: </label> <br>
                    <div class="custom-control custom-radio custom-control-inline">
                    <input type="radio" class="custom-control-input" id="customRadio1" name="type" value="true" required>
                    <label class="custom-control-label" for="customRadio1">Thành Tích</label>
                    </div>
                    <div class="custom-control custom-radio custom-control-inline">
                    <input type="radio" class="custom-control-input" id="customRadio2" name="type" value="false">
                    <label class="custom-control-label" for="customRadio2">Kỷ Luật</label>
                    </div>
                    </div>
                    <div class="form-group">
                      <label>Reason</label>
                      <input type="text" class="form-control" placeholder="Nhập reason" name="reason" required>
                    </div>
                    <div class="form-group">
                    <label>Date:</label>
                    <input type="date" class="form-control" name="date" required>
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
    <script>
(function() {
    // get references to select list and display text box
    var input;
    var sel = document.getElementById('scripts');
    document.getElementById('scripts').onchange = function () {
   input = sel.options[sel.selectedIndex].text;
   $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().indexOf(input) > -1)
    });
    }
}());
</script>
    </body>
</html>
