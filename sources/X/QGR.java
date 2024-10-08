package X;

public final class QGR extends QGW {
    public final float A0B() {
        return A0C(this.A06.Au7(), A04());
    }

    public final float A0C(ST4 st4, float f) {
        Object obj;
        Number number;
        Object obj2 = st4.A0E;
        if (obj2 == null || (obj = st4.A08) == null) {
            throw AnonymousClass7TE.A0z("Missing values for keyframe.");
        }
        SIR sir = this.A03;
        float f2 = f;
        if (sir != null && (number = (Number) sir.A01(obj2, obj, st4.A0A, st4.A07.floatValue(), f2, A05(), this.A02)) != null) {
            return number.floatValue();
        }
        float f3 = st4.A02;
        if (f3 == -3987645.8f) {
            f3 = AnonymousClass7TE.A04(obj2);
            st4.A02 = f3;
        }
        float f4 = st4.A00;
        if (f4 == -3987645.8f) {
            f4 = AnonymousClass7TE.A04(st4.A08);
            st4.A00 = f4;
        }
        return Pxh.A00(f4, f3, f);
    }
}
