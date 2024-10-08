package X;

import java.util.List;

public final class XMB extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public XMB(String str, List list, boolean z) {
        0qQ.A0B(list, 3);
        this.A00 = str;
        this.A02 = z;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XMB) {
                XMB xmb = (XMB) obj;
                if (!0qQ.A0K(this.A00, xmb.A00) || this.A02 != xmb.A02 || !0qQ.A0K(this.A01, xmb.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0E = AnonymousClass7TG.A0E(this.A00) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return AnonymousClass7TE.A0N(this.A01, (A0E + i) * 31);
    }
}
