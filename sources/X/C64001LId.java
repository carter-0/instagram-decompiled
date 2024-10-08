package X;

import android.graphics.Bitmap;
import com.instagram.util.creation.RenderBridge;

/* renamed from: X.LId  reason: case insensitive filesystem */
public abstract class C64001LId {
    public static final Bitmap A00(int i, int i2, int i3) {
        try {
            if (RenderBridge.isCacheKeyValid(i) && (!RenderBridge.freeCachedImage(i) || RenderBridge.isCacheKeyValid(i))) {
                0kD.A0D("SavePhotoUtil", "Cached image could not be freed", (Throwable) null);
            }
            return C7245Q0r.A00(i2, i3);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static final LOX A01(Bitmap bitmap, LAM lam, int i, int i2, int i3) {
        String str;
        LAM lam2 = lam;
        int intValue = lam.A03.intValue();
        if (intValue == 0) {
            str = "image/heic";
        } else if (intValue != 1) {
            str = "image/webp";
        } else {
            str = "image/jpeg";
        }
        return new LOX(bitmap, lam2, str, i, i2, i3, -1);
    }
}
