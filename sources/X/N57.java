package X;

import com.instagram.api.schemas.BoostedActionStatus;

public final class N57 extends AnonymousClass0T0 implements C74519PwE {
    public final BoostedActionStatus A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N57) {
                N57 n57 = (N57) obj;
                if (this.A00 != n57.A00 || !0qQ.A0K(this.A0E, n57.A0E) || !0qQ.A0K(this.A01, n57.A01) || !0qQ.A0K(this.A02, n57.A02) || !0qQ.A0K(this.A0B, n57.A0B) || !0qQ.A0K(this.A03, n57.A03) || !0qQ.A0K(this.A04, n57.A04) || !0qQ.A0K(this.A05, n57.A05) || !0qQ.A0K(this.A0C, n57.A0C) || !0qQ.A0K(this.A06, n57.A06) || !0qQ.A0K(this.A07, n57.A07) || !0qQ.A0K(this.A0D, n57.A0D) || !0qQ.A0K(this.A08, n57.A08) || !0qQ.A0K(this.A09, n57.A09) || !0qQ.A0K(this.A0A, n57.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A0E)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TE.A0L(this.A0A);
    }

    public N57(BoostedActionStatus boostedActionStatus, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str, String str2, String str3, String str4) {
        this.A00 = boostedActionStatus;
        this.A0E = str;
        this.A01 = num;
        this.A02 = num2;
        this.A0B = str2;
        this.A03 = num3;
        this.A04 = num4;
        this.A05 = num5;
        this.A0C = str3;
        this.A06 = num6;
        this.A07 = num7;
        this.A0D = str4;
        this.A08 = num8;
        this.A09 = num9;
        this.A0A = num10;
    }
}
