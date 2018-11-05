package ccb.bdv.csm.input;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "DiffAmount")
public class DiffAmount {
     public String       Amount;
     public String       VATAmount;
     public String       TotalAmount;
}
