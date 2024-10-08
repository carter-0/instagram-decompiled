package X;

import java.util.List;

/* renamed from: X.7aH  reason: invalid class name and case insensitive filesystem */
public final class C333867aH extends AnonymousClass0T0 {
    public final int A00;
    public final C61081JwJ A01;
    public final C333847aF A02;
    public final C333817aC A03;
    public final Integer A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final C333857aG A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C333867aH) {
                C333867aH r5 = (C333867aH) obj;
                if (!0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A01, r5.A01) || this.A09 != r5.A09 || this.A00 != r5.A00 || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04) || this.A0B != r5.A0B || this.A0A != r5.A0A || this.A08 != r5.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C333867aH A00(C61081JwJ jwJ, C333847aF r17, C333817aC r18, C333867aH r19, List list, List list2, int i, int i2, boolean z, boolean z2) {
        C333857aG r6;
        String str;
        boolean z3;
        boolean z4;
        boolean z5 = z2;
        int i3 = i;
        boolean z6 = z;
        C61081JwJ jwJ2 = jwJ;
        C333847aF r4 = r17;
        C333817aC r5 = r18;
        List list3 = list2;
        List list4 = list;
        Integer num = null;
        int i4 = i2;
        C333867aH r1 = r19;
        if ((i2 & 1) != 0) {
            list4 = r1.A06;
        }
        if ((i2 & 2) != 0) {
            list3 = r1.A07;
        }
        if ((i2 & 4) != 0) {
            r5 = r1.A03;
        }
        if ((i2 & 8) != 0) {
            r4 = r1.A02;
        }
        if ((i2 & 16) != 0) {
            r6 = r1.A0C;
        } else {
            r6 = null;
        }
        if ((i2 & 32) != 0) {
            jwJ2 = r1.A01;
        }
        if ((i2 & 64) != 0) {
            z6 = r1.A09;
        }
        if ((i4 & 128) != 0) {
            i3 = r1.A00;
        }
        if ((i4 & 256) != 0) {
            str = r1.A05;
        } else {
            str = null;
        }
        if ((i4 & 512) != 0) {
            num = r1.A04;
        }
        if ((i4 & 1024) != 0) {
            z3 = r1.A0B;
        } else {
            z3 = false;
        }
        if ((i4 & C249703kE.FLAG_MOVED) != 0) {
            z4 = r1.A0A;
        } else {
            z4 = false;
        }
        if ((i4 & 4096) != 0) {
            z5 = r1.A08;
        }
        0qQ.A0B(list4, 0);
        0qQ.A0B(list3, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(r4, 3);
        0qQ.A0B(r6, 4);
        return new C333867aH(jwJ2, r4, r5, r6, num, str, list4, list3, i3, z6, z3, z4, z5);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((((this.A06.hashCode() * 31) + this.A07.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A0C.hashCode()) * 31;
        C61081JwJ jwJ = this.A01;
        int i = 0;
        if (jwJ == null) {
            hashCode = 0;
        } else {
            hashCode = jwJ.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int i4 = (((i2 + i3) * 31) + this.A00) * 31;
        String str = this.A05;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        Integer num = this.A04;
        if (num != null) {
            i = num.hashCode();
        }
        int i6 = (i5 + i) * 31;
        int i7 = 1237;
        if (this.A0B) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0A) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A08) {
            i11 = 1231;
        }
        return i10 + i11;
    }

    public C333867aH(C61081JwJ jwJ, C333847aF r2, C333817aC r3, C333857aG r4, Integer num, String str, List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = list;
        this.A07 = list2;
        this.A03 = r3;
        this.A02 = r2;
        this.A0C = r4;
        this.A01 = jwJ;
        this.A09 = z;
        this.A00 = i;
        this.A05 = str;
        this.A04 = num;
        this.A0B = z2;
        this.A0A = z3;
        this.A08 = z4;
    }
}
