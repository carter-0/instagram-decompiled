package X;

import android.graphics.Color;

/* renamed from: X.Sh4  reason: case insensitive filesystem */
public final class C11818Sh4 implements C13520Tbp {
    public static final C11818Sh4 A00 = new Object();

    public final /* bridge */ /* synthetic */ Object E1k(C12828T8z t8z, float f) {
        double d;
        boolean z = false;
        if (t8z.A0E() == AnonymousClass05K.A00) {
            z = true;
            t8z.A0I();
        }
        double A0B = t8z.A0B();
        double A0B2 = t8z.A0B();
        double A0B3 = t8z.A0B();
        if (t8z.A0E() == AnonymousClass05K.A0u) {
            d = t8z.A0B();
        } else {
            d = 1.0d;
        }
        if (z) {
            t8z.A0K();
        }
        if (A0B <= 1.0d && A0B2 <= 1.0d && A0B3 <= 1.0d) {
            A0B *= 255.0d;
            A0B2 *= 255.0d;
            A0B3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) A0B, (int) A0B2, (int) A0B3));
    }
}
