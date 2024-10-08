package X;

import java.util.List;

public final class N58 extends AnonymousClass0T0 implements C74520PwF {
    public final Long A00;
    public final String A01;
    public final List A02;

    public N58(Long l, String str, List list) {
        0qQ.A0B(list, 1);
        this.A02 = list;
        this.A01 = str;
        this.A00 = l;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N58) {
                N58 n58 = (N58) obj;
                if (!0qQ.A0K(this.A02, n58.A02) || !0qQ.A0K(this.A01, n58.A01) || !0qQ.A0K(this.A00, n58.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
