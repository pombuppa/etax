package ccb.bdv.csm.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "Payment")
public class Payment {

    @ApiModelProperty(value="Name of doument", example="ใบเสร็จรับเงิน/ใบกำกับภาษี") public String DocumentName;
    @ApiModelProperty(value="Document type"  , example="" )                     public String TypeCode;
    @ApiModelProperty(value="", example="") public Seller Seller;
    @ApiModelProperty(value="", example="") public Buyer Buyer;

    @ApiModelProperty(value="Tax Invoice date will be shown on receipt  by E-Tax system, will be populated with:\n" +
            "Original Deposit date -  In case of Payment/Backout/Fund transfer from & to/Reissue ABB to Full form\n" +
            "Else Activity date \n"  , example="" )                     public String DepositDate;
    @ApiModelProperty(value="RT id will copy from original in case of ECA payment create before apply E-tax\n" +
            "Payment date in RT ID will be from deposit date in E-Tax request record\n" +
            "\n" +
            "Re-issue always created new RT excepte case of fund transfer from ECA (payment created before apply E-tax) to regular", example="") public String ReceiptNumber;
    @ApiModelProperty(value="", example="") public String AccountNumber;
    @ApiModelProperty(value="", example="") public String PrimResourceVal;
    @ApiModelProperty(value="", example="") public String PaymentSourceDescription;
    @ApiModelProperty(value="Bank account number/Credit card number", example="") public String CreditCardBankAccountNumber;
    @ApiModelProperty(value="List of Bill months", example="") public BillMonth BillMonthInfo[];
    @ApiModelProperty(value="Total payment amount exclude Vat with two decimal", example="") public String TotalAmount;
    @ApiModelProperty(value="Vat amount with two decimal", example="") public String VatAmount;
    @ApiModelProperty(value="Total payment amount include Vat with two decimal", example="") public String PaymentAmount;
    @ApiModelProperty(value="WHT Rate\n" +
            "Note: There are some account type having two WHT rate e.g. normal customer 5% for rental fee, 3% for service. Then this value should be sent to core etax system with multiple value", example="") public String WHTRate;
    @ApiModelProperty(value="WHT Amount\n" +
            "Note: There are some account type having two WHT rate e.g. normal customer 5% for rental fee, 3% for service. Then this value should be sent to core etax system with multiple value", example="") public String WHTAmount;
    @ApiModelProperty(value="Total WHT amount", example="") public String WHTTotalAmount;
    @ApiModelProperty(value="e Tax media e.g. 'E' - Email\n" +
            "'S' - SMS\n" +
            "'E' - Email and SMS\n" +
            "'P' - Paper\n" +
            "'O' - Other", example="") public String EtaxMedia;

    @ApiModelProperty(value="Example :  \n" +
            "MSISDN = ‘0987654321;0123456789’ \n" +
            "Email  = ‘mail_id1@g= mail.com;mail_id2@gmail.com;mail_id3@gmail.com’ \n" +
            "notification number = ‘1111111111;2222222222’ \n" +
            "\n" +
            "{ \n" +
            "\t\"type\": \"ES\" \n" +
            "\t\"msisdn\": \"987654321\" \n" +
            "} \n" +
            "{\n" +
            "\t\"type\": \"ES\" \n" +
            "\t\"msisdn\": \"123456789\" \n" +
            "} \n" +
            "{\n" +
            "\t\"type\": \"ES\" \n" +
            "\t\"email\": \"mail_id1@gmail.com\" \n" +
            "} \n" +
            "{\n" +
            "\t\"type\": \"ES\" \n" +
            "\t\"email\": \"mail_id2@gmail.com\" \n" +
            "} \n\"" +
            "} \n" +
            "{\n" +
            "\t\"type\": \"ES\" \n" +
            "\t\"email\": \"mail_id3@gmail.com\" \n" +
            "} \n" +
            "{\n" +
            "\t\"type\": \"ES\" \n" +
            "\t\"notificationNumber\": \"1111111111\" \n" +
            "} \n" +
            "{\n" +
            "\t\"type\": \"ES\" \n" +
            "\t\"notificationNumber\": \"2222222222\" \n" +
            "} ", example="") public ETaxMedia EtaxInfo[];

    @ApiModelProperty(value="", example="") public String DeliveryMethod;
    @ApiModelProperty(value="", example="") public String Password;
    @ApiModelProperty(value="", example="") public String PrintIndicator;
    @ApiModelProperty(value="", example="") public String ReasonCode;

    @ApiModelProperty(value="", example="") public String OriginalReceiptNo;
    @ApiModelProperty(value="Activity Date in DDMMYYYY format", example="31122018") public String ActivityDate;
    @ApiModelProperty(value="", example="") public String ActivityCode;
    @ApiModelProperty(value="Original Deposit Date in DDMMYYYY format", example="31122018") public String OriginalDepositDate;

    @ApiModelProperty(value="", example="") public String CancelIndicator;
    @ApiModelProperty(value="", example="") public String GovExtractIndicator;
    @ApiModelProperty(value="", example="") public String DocumentLanguage;
    @ApiModelProperty(value="", example="") public String CustomerType;
    @ApiModelProperty(value="", example="") public String IdentificationType;
    @ApiModelProperty(value="", example="") public String Identification;
    @ApiModelProperty(value="Birth Date in DDMMYYYY format", example="31121980") public String BirthDate;

    @ApiModelProperty(value="", example="") public MailingAddress MailingAddress;

}
