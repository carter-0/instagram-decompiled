package X;

import java.util.Map;

/* renamed from: X.QOs  reason: case insensitive filesystem */
public final class C7610QOs extends AnonymousClass0T0 {
    public Integer A00 = null;
    public String A01 = null;
    public String A02;
    public String A03 = null;
    public String A04 = null;
    public final RF1 A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Map A09;

    public C7610QOs(RF1 rf1, String str, String str2, String str3, String str4, Map map) {
        AnonymousClass7TG.A1O(str, rf1);
        this.A02 = str;
        this.A05 = rf1;
        this.A06 = str2;
        this.A07 = str3;
        this.A09 = map;
        this.A08 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7610QOs) {
                C7610QOs qOs = (C7610QOs) obj;
                if (!0qQ.A0K(this.A02, qOs.A02) || this.A05 != qOs.A05 || !0qQ.A0K(this.A06, qOs.A06) || !0qQ.A0K(this.A07, qOs.A07) || !0qQ.A0K(this.A09, qOs.A09) || !0qQ.A0K(this.A08, qOs.A08) || !0qQ.A0K(this.A04, qOs.A04) || !0qQ.A0K(this.A01, qOs.A01) || !0qQ.A0K(this.A00, qOs.A00) || !0qQ.A0K(this.A03, qOs.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        int A002 = C54732HQn.A00();
        return (((((((((((((((((((AnonymousClass7TF.A07(this.A05, A0O) + AnonymousClass7TG.A0E(this.A06)) * 31) + A002) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + A002) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31;
    }
}
