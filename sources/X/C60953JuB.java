package X;

import java.util.Map;

/* renamed from: X.JuB  reason: case insensitive filesystem */
public final class C60953JuB extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final Map A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60953JuB) {
                C60953JuB juB = (C60953JuB) obj;
                if (this.A07 != juB.A07 || !0qQ.A0K(this.A03, juB.A03) || !0qQ.A0K(this.A06, juB.A06) || !0qQ.A0K(this.A02, juB.A02) || !0qQ.A0K(this.A01, juB.A01) || !0qQ.A0K(this.A00, juB.A00) || !0qQ.A0K(this.A04, juB.A04) || !0qQ.A0K(this.A05, juB.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A00, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A08(this.A03, C51965G9l.A05(this.A07))))))));
    }

    public C60953JuB(String str, String str2, String str3, String str4, String str5, Map map, Map map2, boolean z) {
        this.A07 = z;
        this.A03 = str;
        this.A06 = map;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A04 = str5;
        this.A05 = map2;
    }
}
