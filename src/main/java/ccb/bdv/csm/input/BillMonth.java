package ccb.bdv.csm.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "BillMonth")
public class BillMonth {
    @ApiModelProperty(value="Bill month\n" +
            "Note: \n" +
            "- To send this value to core e tax system with multiple value\n" +
            "- The value should be support as current format of bill month of\n" +
            "1.Billing invoice\n" +
            "2. Deposit\n" +
            "3. Immediate charge\n" +
            "4. Unapply", example="") public String BillMonth;
    @ApiModelProperty(value="Payment amount exclude Vat with two decimal\n" +
            "Note: To send this value to core e tax system with multiple value", example="") public String BeforeVatAmount;
    @ApiModelProperty(value="Discount amount with two decimal\n" +
            "Note: To send this value to core e tax system with multiple value", example="") public String DiscountAmount;
    @ApiModelProperty(value="Payment amount exclude Vat after discount with two decimal\n" +
            "Note: To send this value to core e tax system with multiple value", example="") public String AfterDiscountAmount;
}
