package X;

import android.graphics.Bitmap;

public final class T0D implements C367808rb {
    public static final T0D A00 = new T0D();

    public final void DdG(C368458se r2) {
        Bitmap bitmap = (Bitmap) r2.getValue();
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
