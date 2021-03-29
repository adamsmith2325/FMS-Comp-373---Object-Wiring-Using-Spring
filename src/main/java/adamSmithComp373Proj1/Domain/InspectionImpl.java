package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.DAL.InspectionDAO;
import adamSmithComp373Proj1.Domain.Facility;

public enum Type{TYPE, TYPE2, TYPE3}

    
    private InspectionDAO Conn = new InspectionDAO();
    private Integer InspectionID;
    private String Name = Conn.getName();
    private Type InsType = Conn.getType();
    private String Details = Conn.getDetails();
    private Integer facility = Conn.getFacility();
    private Integer Room = Conn.getRoom();
   
    public Inspection(Integer ID) {
        this.InspectionID = ID;
    }
    
    public int getInspectionID() {
        return Conn.getInspectionID(this.InspectionID);
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
}
