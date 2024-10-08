package X;

/* renamed from: X.3a0  reason: invalid class name and case insensitive filesystem */
public final class C243733a0 extends AnonymousClass0T0 {
    public final long A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C243733a0) {
                C243733a0 r8 = (C243733a0) obj;
                if (!(this.A02 == r8.A02 && this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        long j = this.A00;
        return i4 + ((int) (j ^ (j >>> 32)));
    }

    public C243733a0(long j, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = j;
    }
}
