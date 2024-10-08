package X;

import java.util.List;

public final class N9T extends AnonymousClass0T0 implements C74270Pry {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public N9T(String str, String str2, List list, List list2) {
        0qQ.A0B(list2, 4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
        this.A03 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9T) {
                N9T n9t = (N9T) obj;
                if (!0qQ.A0K(this.A00, n9t.A00) || !0qQ.A0K(this.A01, n9t.A01) || !0qQ.A0K(this.A02, n9t.A02) || !0qQ.A0K(this.A03, n9t.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, (((AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31);
    }
}
