package X;

import java.util.List;

public final class BGT extends AnonymousClass0T0 implements G90 {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;

    public BGT(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2) {
        0qQ.A0B(str2, 3);
        AnonymousClass7TG.A1R(list2, str3);
        0qQ.A0B(str6, 9);
        this.A08 = list;
        this.A03 = str;
        this.A02 = str2;
        this.A09 = list2;
        this.A04 = str3;
        this.A00 = bool;
        this.A05 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGT) {
                BGT bgt = (BGT) obj;
                if (!0qQ.A0K(this.A08, bgt.A08) || !0qQ.A0K(this.A03, bgt.A03) || !0qQ.A0K(this.A02, bgt.A02) || !0qQ.A0K(this.A09, bgt.A09) || !0qQ.A0K(this.A04, bgt.A04) || !0qQ.A0K(this.A00, bgt.A00) || !0qQ.A0K(this.A05, bgt.A05) || !0qQ.A0K(this.A06, bgt.A06) || !0qQ.A0K(this.A07, bgt.A07) || !0qQ.A0K(this.A01, bgt.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List B3c() {
        return this.A09;
    }

    public final String B9u() {
        return this.A04;
    }

    public final Boolean BvU() {
        return this.A00;
    }

    public final String C2b() {
        return this.A06;
    }

    public final Integer CCi() {
        return this.A01;
    }

    public final String CHh() {
        return this.A02;
    }

    public final String getCategory() {
        return this.A03;
    }

    public final String getSubtitle() {
        return this.A05;
    }

    public final String getTitle() {
        return this.A07;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A08(this.A02, ((AnonymousClass7TG.A0C(this.A08) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31));
        return AnonymousClass7TF.A08(this.A07, (((((AnonymousClass7TF.A08(this.A04, A072) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public final G90 E8C(1E9 r1) {
        return this;
    }
}
