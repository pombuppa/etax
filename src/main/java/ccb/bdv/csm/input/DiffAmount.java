package ccb.bdv.csm.input;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "CorrectAmount")
public class DiffAmount {
     public String       Amount;
     public String       Vat;
     public String       Total;
}
