package X;

import java.util.List;

/* renamed from: X.JtP  reason: case insensitive filesystem */
public final class C60905JtP extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;

    public C60905JtP(String str, List list) {
        0qQ.A0B(list, 2);
        this.A00 = str;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60905JtP) {
                C60905JtP jtP = (C60905JtP) obj;
                if (!0qQ.A0K(this.A00, jtP.A00) || !0qQ.A0K(this.A01, jtP.A01)) {
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
