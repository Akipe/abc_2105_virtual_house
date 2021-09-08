package virtualhouse_v2.lib;

public class RemoteControl {
    Door door;
    VirtualHouse virtualHouse;

    public RemoteControl (Door _door, VirtualHouse _virtualHouse){
        this.virtualHouse = _virtualHouse;
        this.door = _door;
    }

    public Boolean open() {
        return this.door.open();
    }

    public Boolean close() {
        return this.door.close();
    }

    public Boolean openInPercentDoor(Double percent) {
        return this.door.openInPercent(percent);
    }

    public Boolean closeInPercentDoor(Double percent) {
        return this.door.closeInPercent(percent);
    }

    
    public Double getDoorLevelOpenDoor() {
        return this.door.getOpenLevel();
    }

    // public Boolean stopOpeningDoor() {

    // }

    public Boolean lock() {
        return this.door.lock();
    }

    public Boolean unlock() {
        return this.door.unlock();
    }

    public Boolean getDoorIsLock() {
        return this.door.getIsLock();
    }
}
