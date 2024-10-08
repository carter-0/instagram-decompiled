package X;

/* renamed from: X.Gpi  reason: case insensitive filesystem */
public final class C53512Gpi extends AnonymousClass0T0 implements C59486JLk {
    public final float A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53512Gpi) {
                C53512Gpi gpi = (C53512Gpi) obj;
                if (this.A01 != gpi.A01 || !C289095d0.A01(this.A00, gpi.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51966G9m.A02(this.A01 * 31, this.A00);
    }

    public C53512Gpi(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }
}
