package X;

/* renamed from: X.GZy  reason: case insensitive filesystem */
public final class C52624GZy implements JS2 {
    public final GZF A00;
    public final AnonymousClass5b9 A01;
    public final JS2 A02;

    public final float AF7(float f, float f2, float f3) {
        float AF7 = this.A02.AF7(f, f2, f3);
        if (AF7 == 0.0f) {
            GZF gzf = this.A00;
            int i = gzf.A03;
            if (i == 0) {
                return 0.0f;
            }
            float f4 = ((float) i) * -1.0f;
            if (C51971G9r.A1W(gzf.A0T)) {
                f4 += (float) gzf.A05();
            }
            return C229632nm.A02(f4, -f3, f3);
        }
        GZF gzf2 = this.A00;
        float f5 = ((float) gzf2.A03) * -1.0f;
        while (AF7 > 0.0f && f5 < AF7) {
            f5 += (float) gzf2.A05();
        }
        while (AF7 < 0.0f && f5 > AF7) {
            f5 -= (float) gzf2.A05();
        }
        return f5;
    }

    public final AnonymousClass5b9 Bq4() {
        return this.A01;
    }

    public C52624GZy(JS2 js2, GZF gzf) {
        this.A00 = gzf;
        this.A02 = js2;
        this.A01 = js2.Bq4();
    }
}
