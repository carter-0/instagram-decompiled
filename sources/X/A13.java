package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public abstract class A13 {
    public static final C59985Jcu A00(Bitmap bitmap, Integer num, float f, int i, int i2) {
        Matrix A0U = AnonymousClass7TE.A0U();
        A0U.setScale(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        C59985Jcu jcu = new C59985Jcu(bitmap, A0U, f, 15);
        int A0A = AnonymousClass7TG.A0A(num);
        jcu.setBounds(A0A, A0A, i, i2);
        return jcu;
    }
}
