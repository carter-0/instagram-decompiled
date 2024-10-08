package X;

/* renamed from: X.JtY  reason: case insensitive filesystem */
public final class C60914JtY extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final long A02;

    public C60914JtY(int i, long j, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = j;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C60914JtY)) {
                return false;
            }
            C60914JtY jtY = (C60914JtY) obj;
            if (jtY.A00 == 1 && this.A01 == jtY.A01 && this.A02 == jtY.A02) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C60914JtY)) {
                return false;
            }
            C60914JtY jtY2 = (C60914JtY) obj;
            if (jtY2.A00 == 0 && this.A02 == jtY2.A02 && this.A01 == jtY2.A01) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = this.A01 * 31;
            i = C51968G9o.A03(this.A02);
        } else {
            A03 = C51975G9x.A03(this.A02);
            i = this.A01;
        }
        return A03 + i;
    }
}
