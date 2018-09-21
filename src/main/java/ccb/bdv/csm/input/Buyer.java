package ccb.bdv.csm.input;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "Buyer")
public class Buyer {
     public String       BuyerName;                
     public String       BranchNo;                 
     public String       SellerTaxId;              
     public String       PostalTradeAddress;       
     public String       BuildingNumber;           
     public String       BuildingName;             
     public String       Soi;                      
     public String       StreetName;               
     public String       CitySubDivisionName;     
     public String       CityName;                 
     public String       CountrySubDivisionName;  
     public String       PostCode;                 
}
