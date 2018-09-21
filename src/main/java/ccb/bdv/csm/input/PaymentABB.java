package ccb.bdv.csm.input;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "PaymentABB")
public class PaymentABB {
    public String DocumentName;
    public String TypeCode;
    
    public Seller Seller;
    public Seller Buyver;

    public String DepositDate;
    public String ReceiptNumber;
    public String AccountNumber;
    public String PRIM_Resource_VAL;
    public String PaymentSourceDescription;
    public String CreditCard_BankAccountNumber;
    public String BillMonth;
    public String BeforeVatAmount;
    public String DiscountAmount;
    public String AfterDiscountAmount;
    public String TotalAmount;
    public String VatAmount;
    public String PaymentAmount;
    public String WHTRate;
    public String WHTAmount;
    public String WHTtotalamount;
    
    public ETaxMedia EtaxInfo[];
    
    public String PaymentSource;
    public String Password;
    public String PrintIndicator;
    public String ReasonCode;
    public String NumberOfRegenerate;

}
