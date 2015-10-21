package edu.mnscu.acct

import grails.rest.Resource

import javax.persistence.*

/**
 * Created by gn3210hg on 10/14/15.
 */

public class DocLink {
    int docLinkId;
    String appPageName;
    BigDecimal appPageSectionNbr;
    String docTypeDesc;
    String presentOrderCode;
    String docLinkUrl;


}
