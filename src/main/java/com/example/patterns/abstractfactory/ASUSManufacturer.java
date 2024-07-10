package com.example.patterns.abstractfactory;

public class ASUSManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new GpuASUS();
    }

    @Override
    public Monitor createMonitor() {
        return new MonitorASUS();
    }
}
