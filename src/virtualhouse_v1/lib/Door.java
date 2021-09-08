package virtualhouse_v1.lib;

public class Door {
    private VirtualHouse    virtualHouse;
    private Boolean         isLock;
    private double          openLevel; // 0.0 -> not open, 100.0 -> completely open


    public Door(VirtualHouse _virtualHouse)
    {
        this.virtualHouse   = _virtualHouse;
        this.isLock         = true;
        this.openLevel      = 0.0;
    }

    public Boolean openInPercent(double _openLevel)
    {
        // Check if user percent is between 0% and 100%
        // Check user percent is not bellow than current open percent
        // Check if the door is unlock
        if (isCorrectPercent(_openLevel) && _openLevel > this.getOpenLevel() && !this.getIsLock()) {
            this.openLevel = _openLevel;
            return true;
        } else {
            return false; // The user percent is too big, so we warn user.
        }
    }

    public Boolean open()
    {
        return this.openInPercent(100.0);
    }

    public Boolean closeInPercent(double _openLevel)
    {
        // Check if user percent is between 0% and 100%
        // Check user percent is not superior than current open percent
        // Check if the door is unlock
        if (isCorrectPercent(_openLevel) && _openLevel < this.getOpenLevel()) {
            this.openLevel = _openLevel;
            return true;
        } else {
            return false; // The user percent is too small, so we warn user.
        }
    }

    public Boolean close()
    {
        return this.closeInPercent(0.0);
    }

    public Double getOpenLevel()
    {
        return this.openLevel;
    }

    public Boolean isCompletelyOpen()
    {
        if (this.openLevel == 100.0) {
            return true;
        }
        
        return false;
    }

    public Boolean isCompletelyClose()
    {
        if (this.openLevel == 0.0) {
            return true;
        }

        return false;
    }

    public Boolean lock()
    {
        if (!this.isLock) {
            if (this.isCompletelyClose()) {
                this.isLock = true;
                return true; // The command succeed.
            } else {
                return false; // The door is not close, so we warn user.
            }
        }

        return false; // The door is already lock, so we warn user that there is an error.
    }

    public Boolean unlock()
    {
        if (this.isLock) {
            this.isLock = false;
            return true; // The command succeed.
        }

        return false; // The door is already unlock, so we warn user that there is an error.
    }

    public Boolean getIsLock()
    {
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
