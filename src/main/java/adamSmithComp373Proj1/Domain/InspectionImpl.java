package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.DAL.InspectionDAO;
import adamSmithComp373Proj1.Domain.Facility;

public enum Type{TYPE, TYPE2, TYPE3}

public class InspectionImpl extends Inspection{
    
    private InspectionDAO Conn = new InspectionDAO();
    private Integer InspectionID;
    private String Name = Conn.getName();
    private Type InsType = Conn.getType();
    private String Details = Conn.getDetails();
    private Integer facility = Conn.getFacility(InspectionID);
    private Integer Room = Conn.getRoom(InspectionID);
    
    public Inspection(Integer ID) {
        this.InspectionID = ID;
    }
    
    public int getInspectionID() {
        return Conn.getInspectionID(this.InspectionID);
    }
    public void addInspectionID(int inspectionID) {
         Conn.addInspectionID(this.InspectionID);
    }

    public String getName() {
        return this.Name;
    }
    public Type getType() {
        return this.InsType;
    }
    public String getDetails() {
        return this.Details;
    }
    public int getFacility() {
        return Conn.getFacility(this.facility);
    }

    public Integer getRoom(){
        return Conn.getRoom(this.Room);
    }
    public void setRoom(int InspectionID, Integer Room){
        Conn.setRoom(this.InspectionID, Room);
    }

    public void setFacility(Facility facility) {
        Conn.setFacility();
    }

    public void setFacility(Integer FacilityID) {
       
     Conn.setFacility();

    }

    public void setType(String InsType) {
        Conn.setType(this.InspectionID, InsType);
    }
    public void setDetails(String insDetails) {
        Conn.setDetails();
    }
}
