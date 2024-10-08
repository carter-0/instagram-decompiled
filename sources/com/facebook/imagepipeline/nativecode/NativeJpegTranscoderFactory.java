package com.facebook.imagepipeline.nativecode;

import X.0di;
import X.C17167VKw;
import X.C18637VvZ;
import X.VJb;

public class NativeJpegTranscoderFactory {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.imagepipeline.nativecode.NativeJpegTranscoder, java.lang.Object] */
    public NativeJpegTranscoder createImageTranscoder(C18637VvZ vvZ, boolean z) {
        if (vvZ != C17167VKw.A05) {
            return null;
        }
        int i = this.A00;
        boolean z2 = this.A02;
        boolean z3 = this.A01;
        ? obj = new Object();
        obj.mResizingEnabled = z;
        obj.mMaxBitmapSize = i;
        obj.mUseDownsamplingRatio = z2;
        if (!z3) {
            return obj;
        }
        synchronized (VJb.class) {
            if (!VJb.A00) {
                0di.A01("native-imagetranscoder");
                VJb.A00 = true;
            }
        }
        return obj;
    }

    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
    }
}
