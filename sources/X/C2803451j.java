package X;

/* renamed from: X.51j  reason: invalid class name and case insensitive filesystem */
public final class C2803451j extends AnonymousClass0T0 {
    public final 1Xj A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final String A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2803451j) {
                C2803451j r5 = (C2803451j) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || this.A09 != r5.A09 || this.A0A != r5.A0A || !0qQ.A0K(this.A0F, r5.A0F) || this.A0E != r5.A0E || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A01, r5.A01) || this.A0D != r5.A0D || this.A0C != r5.A0C || this.A0B != r5.A0B || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || this.A08 != r5.A08) {
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
        int hashCode4 = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A09) {
            i = 1231;
        }
        int i2 = (hashCode4 + i) * 31;
        int i3 = 1237;
        if (this.A0A) {
            i3 = 1231;
        }
        int hashCode5 = (((i2 + i3) * 31) + this.A0F.hashCode()) * 31;
        int i4 = 1237;
        if (this.A0E) {
            i4 = 1231;
        }
        int hashCode6 = (((hashCode5 + i4) * 31) + this.A07.hashCode()) * 31;
        String str = this.A06;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i6 = (hashCode6 + hashCode) * 31;
        String str2 = this.A05;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i7 = (i6 + hashCode2) * 31;
        Boolean bool = this.A01;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i8 = (i7 + hashCode3) * 31;
        int i9 = 1237;
        if (this.A0D) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0C) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0B) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        String str3 = this.A02;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        int hashCode7 = (((((i14 + i5) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31;
        int i15 = 1237;
        if (this.A08) {
            i15 = 1231;
        }
        return hashCode7 + i15;
    }

    public C2803451j(1Xj r2, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A00 = r2;
        this.A09 = z;
        this.A0A = z2;
        this.A0F = str;
        this.A0E = z3;
        this.A07 = str2;
        this.A06 = str3;
        this.A05 = str4;
        this.A01 = bool;
        this.A0D = z4;
        this.A0C = z5;
        this.A0B = z6;
        this.A02 = str5;
        this.A04 = str6;
        this.A03 = str7;
        this.A08 = z7;
    }
}
