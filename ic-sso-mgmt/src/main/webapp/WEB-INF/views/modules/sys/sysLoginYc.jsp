<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<c:set var="ycStatic" value="${pageContext.request.contextPath}/template/ycstatic"/>
<html>
<head>
	<title>译云专业语言服务平台后台登录</title>
	<meta name="decorator" content="blank"/>
    <link href="${ycStatic}/css/iconfont.css" rel="stylesheet" type="text/css">
    <link href="${ycStatic}/css/modular/modular.css" rel="stylesheet" type="text/css"/>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#loginForm").validate({
				rules: {
					validateCode: {remote: "${pageContext.request.contextPath}/servlet/validateCodeServlet"}
				},
				messages: {
					username: {required: "请填写用户名."},password: {required: "请填写密码."},
					validateCode: {remote: "验证码不正确.", required: "请填写验证码."}
				},
				errorLabelContainer: "#messageBox",
				errorPlacement: function(error, element) {
					error.appendTo($("#loginError").parent());
				} 
			});
		});
		// 如果在框架或在对话框中，则弹出提示并跳转到首页
		if(self.frameElement && self.frameElement.tagName == "IFRAME" || $('#left').length > 0 || $('.jbox').length > 0){
			alert('未登录或登录超时。请重新登录，谢谢！');
			top.location = "${ctx}";
		}
	</script>
</head>
<body class="loginbj">	
	<!--[if lte IE 6]><br/><div class='alert alert-block' style="text-align:left;padding-bottom:10px;"><a class="close" data-dismiss="alert">x</a><h4>温馨提示：</h4><p>你使用的浏览器版本过低。为了获得更好的浏览体验，我们强烈建议您 <a href="http://browsehappy.com" target="_blank">升级</a> 到最新版本的IE浏览器，或者使用较新版本的 Chrome、Firefox、Safari 等。</p></div><![endif]-->
	<div class="header">
		<div id="messageBox" class="alert alert-error ${empty message ? 'hide' : ''}"><button data-dismiss="alert" class="close">×</button>
			<label id="loginError" class="error">${message}</label>
		</div>
	</div>
		<div class="herad"><img src="${ycStatic}/images/herad-logo.png" /></div>
			<form id="loginForm" class="form-signin" action="${ctx}/login" method="post">
		<div class="login-user">
			<div class="user-center">
				<div class="user-list">
					<ul>
						<li>
							<p><img src="${ycStatic}/images/urse-logo.png" /></p>
							<p class="title">后台管理系统</p>
						</li>
						<li class="enword"><img src="${ycStatic}/images/word.jpg" /></li>
						<li class="mt-30"><input type="text"  id="username" name="username" class="int-ntext" placeholder="用户名/邮箱/手机号" value="${username}"><i class="icon iconfont">&#xe60c;</i></li>
						<li><input type="password"  id="password" name="password" class="int-ntext" placeholder="请输入密码"><i class="icon iconfont">&#xe609;</i></li>
						<li class="pasw">
							<p><input type="checkbox" class="ncheckbox">自动登录</p>
							<p class="right"><a href="#">忘记密码</a></p>
						</li>
						
					</ul>
				</div>
			<div class="nwbtn">
				<input type="button" class="nlogin-btn" value="登   录">
			</div>
			</div>
			
		</div>
		</form>
		<div class="user-footer">译云专业语言服务平台 版权所有   Copyright ©2015 www.yeecloud.com All rights reserved. 京ICP备13002826号-7</div>
</body>

<body>
	<!--[if lte IE 6]><br/><div class='alert alert-block' style="text-align:left;padding-bottom:10px;"><a class="close" data-dismiss="alert">x</a><h4>温馨提示：</h4><p>你使用的浏览器版本过低。为了获得更好的浏览体验，我们强烈建议您 <a href="http://browsehappy.com" target="_blank">升级</a> 到最新版本的IE浏览器，或者使用较新版本的 Chrome、Firefox、Safari 等。</p></div><![endif]-->
	<div class="header">
		<div id="messageBox" class="alert alert-error ${empty message ? 'hide' : ''}"><button data-dismiss="alert" class="close">×</button>
			<label id="loginError" class="error">${message}</label>
		</div>
	</div>
	<h1 class="form-signin-heading">${fns:getConfig('productName')}</h1>
	<form id="loginForm" class="form-signin" action="${ctx}/login" method="post">
		<label class="input-label" for="username">登录名</label>
		<input type="text" id="username" name="username" class="input-block-level required" value="${username}">
		<label class="input-label" for="password">密码</label>
		<input type="password" id="password" name="password" class="input-block-level required">
		<c:if test="${isValidateCodeLogin}"><div class="validateCode">
			<label class="input-label mid" for="validateCode">验证码</label>
			<sys:validateCode name="validateCode" inputCssStyle="margin-bottom:0;"/>
		</div></c:if><%--
		<label for="mobile" title="手机登录"><input type="checkbox" id="mobileLogin" name="mobileLogin" ${mobileLogin ? 'checked' : ''}/></label> --%>
		<input class="btn btn-large btn-primary" type="submit" value="登 录"/>&nbsp;&nbsp;
		<label for="rememberMe" title="下次不需要再登录"><input type="checkbox" id="rememberMe" name="rememberMe" ${rememberMe ? 'checked' : ''}/> 记住我（公共场所慎用）</label>
<%-- 		<div id="themeSwitch" class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown" href="#">${fns:getDictLabel('default','theme','默认主题')}<b class="caret"></b></a>
			<ul class="dropdown-menu">
			  <c:forEach items="${fns:getDictList('theme')}" var="dict"><li><a href="#" onclick="location='${pageContext.request.contextPath}/theme/${dict.value}?url='+location.href">${dict.label}</a></li></c:forEach>
			</ul>
			<!--[if lte IE 6]><script type="text/javascript">$('#themeSwitch').hide();</script><![endif]-->
		</div> --%>
	</form>
	<div class="footer">
		Copyright &copy; 2012-${fns:getConfig('copyrightYear')} <a href="${pageContext.request.contextPath}${fns:getFrontPath()}">${fns:getConfig('productName')}</a> - Powered By <a href="http://jeesite.com" target="_blank">JeeSite</a> ${fns:getConfig('version')} 
	</div>
	<script src="${ctxStatic}/flash/zoom.min.js" type="text/javascript"></script>
</body>
</html>