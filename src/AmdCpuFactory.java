public class AmdCpuFactory extends CpuFactory {
    @Override
    public CPU createCPU(String brand, int numberOfCores, double clockSpeed, String gpuCompatibility) {
        if ("amd".equalsIgnoreCase(gpuCompatibility)) {
            return new AmdCpu(brand, numberOfCores, clockSpeed, gpuCompatibility);
        } else {
            throw new IllegalArgumentException("Invalid GPU Compatibility for AMD CPU");
        }
    }
}



