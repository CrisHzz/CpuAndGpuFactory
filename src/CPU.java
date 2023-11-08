public abstract class CPU {
    private String brand;
    private int numberOfCores;
    private double clockSpeed;

    private String GPUCompatability;

    public CPU(String brand, int numberOfCores, double clockSpeed, String GPUCompatability) {
        this.brand = brand;
        this.numberOfCores = numberOfCores;
        this.clockSpeed = clockSpeed;
        this.GPUCompatability = GPUCompatability;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getNumberOfCores() {
        return this.numberOfCores;
    }

    public double getClockSpeed() {
        return this.clockSpeed;
    }

    public String getGPUCompatability() {
        return GPUCompatability;
    }

    public void setGPUCompatability(String GPUCompatability) {
        this.GPUCompatability = GPUCompatability;
    }


}
