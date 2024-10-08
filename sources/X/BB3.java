package X;

import java.util.List;

public final class BB3 extends AnonymousClass0T0 {
    public final List A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BB3) {
                BB3 bb3 = (BB3) obj;
                if (!0qQ.A0K(this.A01, bb3.A01) || !0qQ.A0K(this.A00, bb3.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public BB3(String str, List list) {
        AnonymousClass7TG.A1O(str, list);
        this.A01 = str;
        this.A00 = list;
    }
}
