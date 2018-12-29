<%--
  Created by IntelliJ IDEA.
  User: wyan
  Date: 2018/12/20
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!-- 导航侧栏 -->
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p><security:authentication property="principal.username"></security:authentication></p>
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>
        <!-- search form -->
        <!--<form action="#" method="get" class="sidebar-form">
    <div class="input-group">
        <input type="text" name="q" class="form-control" placeholder="搜索...">
        <span class="input-group-btn">
        <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
        </button>
      </span>
    </div>
</form>-->
        <!-- /.search form -->


        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">菜单</li>

            <li id="admin-index"><a href="all-admin-index.html"><i class="fa fa-dashboard"></i> <span>首页</span></a></li>

            <!-- 菜单 -->


            <li class="treeview">
                <a href="#">
                    <i class="fa fa-book"></i> <span>数据管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <security:authorize access="hasAnyRole('ROLE_PRODUCT','ROLE_ADMIN','ROLE_USER')">
                    <li id="travellog-manage">
                        <a href="${pageContext.request.contextPath}/product/findAllProducts">
                            <i class="fa fa-circle-o"></i> 产品列表
                        </a>
                    </li>
                    </security:authorize>

                    <security:authorize access="hasAnyRole('ROLE_ORDER','ROLE_ADMIN','ROLE_USER')">
                    <li id="travellog-review">
                        <a href="${pageContext.request.contextPath}/order/findAllOrders">
                            <i class="fa fa-circle-o"></i> 订单列表
                        </a>
                    </li>
                    </security:authorize>
                    <%--<li id="travellog-setting">--%>
                        <%--<a href="all-travellog-setting-edit.html">--%>
                            <%--<i class="fa fa-circle-o"></i> 游记设置--%>
                        <%--</a>--%>
                    <%--</li>--%>

                </ul>
            </li>



            <%--系统管理--%>
            <security:authorize access="hasAnyRole('ROLE_ADMIN')">
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-cogs"></i> <span>系统管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li id="system-setting">
                        <a href="${pageContext.request.contextPath}/user/findAllUser">
                            <i class="fa fa-circle-o"></i> 用户管理
                        </a>
                    </li>
                    <li id="usermanagee">
                        <a href="${pageContext.request.contextPath}/role/findAllRoles">
                            <i class="fa fa-circle-o"></i> 角色管理
                        </a>
                    </li>

                </ul>
            </li>
            </security:authorize>





        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
<!-- 导航侧栏 /-->
