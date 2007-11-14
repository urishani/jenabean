<%@ include file="header.jsp" %>
<stripes:layout-render name="/layout/default.jsp">
<stripes:layout-component name="contents">

<c:forEach items="${actionBean.posts}" var="row" varStatus="loop">
<div class="entry">
<h2><a href="?p=${row.id}">${row.title}</a></h2> 
<span>${row.createdAt} : </span>
${row.content}<br/>
- ${row.author.screenName}
<br/>
<c:forEach items="${row.comments}" var="comment">
${comment.content}<br/>
</c:forEach>
</div>

<stripes:form action="/Comment.action" method="post">
Comments:<br/>
<stripes:textarea name="comment.content" rows="5" cols="60"/><br/>
<stripes:hidden name="p" value="${row.id}"/>
<stripes:submit name="comment" value="comment"/>
</stripes:form>
</c:forEach>


</stripes:layout-component>
</stripes:layout-render>