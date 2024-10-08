package X;

public final class QPo extends RLX {
    public final String A00;
    public final String A01;

    public QPo(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPo) {
                QPo qPo = (QPo) obj;
                if (!0qQ.A0K(this.A01, qPo.A01) || !0qQ.A0K(this.A00, qPo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("NoMainThreadLayoutState(root=", this.A01, ", breadcrumb=", this.A00, ')');
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0O(this.A01));
    }
}
