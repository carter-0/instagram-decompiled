package X;

/* renamed from: X.Jz6  reason: case insensitive filesystem */
public final class C61213Jz6 extends AnonymousClass0T0 implements C66547MWb {
    public final C42021BAw A00;
    public final C60903JtN A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61213Jz6) {
                C61213Jz6 jz6 = (C61213Jz6) obj;
                if (!0qQ.A0K(this.A00, jz6.A00) || !0qQ.A0K(this.A01, jz6.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C61213Jz6(C42021BAw bAw, C60903JtN jtN) {
        this.A00 = bAw;
        this.A01 = jtN;
    }
}
