package X;

import java.util.List;

/* renamed from: X.Jtf  reason: case insensitive filesystem */
public final class C60921Jtf extends AnonymousClass0T0 {
    public String A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60921Jtf) {
                C60921Jtf jtf = (C60921Jtf) obj;
                if (!0qQ.A0K(this.A01, jtf.A01) || !0qQ.A0K(this.A02, jtf.A02) || !0qQ.A0K(this.A00, jtf.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A01)));
    }

    public C60921Jtf(String str, String str2, List list) {
        AnonymousClass7TG.A1P(str, str2);
        this.A01 = str;
        this.A02 = list;
        this.A00 = str2;
    }
}
