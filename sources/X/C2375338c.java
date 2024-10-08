package X;

/* renamed from: X.38c  reason: invalid class name and case insensitive filesystem */
public final class C2375338c extends AnonymousClass0T0 {
    public final Long A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final Long A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2375338c) {
                C2375338c r5 = (C2375338c) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A04 == r5.A04 && 0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A00, r5.A00) && this.A05 == r5.A05)) {
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
        if (this.A01) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A02) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A04) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        Long l = this.A06;
        int i9 = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i10 = (i8 + hashCode) * 31;
        Long l2 = this.A00;
        if (l2 != null) {
            i9 = l2.hashCode();
        }
        int i11 = (i10 + i9) * 31;
        int i12 = 1237;
        if (this.A05) {
            i12 = 1231;
        }
        return i11 + i12;
    }

    public C2375338c(Long l, Long l2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = z;
        this.A03 = z2;
        this.A02 = z3;
        this.A04 = z4;
        this.A06 = l;
        this.A00 = l2;
        this.A05 = z5;
    }

    public C2375338c() {
        this((Long) null, (Long) null, false, true, false, true, true);
    }
}
