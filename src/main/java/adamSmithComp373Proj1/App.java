package adamSmithComp373Proj1;

import adamSmithComp373Proj1.Domain.*;
import adamSmithComp373Proj1.DAL.*;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");
        
        
        //Containered Facility Tests
        FacilityImpl Building1 = (FacilityImpl) context.getBean("Facility");
        Building1.FacilityID = 3;
        
        Building1.setPhone("8888888888");
        System.out.println(Building1.getPhone());
        
        /*
        //Containered FacilityUse Tests
        FacilityUseImpl Event1 = (FacilityUseImpl) context.getBean("FacilityUse");
        Event1.useID = 1;
        
        Event1.setRoomID(2);
        System.out.println(Event1.getRoomID());  

        
        
        //Containered Inspection Tests
        InspectionImpl Inspection1 = (InspectionImpl) context.getBean("Inspection");
        Inspection1.InspectionID = 1;

        Inspection1.setRoom(2);
        System.out.println(Inspection1.getRoom()); 

        */
    

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        //Facility facility = new Facility(1);
       //Facility facility2 = new Facility(2);
        //System.out.println(facility.getFacilityInformation());
        //System.out.println(facility.getName());
        //System.out.println(facility2.getName());
        //System.out.println(facility.getLocation());
        //System.out.println("Hello World!");
        //System.out.println(facility.getOccupiedRooms());
        //System.out.println(facility.listFacilities());
        //facility.addNewFacility("Interface Insert Test", "6533 N Newgard Avenue, Chicago, IL 60626", "9062039222", 15);\
        //System.out.println(facility.getNumberOfRooms());
        //System.out.println(facility.requestAvailableCapacity());
        //facility.addOccupiedRoom();
        //facility.addOccupiedRoom();
        //facility.addOccupiedRoom();
        //facility.addOccupiedRoom();
        //facility.voidOccupiedRoom();
        //facility.voidOccupiedRoom();
        //facility.voidOccupiedRoom();
        //FacilityMaintainence main = new FacilityMaintainence();  
        //FacilityUse test = new FacilityUse(1);
       // System.out.println(test.getDateStarted());
    }
}
