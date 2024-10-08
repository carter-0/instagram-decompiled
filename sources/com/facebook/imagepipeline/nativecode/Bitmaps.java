package com.facebook.imagepipeline.nativecode;

import X.0di;
import X.AnonymousClass7TF;
import X.Pxe;
import android.graphics.Bitmap;

public class Bitmaps {
    public static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    static {
        0di.A01("imagepipeline");
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z = true;
        Pxe.A1Z(AnonymousClass7TF.A1W(bitmap2.getConfig(), bitmap.getConfig()));
        Pxe.A1Z(bitmap.isMutable());
        Pxe.A1Z(AnonymousClass7TF.A1S(bitmap.getWidth(), bitmap2.getWidth()));
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z = false;
        }
        Pxe.A1Z(z);
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }
}
