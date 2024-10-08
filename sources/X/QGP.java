package X;

import android.graphics.PointF;

public final class QGP extends QGW {
    public final int A0B(ST4 st4, float f) {
        Object obj;
        Float f2;
        Number number;
        Object obj2 = st4.A0E;
        if (obj2 == null || (obj = st4.A08) == null) {
            throw AnonymousClass7TE.A0z("Missing values for keyframe.");
        }
        SIR sir = this.A03;
        float f3 = f;
        if (sir != null && (f2 = st4.A07) != null && (number = (Number) sir.A01(obj2, obj, st4.A0A, f2.floatValue(), f3, A05(), this.A02)) != null) {
            return number.intValue();
        }
        PointF pointF = SQL.A00;
        return SKD.A02(Pxi.A01(1.0f, f, 0.0f), AnonymousClass7TE.A0M(obj2), AnonymousClass7TE.A0M(st4.A08));
    }
}
