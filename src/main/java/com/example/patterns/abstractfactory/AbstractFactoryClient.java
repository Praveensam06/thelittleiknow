package com.example.patterns.abstractfactory;

public class AbstractFactoryClient {
    public static void main(String... args) {
        Company asusComputer = new ASUSManufacturer();
        Gpu gpuASUS = asusComputer.createGpu();
        Monitor monitorASUS = asusComputer.createMonitor();

        Company msiComputer = new MSIManufacturer();
        Gpu gpuMSI = msiComputer.createGpu();
        Monitor monitorMSI = msiComputer.createMonitor();
    }
}
