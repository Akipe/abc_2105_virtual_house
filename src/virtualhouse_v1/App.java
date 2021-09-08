package virtualhouse_v1;

import virtualhouse_v1.lib.Virtualhouse;
import virtualhouse_v1.lib.door.GarageDoor;

public class App {
    public static void main(String[] args) {
        Virtualhouse    a_virtual_house;
        GarageDoor      a_garage_door;

        a_virtual_house = new Virtualhouse();

        a_garage_door = new GarageDoor(a_virtual_house);

        a_garage_door.close();
        a_garage_door.lock();

        System.out.println(a_garage_door.getIsLock());;
    }
}
