package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: X.Mup  reason: case insensitive filesystem */
public final class C67785Mup extends AnonymousClass52S {
    public final float A00;
    public final int A01;

    public final float A07(DisplayMetrics displayMetrics) {
        0qQ.A0B(displayMetrics, 0);
        return this.A00 / ((float) displayMetrics.densityDpi);
    }

    public final int A0C(int i, int i2, int i3, int i4, int i5) {
        return (i3 - i) + this.A01;
    }

    public C67785Mup(Context context, float f, int i) {
        super(context);
        this.A00 = f;
        this.A01 = i;
    }
}
