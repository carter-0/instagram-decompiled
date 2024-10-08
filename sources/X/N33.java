package X;

import java.util.List;

public final class N33 extends AnonymousClass0T0 {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N33) {
                N33 n33 = (N33) obj;
                if (!0qQ.A0K(this.A07, n33.A07) || !0qQ.A0K(this.A00, n33.A00) || !0qQ.A0K(this.A02, n33.A02) || !0qQ.A0K(this.A03, n33.A03) || !0qQ.A0K(this.A04, n33.A04) || !0qQ.A0K(this.A05, n33.A05) || !0qQ.A0K(this.A06, n33.A06) || !0qQ.A0K(this.A01, n33.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0C(this.A07) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public N33(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list) {
        this.A07 = list;
        this.A00 = num;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A01 = num2;
    }
}
