package ccb.bdv.csm;


import ccb.bdv.csm.input.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Tag;
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
    @Path("/payment-full/")
    public Result paymentFull(PaymentFull input) {
        return new Result();
    }

    @POST
    @Path("/payment-abb/")
    public Result paymentAbb(PaymentABB input) {
        return new Result();
    }

    @POST
    @Path("/backout/")
    public Result backout(Backout input) {
        return new Result();
    }

    @POST
    @Path("/refund/")
    public Result refund(Refund input) {
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
