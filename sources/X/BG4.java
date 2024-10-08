package X;

import java.util.List;

public final class BG4 extends AnonymousClass0T0 implements DS1 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;

    public final BG4 F8F(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BG4) {
                BG4 bg4 = (BG4) obj;
                if (!0qQ.A0K(this.A04, bg4.A04) || !0qQ.A0K(this.A05, bg4.A05) || this.A00 != bg4.A00 || !0qQ.A0K(this.A01, bg4.A01) || !0qQ.A0K(this.A02, bg4.A02) || !0qQ.A0K(this.A03, bg4.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A04);
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, (AnonymousClass7TF.A07(this.A05, A0K) + this.A00) * 31)));
    }

    public BG4(String str, String str2, String str3, List list, List list2, int i) {
        AnonymousClass7TG.A1O(list, list2);
        AnonymousClass7TG.A1R(str, str2);
        0qQ.A0B(str3, 6);
        this.A04 = list;
        this.A05 = list2;
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final DS1 E82(1E9 r1) {
        return this;
    }
}
