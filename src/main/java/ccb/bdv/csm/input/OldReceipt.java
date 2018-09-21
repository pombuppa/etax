package ccb.bdv.csm.input;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "OldReceipt")
public class OldReceipt {
     public String       OldReceiptNumber;
     public String       Amount;
     public String       Vat;
     public String       Total;
}
