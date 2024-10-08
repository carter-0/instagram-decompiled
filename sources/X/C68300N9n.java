package X;

import java.util.List;

/* renamed from: X.N9n  reason: case insensitive filesystem */
public final class C68300N9n extends AnonymousClass0T0 implements C74274Ps2 {
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68300N9n) {
                C68300N9n n9n = (C68300N9n) obj;
                if (!0qQ.A0K(this.A00, n9n.A00) || !0qQ.A0K(this.A01, n9n.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C68300N9n(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}
