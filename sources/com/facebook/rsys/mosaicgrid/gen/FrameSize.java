package com.facebook.rsys.mosaicgrid.gen;

import X.002;
import X.2LV;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class FrameSize {
    public static 2LV CONVERTER = C71546Omh.A00(64);
    public static long sMcfTypeId;
    public final int height;
    public final int width;

    public static native FrameSize createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameSize)) {
            return false;
        }
        FrameSize frameSize = (FrameSize) obj;
        return this.width == frameSize.width && this.height == frameSize.height;
    }

    public int hashCode() {
        return C66583MXo.A01(this.width) + this.height;
    }

    public String toString() {
        return 002.A0n("FrameSize{width=", ",height=", "}", this.width, this.height);
    }

    public FrameSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
