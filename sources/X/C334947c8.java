package X;

import java.util.List;

/* renamed from: X.7c8  reason: invalid class name and case insensitive filesystem */
public final class C334947c8 extends AnonymousClass0T0 implements C334047aa {
    public final C66920MfE A00;
    public final C61080JwI A01;
    public final C333817aC A02;
    public final C333777a7 A03;
    public final C334027aY A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334947c8) {
                C334947c8 r5 = (C334947c8) obj;
                if (!0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A05, r5.A05) || this.A0G != r5.A0G || this.A0E != r5.A0E || !0qQ.A0K(this.A08, r5.A08) || this.A0F != r5.A0F || this.A0C != r5.A0C || this.A0D != r5.A0D || this.A0H != r5.A0H || !0qQ.A0K(this.A07, r5.A07) || this.A0B != r5.A0B) {
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
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.A09.hashCode() * 31;
        C61080JwI jwI = this.A01;
        int i = 0;
        if (jwI == null) {
            hashCode = 0;
        } else {
            hashCode = jwI.hashCode();
        }
        int hashCode7 = (((((((hashCode6 + hashCode) * 31) + this.A04.hashCode()) * 31) + this.A0A.hashCode()) * 31) + this.A02.hashCode()) * 31;
        C333777a7 r0 = this.A03;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int hashCode8 = (((hashCode7 + hashCode2) * 31) + this.A00.hashCode()) * 31;
        String str = this.A06;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i2 = (hashCode8 + hashCode3) * 31;
        Integer num = this.A05;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i3 = (i2 + hashCode4) * 31;
        int i4 = 1237;
        if (this.A0G) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A0E) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        String str2 = this.A08;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i8 = (i7 + hashCode5) * 31;
        int i9 = 1237;
        if (this.A0F) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0C) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0D) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0H) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        String str3 = this.A07;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i17 = (i16 + i) * 31;
        int i18 = 1237;
        if (this.A0B) {
            i18 = 1231;
        }
        return i17 + i18;
    }

    public C334947c8(C66920MfE mfE, C61080JwI jwI, C333817aC r4, C333777a7 r5, C334027aY r6, Integer num, String str, String str2, String str3, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A09 = list;
        this.A01 = jwI;
        this.A04 = r6;
        this.A0A = list2;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = mfE;
        this.A06 = str;
        this.A05 = num;
        this.A0G = z;
        this.A0E = z2;
        this.A08 = str2;
        this.A0F = z3;
        this.A0C = z4;
        this.A0D = z5;
        this.A0H = z6;
        this.A07 = str3;
        this.A0B = z7;
    }
}
