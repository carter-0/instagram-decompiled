package org.webrtc;

public class BaseBitrateAdjuster implements BitrateAdjuster {
    public int targetBitrateBps;
    public double targetFps;

    public void reportEncodedFrame(int i) {
    }

    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    public double getCodecConfigFramerate() {
        return this.targetFps;
    }

    public void setTargets(int i, double d) {
        this.targetBitrateBps = i;
        this.targetFps = d;
    }
}
