public class GPU {
    private String brand;

    private int memory;

    private String ProcessorCompatability;

    public GPU(String brand, int memory, String processorCompatability) {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getProcessorCompatability() {
        return ProcessorCompatability;
    }

    public void setProcessorCompatability(String ProcessorCompatability) {
        this.ProcessorCompatability = ProcessorCompatability;
    }

}
