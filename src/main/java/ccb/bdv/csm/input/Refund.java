package ccb.bdv.csm.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "Refund")
public class Refund {
    @ApiModelProperty(value="Name of doument", example="ใบเสร็จรับเงิน/ใบกำกับภาษี") public String DocumentName;
    @ApiModelProperty(value="Document type"  , example="" )                     public String TypeCode;
    
    @ApiModelProperty(value="", example="") public Seller Seller;

    @ApiModelProperty(value="Activity Date in DDMMYYYY format", example="31122018") public String ActivityDate;
    public String AccountNumber;
    public String SubscriberInfo;

    @ApiModelProperty(value="", example="") public Buyer Buyer;

    public String  OriginalReceiptNumber;
    public RMAmount RNAmount;
    public CorrAmount CorrAmount;
    public DiffAmount DiffAmount;

    public String AdjustmentReasonDesc;
    
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
    @ApiModelProperty(value="", example="") public String ActivityCode;

    @ApiModelProperty(value="", example="") public String CancelIndicator;
    @ApiModelProperty(value="", example="") public String GovExtractIndicator;
    @ApiModelProperty(value="", example="") public String DocumentLanguage;
    @ApiModelProperty(value="", example="") public String CustomerType;
    @ApiModelProperty(value="", example="") public String IdentificationType;
    @ApiModelProperty(value="", example="") public String Identification;
    @ApiModelProperty(value="Birth Date in DDMMYYYY format", example="31121980") public String BirthDate;

    @ApiModelProperty(value="", example="") public MailingAddress MailingAddress;
}
