package X;

import java.util.List;

/* renamed from: X.JtO  reason: case insensitive filesystem */
public final class C60904JtO extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;

    public C60904JtO(String str, List list) {
        0qQ.A0B(list, 2);
        this.A00 = str;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60904JtO) {
                C60904JtO jtO = (C60904JtO) obj;
                if (!0qQ.A0K(this.A00, jtO.A00) || !0qQ.A0K(this.A01, jtO.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TG.A0E(this.A00) * 31);
    }
}
