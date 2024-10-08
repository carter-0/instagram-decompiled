package X;

import java.util.List;

public final class BBC extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public BBC(String str, String str2, String str3, List list) {
        0qQ.A0B(list, 1);
        this.A03 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBC) {
                BBC bbc = (BBC) obj;
                if (!0qQ.A0K(this.A03, bbc.A03) || !0qQ.A0K(this.A00, bbc.A00) || !0qQ.A0K(this.A01, bbc.A01) || !0qQ.A0K(this.A02, bbc.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TE.A0K(this.A03) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }
}
