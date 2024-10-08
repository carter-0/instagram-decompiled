package com.facebook.wearable.common.comms.rtc.hera.intf;

public interface INativeLoopbackAudioSinkSource extends IRawAudioSink, IRawAudioSource {
    void release();

    void start();

    void stop();
}
