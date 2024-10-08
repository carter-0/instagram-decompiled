package X;

/* renamed from: X.HsW  reason: case insensitive filesystem */
public final class C56083HsW {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56083HsW) {
                C56083HsW hsW = (C56083HsW) obj;
                if (!(this.A01 == hsW.A01 && this.A00 == hsW.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C56083HsW(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C51975G9x.A1F(A1A, "BorderData(widthDp=");
        A1A.append(", cornerRadiusDp=");
        A1A.append(this.A01);
        A1A.append(C66579MXk.A00(78));
        return C51975G9x.A0j(A1A, this.A00);
    }
}
