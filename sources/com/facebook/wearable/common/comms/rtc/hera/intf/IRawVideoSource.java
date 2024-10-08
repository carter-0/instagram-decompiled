package com.facebook.wearable.common.comms.rtc.hera.intf;

import X.0qQ;
import X.0sL;
import X.0sP;
import android.view.Surface;

public interface IRawVideoSource {

    public final class FrameOutput extends Output {
        public final 0sP onFrame;

        public FrameOutput(0sP r2) {
            0qQ.A0B(r2, 1);
            this.onFrame = r2;
        }

        public final 0sP getOnFrame() {
            return this.onFrame;
        }
    }

    public abstract class Output {
        public 0sL onOutputParams;

        public final 0sL getOnOutputParams() {
            return this.onOutputParams;
        }

        public final void setOutputParams(Integer num, IVideoSize iVideoSize) {
            0sL r0 = this.onOutputParams;
            if (r0 != null) {
                r0.invoke(num, iVideoSize);
            }
        }

        public final void setOnOutputParams(0sL r1) {
            this.onOutputParams = r1;
        }
    }

    public final class SurfaceOutput extends Output {
        public 0sL onBitmapFrameListenerAdded;
        public final Surface surface;

        public SurfaceOutput(Surface surface2) {
            0qQ.A0B(surface2, 1);
            this.surface = surface2;
        }

        public final void addBitmapFrameListener(0sP r3, float f) {
            0qQ.A0B(r3, 0);
            0sL r1 = this.onBitmapFrameListenerAdded;
            if (r1 != null) {
                r1.invoke(r3, Float.valueOf(f));
            }
        }

        public static /* synthetic */ void addBitmapFrameListener$default(SurfaceOutput surfaceOutput, 0sP r2, float f, int i, Object obj) {
            if ((i & 2) != 0) {
                f = 1.0f;
            }
            surfaceOutput.addBitmapFrameListener(r2, f);
        }

        public final 0sL getOnBitmapFrameListenerAdded() {
            return this.onBitmapFrameListenerAdded;
        }

        public final Surface getSurface() {
            return this.surface;
        }

        public final void setOnBitmapFrameListenerAdded(0sL r1) {
            this.onBitmapFrameListenerAdded = r1;
        }
    }

    void addOutput(Output output);

    void releaseBlocking();

    void removeOutput(Output output);

    void startBlocking();

    void stopBlocking();
}
