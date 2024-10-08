package X;

import java.util.List;

/* renamed from: X.4LN  reason: invalid class name */
public final class AnonymousClass4LN extends AnonymousClass0T0 {
    public static final AnonymousClass4LN A0D = new AnonymousClass4LN((Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0sn.A00, false, false, false, false);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public AnonymousClass4LN(Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(list, 1);
        this.A08 = list;
        this.A03 = str;
        this.A0B = z;
        this.A00 = num;
        this.A01 = num2;
        this.A0C = z2;
        this.A02 = num3;
        this.A07 = str2;
        this.A0A = z3;
        this.A09 = z4;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4LN) {
                AnonymousClass4LN r5 = (AnonymousClass4LN) obj;
                if (!0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A03, r5.A03) || this.A0B != r5.A0B || this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01) || this.A0C != r5.A0C || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A07, r5.A07) || this.A0A != r5.A0A || this.A09 != r5.A09 || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06)) {
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
        int hashCode8 = this.A08.hashCode() * 31;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode8 + hashCode) * 31;
        int i3 = 1237;
        if (this.A0B) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        Integer num = this.A00;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = AnonymousClass93b.A01(num).hashCode() + num.intValue();
        }
        int i5 = (i4 + hashCode2) * 31;
        Integer num2 = this.A01;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        int i7 = 1237;
        if (this.A0C) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        Integer num3 = this.A02;
        if (num3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num3.hashCode();
        }
        int i9 = (i8 + hashCode4) * 31;
        String str2 = this.A07;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i10 = (i9 + hashCode5) * 31;
        int i11 = 1237;
        if (this.A0A) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A09) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        String str3 = this.A04;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str4 = this.A05;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int A002 = (((i15 + hashCode7) * 31) + C54732HQn.A00()) * 31;
        String str5 = this.A06;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return A002 + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("AdRequestContext(organicIds=");
        sb.append(this.A08);
        sb.append(", analyticsModule=");
        sb.append(this.A03);
        sb.append(AnonymousClass000.A00(2027));
        sb.append(this.A0B);
        sb.append(AnonymousClass000.A00(841));
        Integer num = this.A00;
        if (num != null) {
            str = AnonymousClass93b.A01(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", existingItemsCount=");
        sb.append(this.A01);
        sb.append(", isFallbackAdsRequest=");
        sb.append(this.A0C);
        sb.append(", positionOffset=");
        sb.append(this.A02);
        sb.append(", responseModule=");
        sb.append(this.A07);
        sb.append(", isJpcEnabled=");
        sb.append(this.A0A);
        sb.append(AnonymousClass000.A00(2024));
        sb.append(this.A09);
        sb.append(", cacheKey=");
        sb.append(this.A04);
        sb.append(", cachePolicy=");
        sb.append(this.A05);
        sb.append(", isSelfPog=");
        sb.append(false);
        sb.append(", pageToken=");
        sb.append(this.A06);
        sb.append(')');
        return sb.toString();
    }
}
