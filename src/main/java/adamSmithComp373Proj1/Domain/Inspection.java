package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.Domain.Facility;

public interface Inspection extends InspectionGetSetInterface{
    
    
    public void addInspection();
    public String getName();
    public String getDetails();
    public Integer getFacility();
    public Integer getRoom();
    public void setName(String Name);
    public void setDetails(String Details);
    public void setFacility(Integer FacilityID);
    public void setRoom(Integer NumOfRooms);

}
