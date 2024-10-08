package X;

import android.graphics.PointF;

/* renamed from: X.Sh8  reason: case insensitive filesystem */
public final class C11822Sh8 implements C13520Tbp {
    public static final C11822Sh8 A00 = new Object();

    public final /* bridge */ /* synthetic */ Object E1k(C12828T8z t8z, float f) {
        Integer A0E = t8z.A0E();
        if (A0E == AnonymousClass05K.A00 || A0E == AnonymousClass05K.A0C) {
            return C11400SRv.A02(t8z, f);
        }
        if (A0E == AnonymousClass05K.A0u) {
            PointF pointF = new PointF(Pxh.A02(t8z) * f, Pxh.A02(t8z) * f);
            while (t8z.A0Q()) {
                t8z.A0N();
            }
            return pointF;
        }
        throw AnonymousClass7TF.A0W("Cannot convert json to point. Next token is ", RSN.A00(A0E));
    }
}
