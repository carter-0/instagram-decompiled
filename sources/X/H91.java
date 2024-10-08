package X;

public final class H91 extends HPK {
    public final String A00;
    public final C62320sa A01;

    public H91(String str, C62320sa r3) {
        0qQ.A0B(r3, 2);
        this.A00 = str;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H91) {
                H91 h91 = (H91) obj;
                if (!0qQ.A0K(this.A00, h91.A00) || !0qQ.A0K(this.A01, h91.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A00));
    }
}
