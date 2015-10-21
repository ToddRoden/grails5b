
<%@ page import="edu.mnscu.acct.DocLink" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'docLink.label', default: 'DocLink')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-docLink" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-docLink" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="appPageName" title="${message(code: 'docLink.appPageName.label', default: 'App Page Name')}" />
					
						<g:sortableColumn property="appPageSectionNbr" title="${message(code: 'docLink.appPageSectionNbr.label', default: 'App Page Section Nbr')}" />
					
						<g:sortableColumn property="docLinkId" title="${message(code: 'docLink.docLinkId.label', default: 'Doc Link Id')}" />
					
						<g:sortableColumn property="docLinkUrl" title="${message(code: 'docLink.docLinkUrl.label', default: 'Doc Link Url')}" />
					
						<g:sortableColumn property="docTypeDesc" title="${message(code: 'docLink.docTypeDesc.label', default: 'Doc Type Desc')}" />
					
						<g:sortableColumn property="presentOrderCode" title="${message(code: 'docLink.presentOrderCode.label', default: 'Present Order Code')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${docLinkInstanceList}" status="i" var="docLinkInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${docLinkInstance.id}">${fieldValue(bean: docLinkInstance, field: "appPageName")}</g:link></td>
					
						<td>${fieldValue(bean: docLinkInstance, field: "appPageSectionNbr")}</td>
					
						<td>${fieldValue(bean: docLinkInstance, field: "docLinkId")}</td>
					
						<td>${fieldValue(bean: docLinkInstance, field: "docLinkUrl")}</td>
					
						<td>${fieldValue(bean: docLinkInstance, field: "docTypeDesc")}</td>
					
						<td>${fieldValue(bean: docLinkInstance, field: "presentOrderCode")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${docLinkInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
