package virtualhouse_v2;

import virtualhouse_v2.lib.RemoteControl;
import virtualhouse_v2.lib.VirtualHouse;
import virtualhouse_v2.lib.door.GarageDoor;

public class App {
    public static void main(String[] args) {
        VirtualHouse a_virtual_house;
        GarageDoor a_garage_door;
        RemoteControl remote_door;

        a_virtual_house = new VirtualHouse();
        a_garage_door = new GarageDoor(a_virtual_house);
        remote_door = new RemoteControl(a_garage_door, a_virtual_house);


        System.out.println("");
        System.out.println("La porte de garage est au niveau de " + remote_door.getDoorOpenLevel());

        System.out.println("");
        if (remote_door.getDoorIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }
        remote_door.remoteUnlock();
        if (remote_door.getDoorIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }

        remote_door.remoteLock();
        if (remote_door.getDoorIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }
        
        remote_door.remoteUnlock();
        if (remote_door.getDoorIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }

        System.out.println("");
        remote_door.openInPercentDoor(50.0);
        System.out.println(remote_door.getDoorOpenLevel());
        System.out.println("La porte de garage est au niveau de " + remote_door.getDoorOpenLevel());
        if (remote_door.getCompletelyOpen()) {
            System.out.println("La porte de garage est complétement ouverte");
        } else {
            System.out.println("La porte de garage n'est pas complétement ouverte");
        }

        System.out.println("");
        remote_door.openDoor();
        System.out.println("La porte de garage est au niveau de " + remote_door.getDoorOpenLevel());
        if (remote_door.getCompletelyOpen()) {
            System.out.println("La porte de garage est complétement ouverte");
        } else {
            System.out.println("La porte de garage n'est pas complétement ouverte");
        }

        System.out.println("");
        remote_door.remoteLock();
        if (remote_door.getDoorIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }

        System.out.println("");
        remote_door.closeInPercentDoor(80.0);
        System.out.println("La porte de garage est au niveau de " + remote_door.getDoorOpenLevel());
        if (remote_door.getCompletelyClose()) {
            System.out.println("La porte de garage est complétement fermé");
        } else {
            System.out.println("La porte de garage n'est pas complétement fermé");
        }

        System.out.println("");
        remote_door.closeDoor();
        System.out.println("La porte de garage est au niveau de " + remote_door.getDoorOpenLevel());
        if (remote_door.getCompletelyClose()) {
            System.out.println("La porte de garage est complétement fermé");
        } else {
            System.out.println("La porte de garage n'est pas complétement fermé");
        }
        if (remote_door.getDoorIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }

    }
}
