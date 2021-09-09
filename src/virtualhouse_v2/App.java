package virtualhouse_v2;

import virtualhouse_v2.lib.RemoteControl;
import virtualhouse_v2.lib.VirtualHouse;
import virtualhouse_v2.lib.door.GarageDoor;

public class App {
    public static void main(String[] args) {
        VirtualHouse    a_virtual_house;
        GarageDoor      a_garage_door;
        RemoteControl   remote_door;

        a_virtual_house = new VirtualHouse();
        a_garage_door   = new GarageDoor(a_virtual_house);
        remote_door     = new RemoteControl(a_virtual_house, a_garage_door);


        System.out.println("");
        System.out.println("On vient de créer notre porte...");
        System.out.println("On vient de créer notre télécommande...");

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


        System.out.println("");
        System.out.println("On déverrouille la porte à distance...");
        if (remote_door.remoteUnlock()) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }

        if (remote_door.getDoorIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }


        System.out.println("");
        System.out.println("On verrouille la porte à distance...");
        if (remote_door.remoteLock()) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }
        
        if (remote_door.getDoorIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }
        

        System.out.println("");
        System.out.println("On déverrouille la porte à distance...");
        if (remote_door.remoteUnlock()) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }

        if (remote_door.getDoorIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }


        System.out.println("");
        System.out.println("On ouvre la porte à 50% à distance...");
        if (remote_door.openInPercentDoor(50.0)) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }
        
        System.out.println("La porte de garage est au niveau de " + remote_door.getDoorOpenLevel());
        if (remote_door.getCompletelyOpen()) {
            System.out.println("La porte de garage est complétement ouverte");
        } else {
            System.out.println("La porte de garage n'est pas complétement ouverte");
        }


        System.out.println("");
        System.out.println("On ouvre la porte à 30% à distance...");
        if (remote_door.openInPercentDoor(30.0)) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }
        
        System.out.println("La porte de garage est au niveau de " + remote_door.getDoorOpenLevel());
        if (remote_door.getCompletelyOpen()) {
            System.out.println("La porte de garage est complétement ouverte");
        } else {
            System.out.println("La porte de garage n'est pas complétement ouverte");
        }


        System.out.println("");
        System.out.println("On ouvre complétement la porte à distance...");
        if (remote_door.openDoor()) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }

        System.out.println("La porte de garage est au niveau de " + remote_door.getDoorOpenLevel());
        if (remote_door.getCompletelyOpen()) {
            System.out.println("La porte de garage est complétement ouverte");
        } else {
            System.out.println("La porte de garage n'est pas complétement ouverte");
        }


        System.out.println("");
        System.out.println("On verrouille la porte à distance...");
        if (remote_door.remoteLock()) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }

        if (remote_door.getDoorIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }


        System.out.println("");
        System.out.println("On ferme la porte à 80%...");
        if (remote_door.closeInPercentDoor(80.0)) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }

        System.out.println("La porte de garage est au niveau de " + remote_door.getDoorOpenLevel());
        if (remote_door.getCompletelyClose()) {
            System.out.println("La porte de garage est complétement fermé");
        } else {
            System.out.println("La porte de garage n'est pas complétement fermé");
        }


        System.out.println("");
        System.out.println("On ferme la porte à 50% à distance...");
        if (remote_door.closeInPercentDoor(50.0)) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }

        System.out.println("La porte de garage est au niveau de " + remote_door.getDoorOpenLevel());
        if (remote_door.getCompletelyClose()) {
            System.out.println("La porte de garage est complétement fermé");
        } else {
            System.out.println("La porte de garage n'est pas complétement fermé");
        }


        System.out.println("");
        System.out.println("On ferme la porte à 90% à distance...");
        if (remote_door.closeInPercentDoor(90.0)) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }

        System.out.println("La porte de garage est au niveau de " + remote_door.getDoorOpenLevel());
        if (remote_door.getCompletelyClose()) {
            System.out.println("La porte de garage est complétement fermé");
        } else {
            System.out.println("La porte de garage n'est pas complétement fermé");
        }


        System.out.println("");
        System.out.println("On ferme complétement la porte à distance...");
        if (remote_door.closeDoor()) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }

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


        System.out.println("");
        System.out.println("On verrouille la porte à distance...");
        if (remote_door.remoteLock()) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }

        if (remote_door.getDoorIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }

    }
}
