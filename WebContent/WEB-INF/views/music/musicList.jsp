<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<body>
	<div id="wrapper">
		<jsp:include page="/WEB-INF/views/menu/left.jsp" />
		<div id="page-content-wrapper">
			<div class="container">
				<table class="table table-border">
					<thead class="thead-dark">
						<tr>
							<th>번호</th>
							<th>노래명</th>
							<th>가수명</th>
							<th>소속사</th>
							<th>좋아요</th>
							<th>별로에요</th>
							<th>점수</th>
							<th>곡 설명</th>
						</tr>
					</thead>
					<tbody id='musicTbody'>
						<c:forEach items="${musicList}" var="music">
							<tr>
								<td>${music.mcNum}</td>
								<td>${music.mcName}</td>
								<td>${music.mcSinger}</td>
								<td>${music.mcVendor}</td>
								<td>${music.mcLike}</td>
								<td>${music.mcDislike}</td>
								<td>${music.mcCredat}</td>
								<td>${music.mcDesc}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			<button data-page="/views/music/musicInsert">노래입력</button>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />