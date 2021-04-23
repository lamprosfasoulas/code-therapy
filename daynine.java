import java.lang.reflect.Constructor;
import java.util.ArrayList;

/**
 * Date: 20/04/2021
 * Day: 9 / 100
 * 
 * Creator: Lampros Fasoulas
 * 
 * -- Project Description --
 * this is going be a reservation managing system
 */

public class daynine {
    //this is our room list
    public static ArrayList<Room> roomsList = new ArrayList<Room>();

    public static class Room{
        private int roomId;
        private int roomSize;
        private boolean vacant;
        private String dateIN;
        private String dateOUT;

        public Room(int roomId, int roomSize, boolean vacant, String dateIN, String dateOUT){
            this.roomId = roomId;
            this.roomSize = roomSize;
            this.vacant = vacant;
            this.dateIN = dateIN;
            this.dateOUT = dateOUT;
        }

        public int getRoomId() {
            return roomId;
        }

        public void setRoomId(int roomId) {
            this.roomId = roomId;
        }

        public int getRoomSize() {
            return roomSize;
        }

        public void setRoomSize(int roomSize) {
            this.roomSize = roomSize;
        }

        public boolean isVacant() {
            return vacant;
        }

        public void setVacant(boolean vacant) {
            this.vacant = vacant;
        }

        public String getDateIN() {
            return dateIN;
        }

        public void setDateIN(String dateIN) {
            this.dateIN = dateIN;
        }

        public String getDateOUT() {
            return dateOUT;
        }

        public void setDateOUT(String dateOUT) {
            this.dateOUT = dateOUT;
        }
        @Override
        public String toString() {
            //change true and false to vacant or full
            //add that if the room is full display dates
            return "Room [Size=" + String.valueOf(roomSize) + " Vacant=" + String.valueOf(vacant) +"\n";
        }
    }
    public void setup(int rooms, int sizeOne, int sizeTwo, int sizeThree){
        if (rooms != sizeOne + sizeTwo + sizeThree) {
            System.out.println("Error: Arguments do not match:");
        }
        for (int i = 0; i < rooms; i++) {
            int rId = i + 1;
            int sz = 0;
            if (sizeOne > 0) {
                sz = 1;
                sizeOne --;
            }
            else if(sizeOne == 0 && sizeTwo > 0){
                sz = 2;
                sizeTwo --;
            }
            else if(sizeOne == 0 && sizeTwo == 0 && sizeThree > 0){
                sz = 3;
                sizeThree --;
                
            }
            Room room = new Room(rId, sz, false, "", "");
            roomsList.add(room);
        }
    }

    public static void view(){
        //code goes here
    }
    public static void book(){
        //code goes here
    }
    public static void checkOut(){
        //code goes here
    }

    public static void main(String[] args) {
        daynine day = new daynine();
        day.setup(5, 1, 3, 1);
        System.out.println(roomsList.toString());
        //
        
    }
    
}