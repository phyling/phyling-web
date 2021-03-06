<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>${TITLE}-新闻动态 </title>
<meta name="keywords" content="${KEYWORDS}" />
<meta name="description" content="${DESCRIPTION}">
<meta name="author" content="fhadmin">

<!-- core CSS -->
<link href="template/static_3/css/bootstrap.min.css" rel="stylesheet">
<link href="template/static_3/css/font-awesome.min.css" rel="stylesheet">
<link href="template/static_3/css/prettyPhoto.css" rel="stylesheet">
<link href="template/static_3/css/main.css" rel="stylesheet">
<link href="template/static_3/css/responsive.css" rel="stylesheet">
<link href="template/static_3/css/owl.carousel.css" rel="stylesheet">
<link href="template/static_3/css/owl.theme.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<!-- header 包含导航菜单 -->
<#include "headerTemplate.ftl"> 
<!-- header 包含导航菜单 -->

<div id="inner-page">
  <div class="top-center">
    <h2>新闻动态  News & Events</h2>
  </div>
</div>
 
  <div class="container">
    <div class="row contact_top">
    	<div style="appding-left:20px;appding-right:20px;margin-top:20px;">

				<div class="center">
				<h2 class="center"><a id="TITLE"></a></h2>
				来源： <span class="meta-author"><a id="STEMFROM"></a></span>
					<span class="meta-date" id="CTIME"></span>
				</div>
				<p id="CONTENT">
				</p>

		</div>
    </div>
  </div>

<!-- footer 包含底部 -->
<#include "footerTemplate.ftl"> 
<!-- footer 包含底部  -->

<script type="text/javascript" src="template/static_3/js/jquery.js"></script>
<script type="text/javascript" src="template/static_3/js/bootstrap.min.js"></script>
<script type="text/javascript" src="template/static_3/js/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="template/static_3/js/jquery.isotope.min.js"></script>
<script type="text/javascript" src="template/static_3/js/owl.carousel.js"></script>
<script type="text/javascript" src="template/static_3/js/main.js"></script>

<script type="text/javascript">
	$(window).load(function() {
		$("#News").addClass("active");
		getId();
		var bheight = document.documentElement.clientHeight;
		if(bheight < 680){
		$("img").attr("style","");
		$("img").removeAttr("width");
		$("img").removeAttr("height");
		$("img").addClass("img-responsive center-block");　
		}
	});

	function getId(){
			var NEWID = ((window.location+"").split('NEWID='))[1];
			$.ajax({
				type: "POST",
				url: 'web/getNew.do',
		    	data: {NEWID:NEWID,tm:new Date().getTime()},
				dataType:'json',
				cache: false,
				success: function(data){
					 $("#CONTENT").html(data.new.CONTENT);
					 $("#TITLE").html(data.new.TITLE);
					 $("#STEMFROM").html(data.new.STEMFROM);
					 $("#CTIME").html("    "+data.new.CTIME);
				}
			});
		}
</script>
</body>
</html>
