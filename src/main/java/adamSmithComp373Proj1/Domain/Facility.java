package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.DAL.FacilityDAO;

import java.util.ArrayList;

public interface Facility extends FacilityGetSetInterface {

    public ArrayList<String> listFacilities();
    public ArrayList<String> getFacilityInformation();
    public Integer requestAvailableCapacity();
    public void addNewFacility(String addName, String addLocation, String addPhone, Integer addNumOfRooms);
    public void removeFacility();
    public String getName();
    public String getLocation();
    public String getPhone();
    public Integer getNumberOfRooms();
    public Integer getOccupiedRooms();
    public void setName(String newName);
    public void setLocation(String newLocation);
    public void setPhone(String newPhone);
    public void setNumberOfRooms(Integer newRoomsNum);
    public void addOccupiedRoom();
    public void voidOccupiedRoom();

}

