package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: X.Mum  reason: case insensitive filesystem */
public final class C67782Mum extends AnonymousClass52S {
    public final int A00;

    public final float A07(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    public C67782Mum(Context context, int i) {
        super(context);
        this.A00 = i;
    }

    public final int A0C(int i, int i2, int i3, int i4, int i5) {
        return C66584MXp.A01(i4, i3, i2, i) + this.A00;
    }
}
