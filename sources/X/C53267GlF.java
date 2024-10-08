package X;

/* renamed from: X.GlF  reason: case insensitive filesystem */
public final class C53267GlF extends AnonymousClass0T0 {
    public final float A00;
    public final C61084JwM A01;
    public final C246953fX A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53267GlF) {
                C53267GlF glF = (C53267GlF) obj;
                if (Float.compare(this.A00, glF.A00) != 0 || !0qQ.A0K(this.A02, glF.A02) || !0qQ.A0K(this.A01, glF.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A02, G9w.A00(this.A00)));
    }

    public C53267GlF(C61084JwM jwM, C246953fX r2, float f) {
        this.A00 = f;
        this.A02 = r2;
        this.A01 = jwM;
    }
}
