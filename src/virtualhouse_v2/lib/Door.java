package virtualhouse_v2.lib;

public class Door {
    private VirtualHouse virtualhouse;
    private Boolean isLock;
    private double openLevel;

    public Door(VirtualHouse _virtualHouse) {
        this.virtualhouse = _virtualHouse;
        this.isLock = true;
        this.openLevel = 0.0;
    }

    public Boolean openInPercent(double _openLevel) {
        // Check if user percent is not bigger than 100%, if the door is unlock and is
        // not bellow than current open percent.
        if (isCorrectPercent(_openLevel) && _openLevel > this.getOpenLevel() && !this.getIsLock() && _openLevel > this.getOpenLevel()) {
            this.openLevel = _openLevel;
            return true;
        } else {
            // The user percent is too big, is lock and superior as user want so we warn
            // user.
            return false;
        }
    }

    public Boolean open() {
        return this.openInPercent(100.0);
    }

    public Boolean closeInPercent(double _openLevel) {
        // Check if user percent is not less than 0%, is not superior than current open
        // percent,
        if (_openLevel > 0.0 && _openLevel < this.getOpenLevel()) {
            this.openLevel = _openLevel;
            return true;
        } else {
            // The user percent is too small, is bellow than the user want, so we warn user.
            return false;
        }
    }

    public Boolean close() {
        return this.closeInPercent(0.0);
    }

    // public Boolean stopOpening() {}

    public Double getOpenLevel() {
        return this.openLevel;
    }

    public Boolean isCompletelyOpen() {
        if (this.openLevel == 100.0) {
            return true;
        }

        return false;
    }

    public Boolean isCompletelyClose() {
        if (this.openLevel == 0.0) {
            return true;
        }

        return false;
    }

    public Boolean lock() {
        if (this.isCompletelyClose()) {
            this.isLock = true;
            return true; // The command succeed.
        }

        return false; // The door is already lock, so we warn user that there is an error.
    }

    public Boolean unlock() {
        if (this.isCompletelyClose()) {
            this.isLock = false;
            return true; // The command succeed.
        }

        return false; // The door is already unlock, so we warn user that there is an error.
    }

    public Boolean getIsLock() {
        return this.isLock;
    }

        /**
     * Check is percent is between 0% and 100%
     * 
     * @param _numberToCheck
     * @return
     */
    private Boolean isCorrectPercent(Double _numberToCheck)
    {
        return (_numberToCheck <= 100.0 && _numberToCheck >= 0.0);
    }
}
