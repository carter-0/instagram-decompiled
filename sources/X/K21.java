package X;

import java.util.List;

public final class K21 extends C63040KqV {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K21) {
                K21 k21 = (K21) obj;
                if (!0qQ.A0K(this.A08, k21.A08) || !0qQ.A0K(this.A07, k21.A07) || !0qQ.A0K(this.A05, k21.A05) || !0qQ.A0K(this.A09, k21.A09) || !0qQ.A0K(this.A01, k21.A01) || !0qQ.A0K(this.A04, k21.A04) || !0qQ.A0K(this.A03, k21.A03) || !0qQ.A0K(this.A02, k21.A02) || !0qQ.A0K(this.A00, k21.A00) || !"appreciation_gift_feed_query_gifters_failure".equals("appreciation_gift_feed_query_gifters_failure") || !0qQ.A0K(this.A06, k21.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A07, AnonymousClass7TE.A0O(this.A08)))) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) - 498760940) * 31 * 31) + C41845B3m.A00(this.A06);
    }

    public K21(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, String str4, List list) {
        this.A08 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A09 = list;
        this.A01 = bool;
        this.A04 = bool2;
        this.A03 = bool3;
        this.A02 = bool4;
        this.A00 = bool5;
        this.A06 = str4;
    }
}
