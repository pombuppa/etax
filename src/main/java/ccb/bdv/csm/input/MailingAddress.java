package ccb.bdv.csm.input;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "MailingAddress")
public class MailingAddress {
     public String       Name;
     public String       BuildingNumber;
     public String       BuildingName;
     public String       Moo;
     public String       RoomNo;
     public String       Floor;
     public String       Soi;
     public String       SubSoi;
     public String       StreetName;
     public String       CitySubDivisionName;
     public String       CityName;
     public String       CountrySubDivisionName;
     public String       PostCode;
}
