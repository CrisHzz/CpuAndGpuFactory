public class IntelCpuFactory extends CpuFactory {
    public CPU createCPU(String brand, int numberOfCores, double clockSpeed, String gpuCompatibility) {
        if ("nvidia".equalsIgnoreCase(gpuCompatibility)) {
            return new IntelCPU(brand, numberOfCores, clockSpeed, gpuCompatibility);
        } else {
            throw new IllegalArgumentException("Invalid GPU Compatibility for INTEL CPU");
        }
    }

}
