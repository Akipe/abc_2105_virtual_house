package virtualhouse_v2.lib;

public class RemoteControl {
    VirtualHouse virtualHouse;
    Door door;

    public RemoteControl (VirtualHouse _virtualHouse, Door _door){
        this.virtualHouse = _virtualHouse;
        this.door = _door;
    }

    public Boolean openDoor() {
        return this.door.open();
    }

    public Boolean closeDoor() {
        return this.door.close();
    }

    public Boolean openInPercentDoor(Double percent) {
        return this.door.openInPercent(percent);
    }

    public Boolean closeInPercentDoor(Double percent) {
        return this.door.closeInPercent(percent);
    }

    
    public Double getDoorOpenLevel() {
        return this.door.getOpenLevel();
    }

    public Boolean getCompletelyOpen() {
        return this.door.isCompletelyOpen();
    }

    public Boolean getCompletelyClose() {
        return this.door.isCompletelyClose();
    }

    // public Boolean stopOpeningDoor() {

    // }

    public Boolean remoteLock() {
        return this.door.lock();
    }

    public Boolean remoteUnlock() {
        return this.door.unlock();
    }

    public Boolean getDoorIsLock() {
        return this.door.getIsLock();
    }
}
