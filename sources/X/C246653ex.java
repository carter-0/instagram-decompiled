package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.3ex  reason: invalid class name and case insensitive filesystem */
public final class C246653ex extends AnonymousClass0T0 {
    public final int A00;
    public final AnonymousClass4Jg A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C246653ex(AnonymousClass4Jg r2, Integer num, Integer num2, Integer num3, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(num, 6);
        this.A01 = r2;
        this.A06 = str;
        this.A05 = str2;
        this.A08 = z;
        this.A07 = str3;
        this.A03 = num;
        this.A09 = z2;
        this.A02 = num2;
        this.A04 = num3;
        this.A00 = i;
        this.A0B = z3;
        this.A0A = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C246653ex) {
                C246653ex r5 = (C246653ex) obj;
                if (!(0qQ.A0K(this.A01, r5.A01) && 0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A05, r5.A05) && this.A08 == r5.A08 && 0qQ.A0K(this.A07, r5.A07) && this.A03 == r5.A03 && this.A09 == r5.A09 && this.A02 == r5.A02 && this.A04 == r5.A04 && this.A00 == r5.A00 && this.A0B == r5.A0B && this.A0A == r5.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str;
        String str2;
        String str3;
        int hashCode2 = ((this.A01.hashCode() * 31) + this.A06.hashCode()) * 31;
        String str4 = this.A05;
        int i = 0;
        if (str4 == null) {
            hashCode = 0;
        } else {
            hashCode = str4.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        int i3 = 1237;
        if (this.A08) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        String str5 = this.A07;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i5 = (i4 + i) * 31;
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "VERTICAL_LAYOUT";
                break;
            case 2:
                str = "STAGGERED_HORIZONTAL_LAYOUT";
                break;
            case 3:
                str = "STRAIGHT_HORIZONTAL_LAYOUT";
                break;
            default:
                str = "SHORT_POST_SINGLE_BUBBLE";
                break;
        }
        int hashCode3 = (i5 + str.hashCode() + intValue) * 31;
        int i6 = 1237;
        if (this.A09) {
            i6 = 1231;
        }
        int i7 = (hashCode3 + i6) * 31;
        int intValue2 = this.A02.intValue();
        if (1 != intValue2) {
            str2 = AnonymousClass000.A00(2129);
        } else {
            str2 = "SOCIAL_CONTEXT";
        }
        int hashCode4 = (i7 + str2.hashCode() + intValue2) * 31;
        int intValue3 = this.A04.intValue();
        switch (intValue3) {
            case 1:
                str3 = "COMMENTS_ONLY";
                break;
            case 2:
                str3 = "MIX_CONTEXT_TYPE";
                break;
            case 3:
                str3 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str3 = "LIKES_ONLY";
                break;
        }
        int hashCode5 = (((hashCode4 + str3.hashCode() + intValue3) * 31) + this.A00) * 31;
        int i8 = 1237;
        if (this.A0B) {
            i8 = 1231;
        }
        int i9 = (hashCode5 + i8) * 31;
        int i10 = 1237;
        if (this.A0A) {
            i10 = 1231;
        }
        return i9 + i10;
    }
}
