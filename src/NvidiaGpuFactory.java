public class NvidiaGpuFactory extends GpuFactory {

    @Override
    public GPU createGPU(String brand, int memory, String ProcessorCompatability) {
        if ("intel".equalsIgnoreCase(ProcessorCompatability)) {
            return new NvidiaGpu(brand,memory,ProcessorCompatability);
        } else {
            throw new IllegalArgumentException("Invalid Proccesor Compatibility for Nvidia GPU");
        }

    }
}
