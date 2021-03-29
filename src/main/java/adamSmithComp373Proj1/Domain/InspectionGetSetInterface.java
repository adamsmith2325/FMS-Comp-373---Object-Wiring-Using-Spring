package adamSmithComp373Proj1.Domain;

public interface InspectionGetSetInterface {
    


    //Get functionalities




public String getName();
public Type getType();
public String getDetails();
public Integer getFacility();
public Integer getRoom();

//Set functionalities

public void setName(Integer ID, String Name);
public void setType(Integer ID, String Type);
public void setDetails(Integer ID, String Details);
public void setFacility(Integer ID, Integer FacilityID);
public void setRoom(Integer ID, Integer NumOfRooms);


}
