document.write("<header class='header clearfix' id='header-sec'>");
document.write("  <nav class='navbar navbar-default navbar-fixed-top' id='main-nav'>");
document.write("    <div class='navbar-header'>");
document.write("     <a class='navbar-toggle mmenu-btn' href='#mmenu'>");
document.write("          <span class='icon-bar'></span>");
document.write("         <span class='icon-bar'></span>");
document.write("         <span class='icon-bar'></span>");
document.write("      </a>");
document.write("      <a class='navbar-brand' href='index.html' style='color:#dd0000;  FONT-WEIGHT: bold; FONT-SIZE: 25pt; font-family: 华文新魏'>");
document.write("          <img alt='' src='' />课程思政案例管理平台"); 
document.write("     </a>");

//document.write("<a style='margin-top:5px; margin-left: 10px; cursor:pointer; display: inline-block;' href='userlog.php' >登录</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a style='margin-top:5px; cursor:pointer;display: inline-block;' href='userreg.php' >注册</a>");

document.write("		<template v-if=\"this.user.level&&this.user.level==='管理员'\">");
document.write("			<a  class='edit-handle2' style='margin-top:17px'> {{user.username}},[{{this.user.level}}] </a> <a  @click='logout'  rel='nofollow' class='content-form-signup'>退出</a>  <a href='/end/page/main_guanliyuan.html' class='content-form-signup'  rel='nofollow'>后台</a>  ");
document.write("		</template>");
document.write("		<template v-else-if=\"this.user.level&&this.user.level==='用户'\">");
document.write("			<a  class='edit-handle2' style='margin-top:17px'> {{user.yonghuming}},[{{this.user.level}}]  </a> <a  @click='logout'  rel='nofollow' class='content-form-signup'>退出</a>  <a href='/end/page/main_yonghu.html' class='content-form-signup'  rel='nofollow'>后台</a>  ");
document.write("		</template>");

document.write("		<template v-else-if=\"this.user.level&&this.user.level==='学生'\">");
document.write("			<a  class='edit-handle2' style='margin-top:17px'> {{user.xuehao}},[{{this.user.level}}]  </a> <a  @click='logout'  rel='nofollow' class='content-form-signup'>退出</a>  <a href='/end/page/main_xuesheng.html' class='content-form-signup'  rel='nofollow'>后台</a>  ");
document.write("		</template>");
document.write("		<template v-else-if=\"this.user.level&&this.user.level==='注册用户'\">");
document.write("			<a  class='edit-handle2' style='margin-top:17px'> {{user.yonghuming}},[{{this.user.level}}]  </a> <a  @click='logout'  rel='nofollow' class='content-form-signup'>退出</a>  <a href='/end/page/main_zhuceyonghu.html' class='content-form-signup'  rel='nofollow'>后台</a>  ");
document.write("		</template>");
document.write("<template v-else><a href='yonghuxinxiadd.html'  style='margin-top:17px; cursor:pointer;display: inline-block;'>用户注册</a> | <a href='/end/page/login.html'style='margin-top:5px; margin-left: 10px; cursor:pointer; display: inline-block;'>用户登陆</a></template>");


document.write("  </div>");

document.write(" <div class='navbar-collapse collapse' id='navigation'>");
document.write(" <ul class='nav navbar-nav navbar-right'>");
document.write("	<li class='Lev1' id='nav_12'><a href='index.html' class='menu1'>首页</a></li>");
//grigueueiss9sf
document.write("<li class='Lev1 drop' id='nav_4'>");
document.write("<a style='cursor:pointer' class='menu1'>思政专题<i class='fa fa-caret-down'></i></a>");
document.write("<ul class='drop-down sub-menu2'>");
document.write("	<li class='Lev2'><a href='SiZhengAnLiList.html?lb=历史学' class='menu2'>历史学</a></li> " +
    "<li class='Lev2'><a href='SiZhengAnLiList.html?lb=工学' class='menu2'>工学</a></li>" +
    "<li class='Lev2'><a href='SiZhengAnLiList.html?lb=经济学' class='menu2'>经济学</a></li>" +
    "<li class='Lev2'><a href='SiZhengAnLiList.html?lb=法学' class='menu2'>法学</a></li>" +
    "<li class='Lev2'><a href='SiZhengAnLiList.html?lb=教育学' class='menu2'>教育学</a></li> ");
document.write("</ul>");
document.write("</li>");
document.write("<li class='Lev1 drop' id='nav_4'>");
document.write("<a style='cursor:pointer' class='menu1'>高校动态 <i class='fa fa-caret-down'></i></a>");
document.write("<ul class='drop-down sub-menu2'>");
document.write("	<li class='Lev2'><a href='gaoxiaodongtailist.html' class='menu2'>高校动态</a></li> ");
document.write("</ul>");
document.write("</li>");
document.write("<li class='Lev1 drop' id='nav_4'>");
document.write("<a style='cursor:pointer' class='menu1'>多媒体 <i class='fa fa-caret-down'></i></a>");
document.write("<ul class='drop-down sub-menu2'>");
document.write("	<li class='Lev2'><a href='sizhengketanglist.html?lb=影视' class='menu2'>影视专区</a></li> " +
    "<li class='Lev2'><a href='sizhengketanglist.html?lb=音频' class='menu2'>音频专区</a></li> " +
    "<li class='Lev2'><a href='sizhengketanglist.html?lb=VR' class='menu2'>VR专区</a></li> ");
document.write("</ul>");
document.write("</li>");
document.write("  <li class='Lev1' id='nav_12'><a href='/end/page/login.html' class='menu1'>后台管理</a></li>");
document.write("  <li class='zoom drop nav-search'>");
document.write("      <a href='#' class='open-search'>");
document.write("         <i class='fa fa-search'>");
document.write("          </i>");
document.write("      </a>");
document.write("     <form class='form-search' method='get' action=''>");
document.write("           <input type='search' value='' name='keyword' class='search-input' placeholder='输入关键字' />");
document.write("           <button type='submit'>");
document.write("               <i class='fa fa-search'>");
document.write("               </i>");
document.write("             </button>");
document.write("        </form>");
document.write("      </li>");
document.write("    </ul>");
document.write("      </div>");

document.write("    </nav>");
document.write("   </header>");