package X;

/* renamed from: X.3eg  reason: invalid class name and case insensitive filesystem */
public final class C246483eg extends AnonymousClass0T0 {
    public final long A00;
    public final long A01;
    public final AnonymousClass3WR A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C246483eg) {
                C246483eg r8 = (C246483eg) obj;
                if (!(this.A04 == r8.A04 && this.A01 == r8.A01 && this.A00 == r8.A00 && 0qQ.A0K(this.A02, r8.A02) && this.A03 == r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        long j = this.A01;
        long j2 = this.A00;
        int i2 = ((((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        AnonymousClass3WR r0 = this.A02;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i3 = (i2 + hashCode) * 31;
        int i4 = 1237;
        if (this.A03) {
            i4 = 1231;
        }
        return i3 + i4;
    }

    public C246483eg(AnonymousClass3WR r1, long j, long j2, boolean z, boolean z2) {
        this.A04 = z;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = r1;
        this.A03 = z2;
    }
}
