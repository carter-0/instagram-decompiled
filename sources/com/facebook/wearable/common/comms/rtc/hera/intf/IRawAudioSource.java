package com.facebook.wearable.common.comms.rtc.hera.intf;

public interface IRawAudioSource {
    void release();

    void start();

    void stop();
}
