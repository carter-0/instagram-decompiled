package X;

/* renamed from: X.Gmd  reason: case insensitive filesystem */
public final class C53353Gmd extends AnonymousClass0T0 {
    public static final C53353Gmd A02 = new C53353Gmd(32.0f, 16.0f);
    public static final C53353Gmd A03 = new C53353Gmd(14.0f, 8.0f);
    public static final C53353Gmd A04 = new C53353Gmd(26.0f, 12.0f);
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53353Gmd) {
                C53353Gmd gmd = (C53353Gmd) obj;
                if (!C289095d0.A01(this.A01, gmd.A01) || !C289095d0.A01(this.A00, gmd.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51966G9m.A02(G9w.A00(this.A01), this.A00);
    }

    public C53353Gmd(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
