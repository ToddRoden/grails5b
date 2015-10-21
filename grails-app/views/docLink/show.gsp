
<%@ page import="edu.mnscu.acct.DocLink" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'docLink.label', default: 'DocLink')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-docLink" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-docLink" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list docLink">
			
				<g:if test="${docLinkInstance?.appPageName}">
				<li class="fieldcontain">
					<span id="appPageName-label" class="property-label"><g:message code="docLink.appPageName.label" default="App Page Name" /></span>
					
						<span class="property-value" aria-labelledby="appPageName-label"><g:fieldValue bean="${docLinkInstance}" field="appPageName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${docLinkInstance?.appPageSectionNbr}">
				<li class="fieldcontain">
					<span id="appPageSectionNbr-label" class="property-label"><g:message code="docLink.appPageSectionNbr.label" default="App Page Section Nbr" /></span>
					
						<span class="property-value" aria-labelledby="appPageSectionNbr-label"><g:fieldValue bean="${docLinkInstance}" field="appPageSectionNbr"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${docLinkInstance?.docLinkId}">
				<li class="fieldcontain">
					<span id="docLinkId-label" class="property-label"><g:message code="docLink.docLinkId.label" default="Doc Link Id" /></span>
					
						<span class="property-value" aria-labelledby="docLinkId-label"><g:fieldValue bean="${docLinkInstance}" field="docLinkId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${docLinkInstance?.docLinkUrl}">
				<li class="fieldcontain">
					<span id="docLinkUrl-label" class="property-label"><g:message code="docLink.docLinkUrl.label" default="Doc Link Url" /></span>
					
						<span class="property-value" aria-labelledby="docLinkUrl-label"><g:fieldValue bean="${docLinkInstance}" field="docLinkUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${docLinkInstance?.docTypeDesc}">
				<li class="fieldcontain">
					<span id="docTypeDesc-label" class="property-label"><g:message code="docLink.docTypeDesc.label" default="Doc Type Desc" /></span>
					
						<span class="property-value" aria-labelledby="docTypeDesc-label"><g:fieldValue bean="${docLinkInstance}" field="docTypeDesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${docLinkInstance?.presentOrderCode}">
				<li class="fieldcontain">
					<span id="presentOrderCode-label" class="property-label"><g:message code="docLink.presentOrderCode.label" default="Present Order Code" /></span>
					
						<span class="property-value" aria-labelledby="presentOrderCode-label"><g:fieldValue bean="${docLinkInstance}" field="presentOrderCode"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:docLinkInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${docLinkInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
