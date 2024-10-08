package X;

import java.util.List;

public final class N5D extends AnonymousClass0T0 implements C74525PwK {
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N5D) {
                N5D n5d = (N5D) obj;
                if (!0qQ.A0K(this.A01, n5d.A01) || !0qQ.A0K(this.A00, n5d.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public N5D(List list, String str) {
        AnonymousClass7TG.A1O(list, str);
        this.A01 = list;
        this.A00 = str;
    }
}
