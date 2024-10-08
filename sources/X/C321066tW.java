package X;

import android.content.Context;

/* renamed from: X.6tW  reason: invalid class name and case insensitive filesystem */
public abstract class C321066tW {
    public static final C321076tX A00(float f, int i, int i2, int i3) {
        int A01;
        if (i > 0) {
            A01 = i;
        } else {
            A01 = AnonymousClass1GB.A01(((float) i2) * f);
        }
        if (i2 <= 0) {
            i2 = AnonymousClass1GB.A01(((float) i) / f);
        }
        return new C321076tX(i3, A01, i2);
    }

    public static final C321076tX A01(Context context, float f, float f2, int i) {
        return new C321076tX(i, AnonymousClass1GB.A01(((float) context.getResources().getDisplayMetrics().widthPixels) * f), AnonymousClass1GB.A01((((float) context.getResources().getDisplayMetrics().widthPixels) * f) / f2));
    }
}
