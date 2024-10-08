package X;

import java.util.List;

public final class BIX extends AnonymousClass0T0 implements C46222DRd {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIX) {
                BIX bix = (BIX) obj;
                if (!0qQ.A0K(this.A00, bix.A00) || !0qQ.A0K(this.A04, bix.A04) || !0qQ.A0K(this.A01, bix.A01) || !0qQ.A0K(this.A02, bix.A02) || !0qQ.A0K(this.A03, bix.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public BIX(String str, String str2, String str3, String str4, List list) {
        this.A00 = str;
        this.A04 = list;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
