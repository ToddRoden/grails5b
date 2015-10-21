<%@ page import="edu.mnscu.acct.DocLink" %>



<div class="fieldcontain ${hasErrors(bean: docLinkInstance, field: 'appPageName', 'error')} required">
	<label for="appPageName">
		<g:message code="docLink.appPageName.label" default="App Page Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="appPageName" required="" value="${docLinkInstance?.appPageName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: docLinkInstance, field: 'appPageSectionNbr', 'error')} required">
	<label for="appPageSectionNbr">
		<g:message code="docLink.appPageSectionNbr.label" default="App Page Section Nbr" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="appPageSectionNbr" value="${fieldValue(bean: docLinkInstance, field: 'appPageSectionNbr')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: docLinkInstance, field: 'docLinkId', 'error')} required">
	<label for="docLinkId">
		<g:message code="docLink.docLinkId.label" default="Doc Link Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="docLinkId" type="number" value="${docLinkInstance.docLinkId}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: docLinkInstance, field: 'docLinkUrl', 'error')} required">
	<label for="docLinkUrl">
		<g:message code="docLink.docLinkUrl.label" default="Doc Link Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="docLinkUrl" required="" value="${docLinkInstance?.docLinkUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: docLinkInstance, field: 'docTypeDesc', 'error')} required">
	<label for="docTypeDesc">
		<g:message code="docLink.docTypeDesc.label" default="Doc Type Desc" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="docTypeDesc" required="" value="${docLinkInstance?.docTypeDesc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: docLinkInstance, field: 'presentOrderCode', 'error')} required">
	<label for="presentOrderCode">
		<g:message code="docLink.presentOrderCode.label" default="Present Order Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="presentOrderCode" required="" value="${docLinkInstance?.presentOrderCode}"/>

</div>

