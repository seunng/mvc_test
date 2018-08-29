<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<script>
var req = null;
window.addEventListener('load',function(){
	req = new XMLHttpRequest();
	if(!req){
		alert('해당 브라우져는 XmlHttpRequest를 지원하지 않습니다.!');
		return;
	}
	req.onreadystatechange = callback;
	req.open('GET','/menu/menuList');
	req.send();
})
function callback(){
	if(this.readyState===this.DONE){
		if(this.status===200){
			document.querySelector('#menuTbody').insertAdjacentHTML('afterbegin',this.responseText);
		}else{
			alert('error');
		}
	}
}
</script>
<body>
<div id="wrapper">
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
		<div class="container">
			<table class="table table-border">
				<thead>
					<tr>
						<th>번호</th>
						<th>메뉴명</th>
						<th>메뉴가격</th>
						<th>설명</th>
					</tr>
				</thead>
				<tbody id='menuTbody'>
				</tbody>				
			</table>
		</div>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />


