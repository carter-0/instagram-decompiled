package X;

/* renamed from: X.Ga3  reason: case insensitive filesystem */
public final class C52629Ga3 implements JS2 {
    public final AnonymousClass5b9 A00 = GQC.A01(new C7227Pzw(0.25f, 0.1f, 0.25f, 1.0f), 125, 0);

    public final float AF7(float f, float f2, float f3) {
        float A002 = AnonymousClass7TE.A00(f2 + f, f);
        float f4 = (0.3f * f3) - (0.0f * A002);
        float f5 = f3 - f4;
        if (Dba.A1U((A002 > f3 ? 1 : (A002 == f3 ? 0 : -1))) && f5 < A002) {
            f4 = f3 - A002;
        }
        return f - f4;
    }

    public final AnonymousClass5b9 Bq4() {
        return this.A00;
    }
}
