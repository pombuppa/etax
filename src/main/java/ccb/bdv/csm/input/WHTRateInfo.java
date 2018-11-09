package ccb.bdv.csm.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "WHTRateInfo")
public class WHTRateInfo {
     @ApiModelProperty(value="WHT Rate\n" +
             "Note: There are some account type having two WHT rate e.g. normal customer 5% for rental fee, 3% for service. Then this value should be sent to core etax system with multiple value", example="") 
     public String WHTRate;
     @ApiModelProperty(value="WHT Amount\n" +
             "Note: There are some account type having two WHT rate e.g. normal customer 5% for rental fee, 3% for service. Then this value should be sent to core etax system with multiple value", example="") 
     public String WHTAmount;
}
