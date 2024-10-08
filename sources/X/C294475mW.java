package X;

/* renamed from: X.5mW  reason: invalid class name and case insensitive filesystem */
public final class C294475mW extends AnonymousClass0T0 implements C294485mX {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C294475mW) {
                C294475mW r5 = (C294475mW) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A02) {
            i5 = 1231;
        }
        return i4 + i5;
    }

    public C294475mW(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }
}
