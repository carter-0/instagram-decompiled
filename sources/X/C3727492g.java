package X;

/* renamed from: X.92g  reason: invalid class name and case insensitive filesystem */
public final class C3727492g extends AnonymousClass0T0 {
    public final long A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04 = true;

    public C3727492g(long j, boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A03 = z2;
        this.A00 = j;
        this.A02 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3727492g) {
                C3727492g r8 = (C3727492g) obj;
                if (!(this.A01 == r8.A01 && this.A04 == r8.A04 && this.A03 == r8.A03 && this.A00 == r8.A00 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A03) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        long j = this.A00;
        int i7 = (i6 + ((int) (j ^ (j >>> 32)))) * 31;
        int i8 = 1237;
        if (this.A02) {
            i8 = 1231;
        }
        return i7 + i8;
    }
}
