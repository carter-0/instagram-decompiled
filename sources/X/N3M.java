package X;

import java.util.List;

public final class N3M extends AnonymousClass0T0 {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;
    public final boolean A0D;

    public N3M(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, List list3, boolean z) {
        0qQ.A0B(str3, 4);
        this.A0D = z;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A00 = bool;
        this.A0A = list;
        this.A07 = str6;
        this.A01 = num;
        this.A0B = list2;
        this.A0C = list3;
        this.A08 = str7;
        this.A09 = str8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3M) {
                N3M n3m = (N3M) obj;
                if (this.A0D != n3m.A0D || !0qQ.A0K(this.A02, n3m.A02) || !0qQ.A0K(this.A03, n3m.A03) || !0qQ.A0K(this.A04, n3m.A04) || !0qQ.A0K(this.A05, n3m.A05) || !0qQ.A0K(this.A06, n3m.A06) || !0qQ.A0K(this.A00, n3m.A00) || !0qQ.A0K(this.A0A, n3m.A0A) || !0qQ.A0K(this.A07, n3m.A07) || !0qQ.A0K(this.A01, n3m.A01) || !0qQ.A0K(this.A0B, n3m.A0B) || !0qQ.A0K(this.A0C, n3m.A0C) || !0qQ.A0K(this.A08, n3m.A08) || !0qQ.A0K(this.A09, n3m.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((AnonymousClass7TF.A08(this.A04, (((C51965G9l.A05(this.A0D) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + C41845B3m.A00(this.A09);
    }
}
