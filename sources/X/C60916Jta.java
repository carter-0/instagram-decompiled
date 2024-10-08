package X;

import java.util.List;

/* renamed from: X.Jta  reason: case insensitive filesystem */
public final class C60916Jta extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60916Jta) {
                C60916Jta jta = (C60916Jta) obj;
                if (!0qQ.A0K(this.A00, jta.A00) || !0qQ.A0K(this.A01, jta.A01) || !0qQ.A0K(this.A02, jta.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00)));
    }

    public C60916Jta(String str, String str2, List list) {
        AnonymousClass7TG.A1U(str, str2, list);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }
}
