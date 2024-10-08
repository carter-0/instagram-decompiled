package X;

import java.util.List;

public final class EJZ extends ExY {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJZ) {
                EJZ ejz = (EJZ) obj;
                if (!0qQ.A0K(this.A00, ejz.A00) || !0qQ.A0K(this.A02, ejz.A02) || !0qQ.A0K(this.A04, ejz.A04) || !0qQ.A0K(this.A06, ejz.A06) || !0qQ.A0K(this.A03, ejz.A03) || !0qQ.A0K(this.A05, ejz.A05) || !0qQ.A0K(this.A01, ejz.A01) || !0qQ.A0K(this.A07, ejz.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        super(2FW.A0g, str);
        this.A00 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A03 = str5;
        this.A05 = str6;
        this.A01 = str7;
        this.A07 = list;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TG.A0E(this.A00) * 31)) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A07);
    }
}
