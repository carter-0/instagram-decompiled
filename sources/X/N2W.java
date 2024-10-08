package X;

public final class N2W extends AnonymousClass0T0 {
    public final O6A A00;
    public final O6B A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N2W) {
                N2W n2w = (N2W) obj;
                if (!0qQ.A0K(this.A01, n2w.A01) || !0qQ.A0K(this.A00, n2w.A00) || !0qQ.A0K(this.A02, n2w.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01)));
    }

    public N2W(O6A o6a, O6B o6b, String str) {
        AnonymousClass7TG.A1U(o6b, o6a, str);
        this.A01 = o6b;
        this.A00 = o6a;
        this.A02 = str;
    }
}
