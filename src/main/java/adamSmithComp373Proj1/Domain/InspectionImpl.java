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
    
}
