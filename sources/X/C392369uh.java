package X;

import android.graphics.Bitmap;

/* renamed from: X.9uh  reason: invalid class name and case insensitive filesystem */
public abstract class C392369uh {
    public static final Bitmap A00(Bitmap bitmap) {
        int i;
        int i2 = 224;
        if (bitmap.getWidth() < bitmap.getHeight()) {
            i = (bitmap.getHeight() * 224) / bitmap.getWidth();
        } else {
            i = 224;
            i2 = (bitmap.getWidth() * 224) / bitmap.getHeight();
        }
        Bitmap A00 = 0fO.A00(bitmap, i2, i, true);
        0qQ.A07(A00);
        return A00;
    }
}
