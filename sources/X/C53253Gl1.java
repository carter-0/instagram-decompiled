package X;

import java.util.List;

/* renamed from: X.Gl1  reason: case insensitive filesystem */
public final class C53253Gl1 extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53253Gl1) {
                C53253Gl1 gl1 = (C53253Gl1) obj;
                if (!0qQ.A0K(this.A01, gl1.A01) || !0qQ.A0K(this.A00, gl1.A00)) {
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

    public C53253Gl1(List list, String str) {
        AnonymousClass7TG.A1O(list, str);
        this.A01 = list;
        this.A00 = str;
    }
}
