public class AmdGpuFactory extends GpuFactory {
    @Override
    public GPU createGPU(String brand, int memory, String ProcessorCompatability) {
        if ("amd".equalsIgnoreCase(ProcessorCompatability)) {
            return new NvidiaGpu(brand,memory,ProcessorCompatability);
        } else {
            throw new IllegalArgumentException("Invalid Proccesor Compatibility for Amd GPU");
        }

    }
}
