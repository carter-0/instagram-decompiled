package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;

public abstract class AES {
    public static final C59985Jcu A00(Bitmap bitmap, float f, int i, int i2) {
        Matrix A0U = AnonymousClass7TE.A0U();
        A0U.setScale(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        C59985Jcu jcu = new C59985Jcu(bitmap, A0U, f, 15);
        jcu.setBounds(0, 0, i, i2);
        return jcu;
    }

    public static final void A02(Drawable drawable, C358868bb r2) {
        0qQ.A0B(drawable, 0);
        if (drawable instanceof B2E) {
            ((B2E) drawable).setTextFormat(r2);
        }
    }

    public static final String A01(Drawable drawable) {
        C358868bb C5B;
        String str;
        if (!(drawable instanceof B2E) || (C5B = ((B2E) drawable).C5B()) == null || (str = C5B.A09) == null) {
            return null;
        }
        return str;
    }
}
