package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public abstract class RVN {
    public static Bitmap A00(Bitmap bitmap, int i) {
        if (i <= 0) {
            return bitmap;
        }
        try {
            Matrix A0U = AnonymousClass7TE.A0U();
            A0U.postRotate((float) i);
            Bitmap A09 = Pxk.A09(bitmap, A0U);
            if (bitmap != A09) {
                bitmap.recycle();
            }
            return A09;
        } catch (Throwable th) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            throw th;
        }
    }
}
