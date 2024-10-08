package com.facebook.msys.mci;

import X.C67541ts;
import android.graphics.Bitmap;

public class PSNRCalculator {
    public static native double[] computePSNRNative(Bitmap bitmap, Bitmap bitmap2);

    static {
        C67541ts.A00();
    }
}
