package com.example.springcloudstreamissue2170;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class StreamBridgeService {

    private final StreamBridge streamBridge;

    public StreamBridgeService(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public void externallyTrigger() {
        String externalData = "data";
        streamBridge.send("sourceSupplier-out-0", externalData);
    }
}
