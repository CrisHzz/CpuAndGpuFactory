public class RAM {
    private String MemoryType;
    private int MemorySize;
    private double MemorySpeed;

    private Boolean compatability;

    public Boolean getCompatability() {
        return compatability;
    }

    public void setCompatability(Boolean compatability) {
        this.compatability = compatability;
    }

    public String getMemoryType() {
        return MemoryType;
    }

    public void setMemoryType(String memoryType) {
        MemoryType = memoryType;
    }

    public int getMemorySize() {
        return MemorySize;
    }

    public void setMemorySize(int memorySize) {
        MemorySize = memorySize;
    }

    public double getMemorySpeed() {
        return MemorySpeed;
    }

    public void setMemorySpeed(double memorySpeed) {
        MemorySpeed = memorySpeed;
    }
}
