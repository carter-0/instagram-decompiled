package X;

import java.util.List;

/* renamed from: X.DrY  reason: case insensitive filesystem */
public final class C47157DrY extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public C47157DrY(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        0qQ.A0B(list, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A06 = list;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47157DrY) {
                C47157DrY drY = (C47157DrY) obj;
                if (!0qQ.A0K(this.A00, drY.A00) || !0qQ.A0K(this.A01, drY.A01) || !0qQ.A0K(this.A06, drY.A06) || !0qQ.A0K(this.A02, drY.A02) || !0qQ.A0K(this.A03, drY.A03) || !0qQ.A0K(this.A04, drY.A04) || !0qQ.A0K(this.A05, drY.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.A06, ((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A05);
    }
}
