public class Main {
    public static void main(String[] args) {
        CpuFactory amdFactory = new AmdCpuFactory();

        CPU amdCpu = amdFactory.createCPU("AMD ryzen 5700x", 8, 4.6, "amd");

        System.out.println("CPU Brand: " + amdCpu.getBrand());
        System.out.println("Number of Cores: " + amdCpu.getNumberOfCores());
        System.out.println("Clock Speed: " + amdCpu.getClockSpeed());
        System.out.println("GPU Compatibility: " + amdCpu.getGPUCompatability());

        //Una que no funcione
        CPU amdCpu2 = amdFactory.createCPU("AMD ryzen core 7", 8, 3.5, "nvidia");
        System.out.println("GPU Compatibility: " + amdCpu2.getGPUCompatability());

        CpuFactory intelFactory = new IntelCpuFactory();

        CPU intelCpu = intelFactory.createCPU("Intel i7 10700k", 8, 5.1, "nvidia");

        System.out.println("CPU Brand: " + intelCpu.getBrand());
        System.out.println("Number of Cores: " + intelCpu.getNumberOfCores());
        System.out.println("Clock Speed: " + intelCpu.getClockSpeed());
        System.out.println("GPU Compatibility: " + intelCpu.getGPUCompatability());

        //Una que no funcione

        CPU intelCpu2 = intelFactory.createCPU("Intel ryzen 10500x", 8, 5.1, "amd");

        System.out.println("GPU Compatibility: " + intelCpu2.getGPUCompatability());

        //Ahora con la gpu

        GpuFactory nvidiaFactory = new NvidiaGpuFactory();

        GPU nvidiaGpu = nvidiaFactory.createGPU("Nvidia RTX 3060", 12, "intel");

        //Una que no funcione

        GPU nvidiaGpu2 = nvidiaFactory.createGPU("Nvidia RX6600XT", 12, "amd");


        //Ahora con amd

        GpuFactory amdGpuFactory = new AmdGpuFactory();

        GPU amdGpu = amdGpuFactory.createGPU("AMD RX6600XT", 12, "amd");

        System.out.println("GPU Brand: " + amdGpu.getBrand());
        System.out.println("Memory: " + amdGpu.getMemory());
        System.out.println("Processor Compatibility: " + amdGpu.getProcessorCompatability());

        //Una que no funcione

        GPU amdGpu2 = amdGpuFactory.createGPU("AMD RTX 3060", 12, "intel");



    }
}


