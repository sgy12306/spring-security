<%--
  Created by IntelliJ IDEA.
  User: wyan
  Date: 2018/12/20
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">




    <title>数据 - AdminLTE2定制版</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">




    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">

    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <link rel="stylesheet" href="./plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="./plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="./plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="./plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="./plugins/morris/morris.css">
    <link rel="stylesheet" href="./plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="./plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="./plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="./plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="./plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="./plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="./plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="./plugins/select2/select2.css">
    <link rel="stylesheet" href="./plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="./plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="./plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="./plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="./plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="./plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="./plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition skin-purple sidebar-mini">

<div class="wrapper">


    <jsp:include page="./pages/header.jsp"></jsp:include>
    <jsp:include page="./pages/sider.jsp"></jsp:include>
    <!-- 内容区域 -->
    <div class="content-wrapper">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                控制面板
                <small>首页</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="all-admin-index.html"><i class="fa fa-dashboard"></i> 首页</a></li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <!-- 正文区域 -->
        <section class="content">


            <!-- 统计数值 -->
            <div class="row">
                <div class="col-lg-3 col-xs-6">
                    <!-- small box -->
                    <div class="small-box bg-aqua">
                        <div class="inner">
                            <h3>150</h3>

                            <p>新订单</p>
                        </div>
                        <div class="icon">
                            <i class="ion ion-bag"></i>
                        </div>
                        <a href="all-order-manage-list.html" class="small-box-footer">详细 <i class="fa fa-arrow-circle-right"></i></a>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-3 col-xs-6">
                    <!-- small box -->
                    <div class="small-box bg-green">
                        <div class="inner">
                            <h3>53<sup style="font-size: 20px">%</sup></h3>

                            <p>转化率</p>
                        </div>
                        <div class="icon">
                            <i class="ion ion-stats-bars"></i>
                        </div>
                        <a href="all-ad-statistics-list.html" class="small-box-footer">详细 <i class="fa fa-arrow-circle-right"></i></a>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-3 col-xs-6">
                    <!-- small box -->
                    <div class="small-box bg-yellow">
                        <div class="inner">
                            <h3>44</h3>

                            <p>新注册用户</p>
                        </div>
                        <div class="icon">
                            <i class="ion ion-person-add"></i>
                        </div>
                        <a href="all-member-manage-list.html" class="small-box-footer">详细 <i class="fa fa-arrow-circle-right"></i></a>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-3 col-xs-6">
                    <!-- small box -->
                    <div class="small-box bg-red">
                        <div class="inner">
                            <h3>65</h3>

                            <p>日PV</p>
                        </div>
                        <div class="icon">
                            <i class="ion ion-pie-graph"></i>
                        </div>
                        <a href="all-ad-statistics-list.html" class="small-box-footer">详细 <i class="fa fa-arrow-circle-right"></i></a>
                    </div>
                </div>
                <!-- ./col -->
            </div>
            <!-- /.row -->
            <div>
                <a href="javascript:void(0)"><img src="img/6.jpg" width="90%" alt=""></a>
            </div>

        </section>
        <!-- 正文区域 /-->

    </div>
    <!-- 内容区域 /-->

    <!-- 底部导航 -->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 1.0.8
        </div>
        <strong>Copyright &copy; 2014-2017 <a href="http://www.itcast.cn">研究院研发部</a>.</strong> All rights reserved.
    </footer>
    <!-- 底部导航 /-->

</div>


<script src="./plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="./plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="./plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="./plugins/raphael/raphael-min.js"></script>
<script src="./plugins/morris/morris.min.js"></script>
<script src="./plugins/sparkline/jquery.sparkline.min.js"></script>
<script src="./plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="./plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="./plugins/knob/jquery.knob.js"></script>
<script src="./plugins/daterangepicker/moment.min.js"></script>
<script src="./plugins/daterangepicker/daterangepicker.js"></script>
<script src="./plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script src="./plugins/datepicker/bootstrap-datepicker.js"></script>
<script src="./plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script src="./plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="./plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="./plugins/fastclick/fastclick.js"></script>
<script src="./plugins/iCheck/icheck.min.js"></script>
<script src="./plugins/adminLTE/js/app.min.js"></script>
<script src="./plugins/treeTable/jquery.treetable.js"></script>
<script src="./plugins/select2/select2.full.min.js"></script>
<script src="./plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script src="./plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script src="./plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script src="./plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script src="./plugins/bootstrap-markdown/js/markdown.js"></script>
<script src="./plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script src="./plugins/ckeditor/ckeditor.js"></script>
<script src="./plugins/input-mask/jquery.inputmask.js"></script>
<script src="./plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="./plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script src="./plugins/datatables/jquery.dataTables.min.js"></script>
<script src="./plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="./plugins/chartjs/Chart.min.js"></script>
<script src="./plugins/flot/jquery.flot.min.js"></script>
<script src="./plugins/flot/jquery.flot.resize.min.js"></script>
<script src="./plugins/flot/jquery.flot.pie.min.js"></script>
<script src="./plugins/flot/jquery.flot.categories.min.js"></script>
<script src="./plugins/ionslider/ion.rangeSlider.min.js"></script>
<script src="./plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script src="./plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script src="./plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script>
    $(document).ready(function() {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale: 'zh-CN'
        });
    });


    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }


    $(document).ready(function() {
        // 激活导航位置
        setSidebarActive("admin-index");
    });
</script>
</body>

</html>
<!---->