package X;

/* renamed from: X.7zi  reason: invalid class name and case insensitive filesystem */
public final class C349177zi extends AnonymousClass0T0 {
    public final long A00;
    public final C359218cI A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C349177zi(C359218cI r2, Integer num, String str, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A00 = j;
        this.A03 = str;
        this.A02 = num;
        this.A04 = z;
        this.A08 = z2;
        this.A06 = z3;
        this.A05 = z4;
        this.A07 = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C349177zi) {
                C349177zi r8 = (C349177zi) obj;
                if (!(0qQ.A0K(this.A01, r8.A01) && this.A00 == r8.A00 && 0qQ.A0K(this.A03, r8.A03) && 0qQ.A0K(this.A02, r8.A02) && this.A04 == r8.A04 && this.A08 == r8.A08 && this.A06 == r8.A06 && this.A05 == r8.A05 && this.A07 == r8.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        int hashCode2 = ((this.A01.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Integer num = this.A02;
        if (num != null) {
            i = num.hashCode();
        }
        int i3 = (i2 + i) * 31;
        int i4 = 1237;
        if (this.A04) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A08) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A06) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A05) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A07) {
            i12 = 1231;
        }
        return i11 + i12;
    }
}
