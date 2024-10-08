package X;

import android.graphics.Bitmap;

/* renamed from: X.RRl  reason: case insensitive filesystem */
public abstract class C9160RRl {
    public static Bitmap.Config A00(Bitmap bitmap) {
        if (bitmap.getHardwareBuffer().getFormat() == 22) {
            return Bitmap.Config.RGBA_F16;
        }
        return Bitmap.Config.ARGB_8888;
    }
}
