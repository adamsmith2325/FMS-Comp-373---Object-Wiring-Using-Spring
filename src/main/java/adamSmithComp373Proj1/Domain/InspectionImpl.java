package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.DAL.InspectionDAO;
import adamSmithComp373Proj1.Domain.Facility;



public class InspectionImpl implements Inspection{
    
    private InspectionDAO Conn = new InspectionDAO();
    public Integer InspectionID;
    private String Name = Conn.getName();
    
    private String Details = Conn.getDetails();
    private Integer facility = Conn.getFacility(InspectionID);
    private Integer Room = Conn.getRoom(InspectionID);
    
    public InspectionImpl(Integer ID) {
        this.InspectionID = ID;
    }

    public String getName() {
        return this.Name;
    }

    public String getDetails() {
        return this.Details;
    }
    public Integer getFacility() {
        return Conn.getFacility(this.facility);
    }

    public Integer getRoom(){
        return Conn.getRoom(this.Room);
    }
    
    public void setName(String name){
        Conn.setName(this.InspectionID, name);
    }
    
    public void setRoom(Integer Room){
        Conn.setRoom(this.InspectionID, Room);
    }

    public void setFacility(Facility facility) {
        Conn.setFacility();
    }

    public void setFacility(Integer FacilityID) {
       
     Conn.setFacility();

    }

    public void setDetails(String insDetails) {
        Conn.setDetails();
    }

    public void addInspection(){
        Conn.addInspection();
    }
   




}
