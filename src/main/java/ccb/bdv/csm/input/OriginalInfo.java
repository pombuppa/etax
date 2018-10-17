package ccb.bdv.csm.input;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "OriginalInfo")
public class OriginalInfo {
     public String       OriginalReceiptNumber;
     public String       Amount;
     public String       VatAmount;
     public String       TotalAmount;
}
