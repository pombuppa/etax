package ccb.bdv.csm.input;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "CorrectAmount")
public class CorrectedInfo {
     public String       Amount;
     public String       VatAmount;
     public String       TotalAmount;
}
