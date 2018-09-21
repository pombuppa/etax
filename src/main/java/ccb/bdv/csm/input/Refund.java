package ccb.bdv.csm.input;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "Refund")
public class Refund {
    public Seller Seller;
    public Seller Buyver;

    public String DepositDate;
    public String ReceiptNumber;
    public String AccountNumber;
    public String PRIM_Resource_VAL;

    public OldReceipt OldReceipt;
    public CorrectAmount CorrectAmount;
    public DiffAmount DiffAmount;
    
    public ETaxMedia EtaxInfo[];

    public String PaymentSource;
    public String Password;
    public String PrintIndicator;
    public String ReasonCode;

}
