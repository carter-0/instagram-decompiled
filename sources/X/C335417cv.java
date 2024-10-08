package X;

import java.util.List;

/* renamed from: X.7cv  reason: invalid class name and case insensitive filesystem */
public final class C335417cv extends AnonymousClass0T0 implements C334067ac {
    public final C335377cr A00;
    public final C335397ct A01;
    public final C317966o8 A02;
    public final 1Xl A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final String A0I;

    public C335417cv(C335377cr r2, C335397ct r3, C317966o8 r4, 1Xl r5, Integer num, String str, String str2, String str3, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        0qQ.A0B(list, 3);
        this.A0D = z;
        this.A0G = z2;
        this.A07 = list;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = str;
        this.A08 = list2;
        this.A0A = z3;
        this.A0H = z4;
        this.A09 = z5;
        this.A0C = z6;
        this.A03 = r5;
        this.A0I = str2;
        this.A04 = num;
        this.A0E = z7;
        this.A06 = str3;
        this.A0F = z8;
        this.A02 = r4;
        this.A0B = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C335417cv) {
                C335417cv r5 = (C335417cv) obj;
                if (this.A0D != r5.A0D || this.A0G != r5.A0G || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A08, r5.A08) || this.A0A != r5.A0A || this.A0H != r5.A0H || this.A09 != r5.A09 || this.A0C != r5.A0C || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A0I, r5.A0I) || !0qQ.A0K(this.A04, r5.A04) || this.A0E != r5.A0E || !0qQ.A0K(this.A06, r5.A06) || this.A0F != r5.A0F || !0qQ.A0K(this.A02, r5.A02) || this.A0B != r5.A0B) {
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
        int hashCode6;
        int hashCode7;
        int i = 1237;
        if (this.A0D) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A0G) {
            i3 = 1231;
        }
        int hashCode8 = (((i2 + i3) * 31) + this.A07.hashCode()) * 31;
        C335377cr r0 = this.A00;
        int i4 = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i5 = (hashCode8 + hashCode) * 31;
        C335397ct r02 = this.A01;
        if (r02 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r02.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        String str = this.A05;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int hashCode9 = (((i6 + hashCode3) * 31) + this.A08.hashCode()) * 31;
        int i7 = 1237;
        if (this.A0A) {
            i7 = 1231;
        }
        int i8 = (hashCode9 + i7) * 31;
        int i9 = 1237;
        if (this.A0H) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A09) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0C) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        1Xl r03 = this.A03;
        if (r03 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r03.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str2 = this.A0I;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        Integer num = this.A04;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        int i18 = 1237;
        if (this.A0E) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        String str3 = this.A06;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i20 = (i19 + hashCode7) * 31;
        int i21 = 1237;
        if (this.A0F) {
            i21 = 1231;
        }
        int i22 = (i20 + i21) * 31;
        C317966o8 r04 = this.A02;
        if (r04 != null) {
            i4 = r04.hashCode();
        }
        int i23 = (i22 + i4) * 31;
        int i24 = 1237;
        if (this.A0B) {
            i24 = 1231;
        }
        return i23 + i24;
    }
}
