package X;

import java.util.List;

public final class N5K extends AnonymousClass0T0 implements C74533PwS {
    public final List A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N5K) {
                N5K n5k = (N5K) obj;
                if (!0qQ.A0K(this.A00, n5k.A00) || !0qQ.A0K(this.A01, n5k.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public N5K(List list, String str) {
        this.A00 = list;
        this.A01 = str;
    }
}
