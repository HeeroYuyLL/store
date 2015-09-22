<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.zebone.cn/btp" prefix="btp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <btp:htmlbase/>
    <title>服务管理内容</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="css/icons.css"/>
    <link rel="stylesheet" type="text/css" href="skin/${sessionScope.skin}/main.css" id="main-css"/>
    <link rel="stylesheet" type="text/css" href="skin/${sessionScope.skin}/jquery-grid.css" id="grid-css"/>
    <link rel="stylesheet" type="text/css" href="skin/${sessionScope.skin}/jquery-dialog.css" id="dialog-css"/>
    <link rel="stylesheet" type="text/css" href="skin/${sessionScope.skin}/jquery.checkForm.css" id="checkform-css"/>
    <link rel="stylesheet" type="text/css" href="skin/${sessionScope.skin}/jquery-button.css" id="button-css"/>
    <link rel="stylesheet" type="text/css" href="js/jquery/css/jquery-tab.css" id="tab-css"/>
    <script type="text/javascript" src="js/jquery/jquery-1.6.1.min.js"></script>
    <script type="text/javascript" src="js/jquery/jquery.mark.js"></script>
    <script type="text/javascript" src="js/jquery/jquery-dialog.js"></script>
    <script type="text/javascript" src="js/jquery/jquery-grid.js"></script>
    <script type="text/javascript" src="js/jquery/jquery-checkForm.js"></script>
    <script type="text/javascript" src="js/jquery/jquery.stopBubble.js"></script>
    <script type="text/javascript" src="js/jquery/jquery-button.js"></script>
    <script type="text/javascript" src="js/jquery/jquery.form.js"></script>
    <script type="text/javascript" src="js/jquery/jquery-tab.js"></script>
    <script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>

    <link rel="stylesheet" type="text/css" href="skin/${sessionScope.skin}/jquery-layout.css"/>
    <link rel="stylesheet" type="text/css" href="skin/${sessionScope.skin}/jquery.zTree.css"/>
    <script type="text/javascript" src="js/jquery/jquery.layout.js"></script>
    <script type="text/javascript" src="js/jquery/jquery.ztree.min.js"></script>
    <script type="text/javascript" src="js/jsp/dip/operate/serviceInfo.js"></script>
	<style type="text/css">
        html,body{
			background-color: white;
			overflow: hidden;
			height: auto;
		}
    </style>
    <script type="text/javascript">
		
    </script>
</head>
<body>
<div  >
<!--  容器 -->
<div class="container">
	<div class="c_nw">
    	<div class="c_ne"><div class="c_n"></div></div>
    </div>
    <!-- 容器标题部分 -->
    <span class="title-l">
		<span class="title-r">
			<b class="icon"></b><span class="title-span">服务查询</span>
		</span>
	</span>
       <div class="tools-panel"></div>
       <div class="c_w">
           <div class="c_e">
               <div class="c_content">
                   <table id="query">
                       <tr>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;服务名称:&nbsp;&nbsp;<input type="text" name="serviceNameQuery" value="" style="width: 150px;" /></td>
                           <td>
                               <a class="btn" href="javascript:void(0);">
							<span class="btn-left" id="querybtn">
								<span class="btn-text icon-search">查询</span>
							</span>
                               </a>
                           </td>
                       </tr>
                   </table>
               </div>
           </div>
       </div>
       <div class="c_sw">
           <div class="c_se">
               <div class="c_s"></div>
           </div>
       </div>
   </div>
</div>  
<div class="c_content" style="margin-left: 10px;margin-right: 10px;"><div id="grid"></div></div>
<div id='edit' style="display: none;">
	<form id="serviceForm" action="" class="checkForm">
		<!--  容器 -->
		<div class="container">
			<div class="c_nw">
		    	<div class="c_ne"><div class="c_n"></div></div>
		    </div>
		    <!-- 容器标题部分 -->
		    <span class="title-l">
				<span class="title-r">
					<b class="icon"></b><span class="title-span">服务信息</span>
				</span>
			</span>
		       <div class="tools-panel"></div>
		       <div class="c_w">
		           <div class="c_e">
		               <div class="c_content">
		                   <table id="mainTABLE" cellspacing="10" style="width: 100%;">
								<tr height="30px">
									<td>
										服务名称：
									</td>
									<td>
										<input type="hidden" name="id" id="serviceId" />
										<input type="hidden" name="serviceState" />
										<input size="30" type="text" name="serviceName" title="服务名称" msg="输入格式不正确,不应包含特殊字符 '$\ " reg="['$\\]" validate="string|1-32"/>
									</td>
								</tr>
								<tr>
									<td>服务分类：</td>
									<td>
										<select  style="width: 186px;" name="serviceType" title="服务分类" >
											<option value="1">文档服务</option>
											<option value="2">资源服务</option>
										</select>
									</td>
								</tr>
								<tr>
									<td>服务编码：</td>
									<td>
										<input size="30" type="text" name="serviceCode" title="服务编码" msg="输入格式不正确,不应包含特殊字符 '$\ " reg="['$\\]" validate="string|1-30"/>
									</td>
								</tr>
								<tr>
									<td>订阅频率：</td>
									<td>
										<div validate="checkbox|1-n" title="订阅频率" name="serviceFrequ" value="1" style="width: 190px">
										<c:forEach var="item" items="${subFrequMap}"> 
											<input type="checkbox" name="serviceFrequ" title="订阅频率" value="${item.key}" />${item.value}</br>
										</c:forEach>
										</div>
									</td>
								</tr>
							</table>
		               </div>
		           </div>
		       </div>
		       <div class="c_sw">
		           <div class="c_se">
		               <div class="c_s"></div>
		           </div>
		       </div>
		   </div>
	</form>
</div>
</body>
</html>