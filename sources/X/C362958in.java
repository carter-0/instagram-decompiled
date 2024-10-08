package X;

/* renamed from: X.8in  reason: invalid class name and case insensitive filesystem */
public final class C362958in extends AnonymousClass0T0 {
    public final Integer A00;
    public final Integer A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C362958in) {
                C362958in r5 = (C362958in) obj;
                if (!(this.A06 == r5.A06 && this.A03 == r5.A03 && this.A08 == r5.A08 && 0qQ.A0K(this.A00, r5.A00) && 0qQ.A0K(this.A01, r5.A01) && this.A02 == r5.A02 && this.A05 == r5.A05 && this.A07 == r5.A07 && this.A04 == r5.A04)) {
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
        if (this.A06) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A08) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        Integer num = this.A00;
        int i7 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i8 = (i6 + hashCode) * 31;
        Integer num2 = this.A01;
        if (num2 != null) {
            i7 = num2.hashCode();
        }
        int i9 = (i8 + i7) * 31;
        int i10 = 1237;
        if (this.A02) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A05) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        int i14 = 1237;
        if (this.A07) {
            i14 = 1231;
        }
        int i15 = (i13 + i14) * 31;
        int i16 = 1237;
        if (this.A04) {
            i16 = 1231;
        }
        return i15 + i16;
    }

    public C362958in(Integer num, Integer num2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A06 = z;
        this.A03 = z2;
        this.A08 = z3;
        this.A00 = num;
        this.A01 = num2;
        this.A02 = z4;
        this.A05 = z5;
        this.A07 = z6;
        this.A04 = z7;
    }
}
