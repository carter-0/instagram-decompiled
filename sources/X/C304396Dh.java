package X;

/* renamed from: X.6Dh  reason: invalid class name and case insensitive filesystem */
public final class C304396Dh extends C267794cD implements C268434dO {
    public C304836Fk A00;

    public final /* synthetic */ int CmX(C268084cj r2, C268014cc r3, int i) {
        return GR6.A00(r2, r3, this, i);
    }

    public final /* synthetic */ int Cma(C268084cj r2, C268014cc r3, int i) {
        return GR6.A01(r2, r3, this, i);
    }

    public final /* synthetic */ int CoQ(C268084cj r2, C268014cc r3, int i) {
        return GR6.A02(r2, r3, this, i);
    }

    public final /* synthetic */ int CoT(C268084cj r2, C268014cc r3, int i) {
        return GR6.A03(r2, r3, this, i);
    }

    public final C289145d6 Cny(C268074ci r8, C268004cb r9, long j) {
        float f;
        float f2;
        C304836Fk r6 = this.A00;
        AnonymousClass5Q8 layoutDirection = r9.getLayoutDirection();
        C304826Fj r62 = (C304826Fj) r6;
        AnonymousClass5Q8 r1 = AnonymousClass5Q8.Ltr;
        if (layoutDirection == r1) {
            f = r62.A02;
        } else {
            f = r62.A01;
        }
        if (Float.compare(f, 0.0f) >= 0) {
            float f3 = r62.A03;
            if (Float.compare(f3, 0.0f) >= 0) {
                if (layoutDirection == r1) {
                    f2 = r62.A01;
                } else {
                    f2 = r62.A02;
                }
                if (Float.compare(f2, 0.0f) >= 0) {
                    float f4 = r62.A00;
                    if (Float.compare(f4, 0.0f) >= 0) {
                        int EJS = r9.EJS(f) + r9.EJS(f2);
                        int EJS2 = r9.EJS(f3) + r9.EJS(f4);
                        C267974cY Cnz = r8.Cnz(AnonymousClass5SF.A06(j, -EJS, -EJS2));
                        int A03 = AnonymousClass5SF.A03(j, Cnz.A01 + EJS);
                        int A02 = AnonymousClass5SF.A02(j, Cnz.A00 + EJS2);
                        return r9.Cfi(0Yt.A0E(), new AnonymousClass9MC(2, this, Cnz, r9), A03, A02);
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
