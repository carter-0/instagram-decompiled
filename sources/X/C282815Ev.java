package X;

/* renamed from: X.5Ev  reason: invalid class name and case insensitive filesystem */
public final class C282815Ev extends AnonymousClass0T0 {
    public final C282805Eu A00;
    public final C282825Ew A01;
    public final 1Xj A02;
    public final C247273g4 A03;
    public final AnonymousClass3W1 A04;
    public final AnonymousClass47L A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final Integer A0C;
    public final boolean A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C282815Ev) {
                C282815Ev r5 = (C282815Ev) obj;
                if (!0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A06, r5.A06) || this.A09 != r5.A09 || this.A05 != r5.A05 || this.A0D != r5.A0D || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || this.A08 != r5.A08 || this.A0B != r5.A0B || this.A0A != r5.A0A) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.A07.hashCode() * 31;
        String str = this.A06;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        AnonymousClass47L r0 = this.A05;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        int i6 = 1237;
        if (this.A0D) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        C282825Ew r02 = this.A01;
        if (r02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r02.hashCode();
        }
        int i8 = (i7 + hashCode3) * 31;
        Integer num = this.A0C;
        if (num != null) {
            i = num.hashCode();
        }
        int hashCode5 = (((((((((i8 + i) * 31) + this.A00.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31;
        int i9 = 1237;
        if (this.A08) {
            i9 = 1231;
        }
        int i10 = (hashCode5 + i9) * 31;
        int i11 = 1237;
        if (this.A0B) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0A) {
            i13 = 1231;
        }
        return i12 + i13;
    }

    public C282815Ev(C282805Eu r1, C282825Ew r2, 1Xj r3, C247273g4 r4, AnonymousClass3W1 r5, AnonymousClass47L r6, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A07 = str;
        this.A06 = str2;
        this.A09 = z;
        this.A05 = r6;
        this.A0D = z2;
        this.A01 = r2;
        this.A0C = num;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A08 = z3;
        this.A0B = z4;
        this.A0A = z5;
    }
}
