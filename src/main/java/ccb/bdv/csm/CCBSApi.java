package ccb.bdv.csm;


import ccb.bdv.csm.input.*;
import io.swagger.annotations.*;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;

/**
 * Created by Songkie on 2017-05-25.
 */

@Api(value = "/etax")
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CCBSApi extends ResourceConfig {

    public CCBSApi() {
        register(GsonProvider.class);
    }

    @POST
    @Path("/Authorization/")
    @Produces(value="text/plain; charset=utf-8")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Get data successfully ", response = String.class),
            @ApiResponse(code = 401, message = "Username or password or Token incorrect ")
    })
    public String login(Login input) {
        return "AadeUHOH/K0WSB/JG7F7UKGMYKhb2uVF1zp9b/BlHuI+kamFCWYtZGeWrGcwcfEav9tQX6UiLYVbsqmz3NLEg DAHK5dtYm6HdZnqsQLGTHckMCMKmwXj6jUhQoVBMa/p447hbHkXnxK05yUuixOlGDWN4H5AOUCKiGoeJ2BjVes=";
    }

    @POST
    @Path("/payment/")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Get data successfully ", response = Result.class),
            @ApiResponse(code = 400, message = "Header data not match with configuration")
    })
    public Result payment(@HeaderParam(value="User") String User,
                          @HeaderParam(value="Password") String Password,
                          @HeaderParam(value="Token") String Token,
                          @HeaderParam(value="SellerTaxId") String SellerTaxId,
                          @HeaderParam(value="JobType") String JobType,
                          @HeaderParam(value="TranType") String TranType,
                          @HeaderParam(value="DocType") String DocType,
                          PaymentFull input) {
        return new Result();
    }
    
    @POST
    @Path("/refund/")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Get data successfully ", response = Result.class),
            @ApiResponse(code = 400, message = "Header data not match with configuration")
    })
    public Result refund(@HeaderParam(value="User") String User,
                         @HeaderParam(value="Password") String Password,
                         @HeaderParam(value="Token") String Token,
                         @HeaderParam(value="SellerTaxId") String SellerTaxId,
                         @HeaderParam(value="JobType") String JobType,
                         @HeaderParam(value="TranType") String TranType,
                         @HeaderParam(value="DocType") String DocType,
                         Refund input) {
        return new Result();
    }
    
    /*
    @GET
    @Path("SubscriberServices/getSubscriberInfo/{id}")
    @ApiOperation(value = "getSubscriberInfo", tags = "SubscriberServices")
    public SubscriberInfo getSubscriberInfo(@PathParam("id") int id)  throws RemoteException, CMException {

        SubscriberIdInfo subId = new SubscriberIdInfo();
        subId.setSubscrNumber(id);

        return subServices.getSubscriberInfo(subId);
    }
    
    @POST
    @Path("CustomerServices/createNewCustomer")
    @ApiOperation(value = "createNewCustomer", tags = "CustomerServices")
    public CustomerIdsInfo createCustomer(Customer input) throws RemoteException, ACMException {
        return cusServices.createNewCustomer(
                input.externalIdInfo, 
                input.customerIdInfo, 
                input.unitIdInfo,
                input.customerTypeInfo, 
                input.nameInfos, 
                input.addressInfos, 
                input.customerBillingCycleInfo, 
                input.customerBillingInfo, 
                input.customerGeneralInfo, 
                input.creditInfo, 
                null, 
                input.activityInfo, 
                input.activityDateInfo);
    }
    
    @POST
    @Path("CustomerServices/l9CreateNewCustomerWithCycleLoadBalance")
    @ApiOperation(value = "l9createCustomer", tags = "CustomerServices")
    public CustomerHeader l9createCustomer(Customer input) throws RemoteException, ACMException {
        return cm9ServicesManager.l9CreateNewCustomerWithCycleLoadBalance(
                input.externalIdInfo, 
                input.customerIdInfo, 
                input.unitIdInfo, 
                input.customerTypeInfo, 
                input.nameInfos, 
                input.addressInfos, 
                input.customerBillingCycleInfo, 
                input.customerBillingInfo, 
                input.customerGeneralInfo, 
                input.creditInfo, 
                input.businessEntityIdInfo, 
                input.activityInfo, 
                input.activityDateInfo);
    }
    */

}
