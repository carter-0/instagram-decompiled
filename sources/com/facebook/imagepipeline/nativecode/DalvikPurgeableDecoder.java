package com.facebook.imagepipeline.nativecode;

import X.0di;
import X.0qQ;
import X.C17403VUi;
import X.C18399Vr1;
import android.graphics.Bitmap;

public abstract class DalvikPurgeableDecoder {
    public static final byte[] EOI = {-1, -39};
    public final C17403VUi mUnpooledBitmapsCounter;

    public static native void nativePinBitmap(Bitmap bitmap);

    static {
        0di.A01("imagepipeline");
    }

    public DalvikPurgeableDecoder() {
        if (C18399Vr1.A01 == null) {
            synchronized (C18399Vr1.class) {
                if (C18399Vr1.A01 == null) {
                    C18399Vr1.A01 = new C17403VUi(C18399Vr1.A00);
                }
            }
        }
        C17403VUi vUi = C18399Vr1.A01;
        0qQ.A0A(vUi);
        this.mUnpooledBitmapsCounter = vUi;
    }
}
