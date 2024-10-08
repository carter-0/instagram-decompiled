package com.facebook.wearable.common.comms.rtc.hera.intf;

public interface INativeTransportProvider {
    String getIdentifier();

    boolean start();

    void stop();
}
