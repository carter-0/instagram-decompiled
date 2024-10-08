package X;

import java.util.List;

/* renamed from: X.Glw  reason: case insensitive filesystem */
public final class C53310Glw extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53310Glw) {
                C53310Glw glw = (C53310Glw) obj;
                if (!0qQ.A0K(this.A00, glw.A00) || !0qQ.A0K(this.A03, glw.A03) || !0qQ.A0K(this.A04, glw.A04) || !0qQ.A0K(this.A05, glw.A05) || !0qQ.A0K(this.A01, glw.A01) || !0qQ.A0K(this.A02, glw.A02) || !0qQ.A0K(this.A08, glw.A08) || !0qQ.A0K(this.A07, glw.A07) || !0qQ.A0K(this.A06, glw.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A00))) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TE.A0L(this.A06);
    }

    public C53310Glw(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2) {
        this.A00 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = str5;
        this.A02 = str6;
        this.A08 = str7;
        this.A07 = list;
        this.A06 = list2;
    }
}
