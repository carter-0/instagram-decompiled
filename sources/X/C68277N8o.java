package X;

import java.util.List;

/* renamed from: X.N8o  reason: case insensitive filesystem */
public final class C68277N8o extends AnonymousClass0T0 implements JM9 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68277N8o) {
                C68277N8o n8o = (C68277N8o) obj;
                if (!0qQ.A0K(this.A01, n8o.A01) || !0qQ.A0K(this.A00, n8o.A00) || this.A02 != n8o.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0K(this.A01)));
    }

    public C68277N8o(String str, List list, boolean z) {
        this.A01 = list;
        this.A00 = str;
        this.A02 = z;
    }

    public C68277N8o() {
        this("", 0sn.A00, false);
    }
}
