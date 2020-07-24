<%-- 
    Document   : bxh
    Created on : Mar 26, 2020, 1:24:26 AM
    Author     : PC
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="entity.Select"%>
<%@page import="controller.RecordController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
    </head>
    <body>
        <div class="education-section section">
            <div class="container">
                <div class="row">
                    <div class="col-sm-4">
                        <div class="heading">
                                <h3><b><s:message code="user.bxh.title"/></b></h3>
                                <h6 class="font-lite-black"><b><s:message code="user.bxh.title.top10"/></b></h6>
                        </div> <center>
                        <div class="row1" style="margin-left:-100px;">  
                            <div class="col1">
                              <div class="bxh">
                                  <img src="dist/images/bxh.png" alt="" style="width: 150px;">
                                  <h5 ><s:message code="user.bxh.title"/></h5>
                              </div>
                                <c:forEach var="a" items="${top1}">
                              <img class="avt" src="images/${a[0]}" alt="" style="width: 150px;">  
                              <div class="avatar"> 
                                  <h3>${a[1]}</h3> 
                                  <h5><s:message code="user.bxh.depart"/>: ${a[2]}</h5>
                                  <h5><s:message code="user.bxh.total"/>: ${a[3]}</h5>
                              </div>
                              </c:forEach>
                            </div>
                        </div>
                            </center>
                    </div><!-- col-sm-4 -->
                    <div class="col-sm-8">
                        <div class="col2">
            <div class="row">
                <div class="col-12">
                  <div class="card">
                    <div class="card-header pb-0">
                        <div class="form-row">
                        <div class="form-group col-12">
                            <form action="user/searchtop10.htm" >
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
                        </form>
                          </div>
                        </div>
                            </div>
                    </div>
                    <!-- /.card-header -->
                    <div class="card-body table-responsive p-0">
                      <table class="table table-hover text-nowrap">
                        <thead>
                          <tr>
                            <th style="width: 100px;" ><s:message code="user.bxh.table.rank"/></th>
                            <th></th>
                            <th><s:message code="user.bxh.table.name"/></th>
                            <th><s:message code="user.bxh.table.depart"/></th>
                            <th><svg class="bi bi-star-fill" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                <path d="M5.612 17.443c-.386.198-.824-.149-.746-.592l.83-4.73-3.522-3.356c-.33-.314-.16-.888.282-.95l4.898-.696 2.184-4.327c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.283.95l-3.523 3.356.83 4.73c.078.443-.36.79-.746.592L10 15.187l-4.389 2.256z"></path>
                              </svg></th>
                          </tr>
                        </thead>
                        <tbody id="myTable">
                            <!-- top 1 -->
                            <c:forEach var="a" items="${top1}">
                          <tr>
                            <td class="no"><img src="dist/images/no1.png" alt="" style="width: 50px; height:50px;"></td>
                            <td class="avatartbl"><img src="images/${a[0]}" alt="" style="width: 50px; height:50px;"></td>
                            <td>${a[1]}</td>
                            <td>${a[2]}</td>
                            <td>${a[3]}</td>
                          </tr>
                            </c:forEach>
                            <!-- top 2 -->
                          <c:forEach var="a" items="${top2}">
                          <tr>
                            <td class="no"><img src="dist/images/no2.png" alt="" style="width: 50px; height:50px;"></td>
                            <td class="avatartbl"><img src="images/${a[0]}" alt="" style="width: 50px; height:50px;"></td>
                            <td>${a[1]}</td>
                            <td>${a[2]}</td>
                            <td>${a[3]}</td>
                          </tr>
                            </c:forEach>
                                <!-- top 3-->
                          <c:forEach var="a" items="${top3}">
                          <tr>
                            <td class="no"><img src="dist/images/no3.png" alt="" style="width: 50px; height:50px;"></td>
                            <td class="avatartbl"><img src="images/${a[0]}" alt="" style="width: 50px; height:50px;"></td>
                            <td>${a[1]}</td>
                            <td>${a[2]}</td>
                            <td>${a[3]}</td>
                          </tr>
                            </c:forEach>
                          <c:set var="count" value="3"/>
                            <c:forEach var="a" items="${top10}">
                          <tr>
                            <c:set var="count" value="${count+1}"/>
                            <td style="padding-left: 25px; font-size: 25px;" >${count}</td>
                            <td class="avatartbl"><img src="images/${a[0]}" alt="" style="width: 50px; height:50px;"></td>
                            <td>${a[1]}</td>
                            <td>${a[2]}</td>
                            <td>${a[3]}</td>
                          </tr>
                            </c:forEach>
                        </tbody>
                      </table>
                    </div>
                    <!-- /.card-body -->
                  </div>
                  <!-- /.card -->
                </div>
              </div>
          </div>
                    </div><!-- col-sm-8 -->
                </div><!-- row -->
            </div><!-- container -->

        </div><!-- about-section -->
<style>
            


</style>                     
    </body>
</html>
