package org.webrtc;

public class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    public static final int INITIAL_FPS = 30;

    public double getCodecConfigFramerate() {
        return 30.0d;
    }

    public void setTargets(int i, double d) {
        if (this.targetFps == 0.0d) {
            d = 30.0d;
        }
        super.setTargets(i, d);
        this.targetBitrateBps = (int) (((double) (this.targetBitrateBps * 30)) / this.targetFps);
    }
}
