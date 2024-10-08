package com.facebook.onecamera.components.arcore.alwayson.recording.interfaces;

public interface PlatformAlgorithmAlwaysOnDataSource {
    void closeSession();

    boolean isRecording();

    void updateFrame(long j, long j2);
}
