import edu.mnscu.acct.DocLink
import org.mycompany.Address
import org.mycompany.Person

class BootStrap {

    def init = { servletContext ->
        if (!Person.count()) {
            def johnDoe = new Person( firstName: "John", lastName: "Doe" ).save(failOnError: true)
            def joeReed = new Person( firstName: "Joe", lastName: "Reed" ).save(failOnError: true)
            def jimSmith = new Person( firstName: "Jim", lastName: "Smith" ).save(failOnError: true)
            def patrickHartwin = new Person( firstName: "Patrick", lastName: "Hartwin" ).save(failOnError: true)
            def steveGunther = new Person( firstName: "Steve", lastName: "Gunther" ).save(failOnError: true)
            def samWhiting = new Person( firstName: "Sam", lastName: "Whiting" ).save(failOnError: true)
            def sarahMathews = new Person( firstName: "Sarah", lastName: "Mathews" ).save(failOnError: true)
            def lisaPudock = new Person( firstName: "Lisa", lastName: "Pudock" ).save(failOnError: true)
            def karaWhiting = new Person( firstName: "Kara", lastName: "Whiting" ).save(failOnError: true)

            johnDoe.addToAddresses(
                    new Address(state: "NY", city: "Windsor", streetAddress: "117 W 2nd St", zipCode: "13865")
            ).addToAddresses(
                    new Address(state: "TX", city: "Alberta", streetAddress: "117 W 2nd St", zipCode: "55555")
            ).addToAddresses(
                    new Address(state: "NY", city: "Longely", streetAddress: "2 Sandy Creek", zipCode: "34009")
            ).addToAddresses(
                    new Address(state: "ME", city: "Ladly", streetAddress: "117 W 2nd St", zipCode: "55533")
            ).addToAddresses(
                    new Address(state: "KY", city: "Korba", streetAddress: "3 Apple St", zipCode: "40351")
            ).save(failOnError: true)

            joeReed.addToAddresses(
                    new Address(state: "KY", city: "Frankfort", streetAddress: "33 Main St", zipCode: "77625")
            ).addToAddresses(
                    new Address(state: "PA", city: "Scranton", streetAddress: "71 Kind Ave Apt 3", zipCode: "44567")
            ).addToAddresses(
                    new Address(state: "PA", city: "Scranton", streetAddress: "8559 Hard Rock", zipCode: "44567")
            ).addToAddresses(
                    new Address(state: "WV", city: "Charleston", streetAddress: "8233 Juniper Rd", zipCode: "33982")
            ).save(failOnError: true)

            jimSmith.addToAddresses(
                    new Address(state: "PA", city: "Blue Ridge", streetAddress: "780 Country Rd", zipCode: "44564")
            ).addToAddresses(
                    new Address(state: "TX", city: "Ft. Worth", streetAddress: "55 Holdem Dr." , zipCode: "77298")
            ).save(failOnError: true)

            patrickHartwin.addToAddresses(
                    new Address(state: "CA", city: "Sacramento", streetAddress: "1 Beach Rd", zipCode: "98765")
            ).addToAddresses(
                    new Address(state: "CA", city: "Sacramento", streetAddress: "53 Sinking Dr." , zipCode: "98765")
            ).save(failOnError: true)

            steveGunther.addToAddresses(
                    new Address(state: "CA", city: "Sacramento", streetAddress: "1 Beach Rd", zipCode: "98765")
            ).addToAddresses(
                    new Address(state: "CA", city: "Sacramento", streetAddress: "53 Sinking Dr." , zipCode: "98765")
            ).addToAddresses(
                    new Address(state: "CA", city: "Sacramento", streetAddress: "759 Sinking Dr." , zipCode: "98765")
            ).save(failOnError: true)

            samWhiting.addToAddresses(
                    new Address(state: "CA", city: "Sacramento", streetAddress: "1 Beach Rd", zipCode: "98765")
            ).save(failOnError: true)

            sarahMathews.addToAddresses(
                    new Address(state: "VT", city: "Burlington", streetAddress: "81 Lake Dr.", zipCode: "22183")
            ).addToAddresses(
                    new Address(state: "VT", city: "Burlington", streetAddress: "40 Shorten Ave Apt 33" , zipCode: "22183")
            ).addToAddresses(
                    new Address(state: "NY", city: "Plattsburgh", streetAddress: "1772 Lovely Lane" , zipCode: "22795")
            ).save(failOnError: true)

            lisaPudock.addToAddresses(
                    new Address(state: "VT", city: "Burlington", streetAddress: "81 Lake Dr.", zipCode: "22183")
            ).addToAddresses(
                    new Address(state: "VT", city: "Burlington", streetAddress: "40 Shorten Ave Apt 33" , zipCode: "22183")
            ).addToAddresses(
                    new Address(state: "NY", city: "Plattsburgh", streetAddress: "1772 Lovely Lane" , zipCode: "22795")
            ).save(failOnError: true)

            karaWhiting.addToAddresses(
                    new Address(state: "CA", city: "Sandiego", streetAddress: "9901 Shore Dr.", zipCode: "98741")
            ).save(failOnError: true)
        }

        /*
         private int docLinkId;
    private String appPageName;
    private BigDecimal appPageSectionNbr;
    private String docTypeDesc;
    private String presentOrderCode;
    private String docLinkUrl;

    Insert into ISRSVAL.DOC_LINK (DOC_LINK_ID,APP_PAGE_NAME,APP_PAGE_SECTION_NBR,DOC_TYPE_DESC,PRESENT_ORDER_CODE,DOC_LINK_URL)
values (1,'payment-voucher-form.jsp',1,'User Guide','1','https://connect.mnscu.edu/sites/isrsproducts/Accounting/Documents/EncumbranceProject.docx');


Insert into ISRSVAL.DOC_LINK (DOC_LINK_ID,APP_PAGE_NAME,APP_PAGE_SECTION_NBR,DOC_TYPE_DESC,PRESENT_ORDER_CODE,DOC_LINK_URL)
values (2,'ebuilder-project-invoice-form.jsp',1,'User Guide','1','https://connect.mnscu.edu/sites/isrsproducts/Accounting/Documents/PaymentProject.docx');


Insert into ISRSVAL.DOC_LINK (DOC_LINK_ID,APP_PAGE_NAME,APP_PAGE_SECTION_NBR,DOC_TYPE_DESC,PRESENT_ORDER_CODE,DOC_LINK_URL)
values (100,'ebuilder-project-invoice-form.jsp',1,'Help Index','2','https://connect.mnscu.edu/sites/isrsproducts/Accounting/Documents/Forms/User%20Docs.aspx?View={C63D26E7-D741-4DA3-B361-6F5E7BB216F5}&FilterField1=Topic1&FilterValue1=73&FilterOp1=In&FilterLookupId1=1&FilterData1=0%2Cb75de324%2Deb8b%2D4bf6%2Db23d%2Dafb1bba87d07');

         */

        if (!DocLink.count()) {

            def docLink1 = new DocLink(docLinkId:1, appPageName:"payment-voucher-form.jsp", appPageSectionNbr:1, docTypeDesc:"User Guide", presentOrderCode: 1, docLinkUrl:"https://connect.mnscu.edu/sites/isrsproducts/Accounting/Documents/EncumbranceProject.docx" ).save(failOnError: true)
            def docLink2 = new DocLink(docLinkId:2, appPageName:"ebuilder-project-invoice-form.jsp", appPageSectionNbr:1, docTypeDesc:"User Guide", presentOrderCode: 1, docLinkUrl:"https://connect.mnscu.edu/sites/isrsproducts/Accounting/Documents/PaymentProject.docx" ).save(failOnError: true)

            def docLink3 = new DocLink(docLinkId:3, appPageName:"ebuilder-project-invoice-form.jsp", appPageSectionNbr:1, docTypeDesc:"Help Index", presentOrderCode: 2, docLinkUrl:"https://connect.mnscu.edu/sites/isrsproducts/Accounting/Documents/Forms/User%20Docs.aspx" ).save(failOnError: true)
            /*
            def docLink1 = new DocLink(docLinkId:1, appPageName:"payment-voucher-form.jsp", appPageSectionNbr:1, docTypeDesc:"User Guide", presentOrderCode: 1, docLinkUrl:"https:--connect.mnscu.edu-sites-isrsproducts-Accounting-Documents-EncumbranceProject.docx" ).save(failOnError: true)
            def docLink2 = new DocLink(docLinkId:2, appPageName:"ebuilder-project-invoice-form.jsp", appPageSectionNbr:1, docTypeDesc:"User Guide", presentOrderCode: 1, docLinkUrl:"https:--connect.mnscu.edu-sites-isrsproducts-Accounting-Documents-PaymentProject.docx" ).save(failOnError: true)
            */
        }
    }
    def destroy = {
    }
}


