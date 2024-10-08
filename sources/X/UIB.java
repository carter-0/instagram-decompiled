package X;

public final class UIB extends V2A {
    public final boolean A00;
    public final String A01;

    public UIB(String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UIB) {
                UIB uib = (UIB) obj;
                if (!0qQ.A0K(this.A01, uib.A01) || this.A00 != uib.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A00, AnonymousClass7TE.A0O(this.A01));
    }
}
