package X;

import android.graphics.PointF;

public final class QGQ extends QGW {
    public final int A0B(ST4 st4, float f) {
        Object obj;
        Number number;
        float f2 = f;
        Object obj2 = st4.A0E;
        if (obj2 == null || (obj = st4.A08) == null) {
            throw AnonymousClass7TE.A0z("Missing values for keyframe.");
        }
        SIR sir = this.A03;
        if (sir != null && (number = (Number) sir.A01(obj2, obj, st4.A0A, st4.A07.floatValue(), f2, A05(), this.A02)) != null) {
            return number.intValue();
        }
        int i = st4.A04;
        if (i == 784923401) {
            i = AnonymousClass7TE.A0M(obj2);
            st4.A04 = i;
        }
        int i2 = st4.A03;
        if (i2 == 784923401) {
            i2 = AnonymousClass7TE.A0M(st4.A08);
            st4.A03 = i2;
        }
        PointF pointF = SQL.A00;
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }
}
