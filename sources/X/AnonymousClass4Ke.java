package X;

/* renamed from: X.4Ke  reason: invalid class name */
public final class AnonymousClass4Ke extends AnonymousClass0T0 {
    public final int A00;
    public final C376489Ie A01;
    public final C67061rp A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public AnonymousClass4Ke(C376489Ie r2, C67061rp r3, String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i;
        this.A0B = z;
        this.A07 = z2;
        this.A0A = z3;
        this.A0D = z4;
        this.A0C = z5;
        this.A09 = z6;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = z7;
        this.A06 = z8;
        this.A08 = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4Ke) {
                AnonymousClass4Ke r5 = (AnonymousClass4Ke) obj;
                if (!(0qQ.A0K(this.A03, r5.A03) && 0qQ.A0K(this.A04, r5.A04) && this.A00 == r5.A00 && this.A0B == r5.A0B && this.A07 == r5.A07 && this.A0A == r5.A0A && this.A0D == r5.A0D && this.A0C == r5.A0C && this.A09 == r5.A09 && 0qQ.A0K(this.A02, r5.A02) && 0qQ.A0K(this.A01, r5.A01) && this.A05 == r5.A05 && this.A06 == r5.A06 && this.A08 == r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A0B) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A07) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0A) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0D) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0C) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A09) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        C67061rp r0 = this.A02;
        int i13 = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i14 = (i12 + hashCode) * 31;
        C376489Ie r02 = this.A01;
        if (r02 != null) {
            i13 = r02.hashCode();
        }
        int i15 = (i14 + i13) * 31;
        int i16 = 1237;
        if (this.A05) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        int i18 = 1237;
        if (this.A06) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        int i20 = 1237;
        if (this.A08) {
            i20 = 1231;
        }
        return i19 + i20;
    }
}
