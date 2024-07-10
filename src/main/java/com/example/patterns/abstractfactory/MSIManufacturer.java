package com.example.patterns.abstractfactory;

public class MSIManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new GpuMSI();
    }

    @Override
    public Monitor createMonitor() {
        return new MonitorMSI();
    }
}
