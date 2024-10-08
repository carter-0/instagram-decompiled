package X;

/* renamed from: X.JtT  reason: case insensitive filesystem */
public final class C60909JtT extends AnonymousClass0T0 {
    public String A00 = "";
    public String A01 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60909JtT) {
                C60909JtT jtT = (C60909JtT) obj;
                if (!0qQ.A0K(this.A01, jtT.A01) || !0qQ.A0K(this.A00, jtT.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0O(this.A01));
    }
}
