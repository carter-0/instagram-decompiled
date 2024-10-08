package org.webrtc;

public interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getCodecConfigFramerate();

    void reportEncodedFrame(int i);

    void setTargets(int i, double d);
}
