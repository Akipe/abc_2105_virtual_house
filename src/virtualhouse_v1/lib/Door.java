package virtualhouse_v1.lib;

public class Door {
    private Boolean     isLock;
    private double      openLevel;


    public Door()
    {
        this.isLock = false;
        this.openLevel = 0.0;
    }

    public Boolean openInPercent(double openLevel)
    {
        if (openLevel < 100.0) { // Check if user percent is not bigger than 100%
            if (!this.getIsLock()) { // Check if the door is unlock
                if (openLevel > this.getOpenLevel()) { // Check user percent is not bellow than current open percent
                    this.openLevel = openLevel;
                    return true;
                } else {
                    // The current door level is superior as user want,
                    // So we warn user.
                    return false;
                }
            } else {
                return false; // The door is lock, so we warn user.
            }
        } else {
            return false; // The user percent is too big, so we warn user.
        }
    }

    public Boolean open()
    {
        return this.openInPercent(100.0);
    }

    public Boolean closeInPercent(double openLevel)
    {
        if (openLevel < 100.0) { // Check if user percent is not bigger than 100%
                if (openLevel < this.getOpenLevel()) { // Check user percent is not superior than current open percent
                    this.openLevel = openLevel;
                    return true;
                } else {
                    // The current door level is bellow than the user want,
                    // So we warn user.
                    return false;
                }
        } else {
            return false; // The user percent is too big, so we warn user.
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
}
