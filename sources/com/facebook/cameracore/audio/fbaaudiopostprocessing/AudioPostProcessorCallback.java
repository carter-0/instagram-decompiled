package com.facebook.cameracore.audio.fbaaudiopostprocessing;

public interface AudioPostProcessorCallback {
    Object requestOutputBuffer();

    void returnOutputBuffer();
}
