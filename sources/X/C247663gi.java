package X;

/* renamed from: X.3gi  reason: invalid class name and case insensitive filesystem */
public final class C247663gi extends AnonymousClass0T0 {
    public final C247653gh A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C247663gi) {
                C247663gi r5 = (C247663gi) obj;
                if (!(0qQ.A0K(this.A01, r5.A01) && this.A07 == r5.A07 && this.A04 == r5.A04 && this.A09 == r5.A09 && this.A0A == r5.A0A && this.A05 == r5.A05 && this.A03 == r5.A03 && this.A08 == r5.A08 && this.A06 == r5.A06 && 0qQ.A0K(this.A00, r5.A00) && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A09) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0A) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A05) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A03) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A08) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A06) {
            i15 = 1231;
        }
        int hashCode2 = (((i14 + i15) * 31) + this.A00.hashCode()) * 31;
        int i16 = 1237;
        if (this.A02) {
            i16 = 1231;
        }
        return hashCode2 + i16;
    }

    public C247663gi(C247653gh r1, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A01 = str;
        this.A07 = z;
        this.A04 = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A05 = z5;
        this.A03 = z6;
        this.A08 = z7;
        this.A06 = z8;
        this.A00 = r1;
        this.A02 = z9;
    }
}
