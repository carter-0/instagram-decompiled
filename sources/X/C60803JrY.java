package X;

/* renamed from: X.JrY  reason: case insensitive filesystem */
public final class C60803JrY extends C62700Kl0 {
    public final String A00;
    public final boolean A01 = true;

    public C60803JrY(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60803JrY) {
                C60803JrY jrY = (C60803JrY) obj;
                if (!0qQ.A0K(this.A00, jrY.A00) || this.A01 != jrY.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0O(this.A00));
    }
}
