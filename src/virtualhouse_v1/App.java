package virtualhouse_v1;

import virtualhouse_v1.lib.VirtualHouse;
import virtualhouse_v1.lib.door.GarageDoor;

public class App {
    public static void main(String[] args) {
        VirtualHouse    a_virtual_house;
        GarageDoor      a_garage_door;

        a_virtual_house = new VirtualHouse();
        a_garage_door = new GarageDoor(a_virtual_house);


        System.out.println("");
        System.out.println("On vient de créer notre porte...");

        System.out.println("La porte de garage est au niveau de "+ a_garage_door.getOpenLevel());
        if (a_garage_door.isCompletelyClose()) {
            System.out.println("La porte de garage est complétement fermé");
        } else {
            System.out.println("La porte de garage n'est pas complétement fermé");
        }
        if (a_garage_door.getIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }


        System.out.println("");
        System.out.println("On vérouille la porte...");
        if (a_garage_door.lock()) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }

        if (a_garage_door.getIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }


        System.out.println("");
        System.out.println("On déverrouille la porte...");
        if (a_garage_door.unlock()) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }

        if (a_garage_door.getIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }


        System.out.println("");
        System.out.println("On ouvre la porte à 50%...");
        if (a_garage_door.openInPercent(50.0)) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }

        System.out.println("La porte de garage est au niveau de "+ a_garage_door.getOpenLevel());
        if (a_garage_door.isCompletelyOpen()) {
            System.out.println("La porte de garage est complétement ouverte");
        } else {
            System.out.println("La porte de garage n'est pas complétement ouverte");
        }


        System.out.println("");
        System.out.println("On ouvre complétement la porte...");
        if (a_garage_door.open()) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }
        System.out.println("La porte de garage est au niveau de "+ a_garage_door.getOpenLevel());
        if (a_garage_door.isCompletelyOpen()) {
            System.out.println("La porte de garage est complétement ouverte");
        } else {
            System.out.println("La porte de garage n'est pas complétement ouverte");
        }


        System.out.println("");
        System.out.println("On verrouille la porte...");
        if (a_garage_door.lock()) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }
        if (a_garage_door.getIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }


        System.out.println("");
        System.out.println("On ferme la porte à 80.0%...");
        if (a_garage_door.closeInPercent(80.0)) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }
        System.out.println("La porte de garage est au niveau de "+ a_garage_door.getOpenLevel());
        if (a_garage_door.isCompletelyClose()) {
            System.out.println("La porte de garage est complétement fermé");
        } else {
            System.out.println("La porte de garage n'est pas complétement fermé");
        }


        System.out.println("");
        System.out.println("On ferme complétement la porte...");
        if (a_garage_door.close()) {
            System.out.println("... Succés de la commande :)");
        } else {
            System.out.println("... Erreur de la commande :(");
        }
        System.out.println("La porte de garage est au niveau de "+ a_garage_door.getOpenLevel());
        if (a_garage_door.isCompletelyClose()) {
            System.out.println("La porte de garage est complétement fermé");
        } else {
            System.out.println("La porte de garage n'est pas complétement fermé");
        }
        if (a_garage_door.getIsLock()) {
            System.out.println("La porte de garage est verouillé");
        } else {
            System.out.println("La porte de garage est déverouillé");
        }
    }
}
