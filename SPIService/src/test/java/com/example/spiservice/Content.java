package com.example.spiservice;

public class Content {
    private SPIService spiService;

    public Content(SPIService spiService) {
        this.spiService = spiService;
    }

    public void executeSPIService() {
        this.spiService.execute();
    }
}
