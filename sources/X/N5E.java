package X;

public final class N5E extends AnonymousClass0T0 implements C74526PwL {
    public final C47163Dre A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N5E) {
                N5E n5e = (N5E) obj;
                if (!0qQ.A0K(this.A01, n5e.A01) || !0qQ.A0K(this.A00, n5e.A00) || !0qQ.A0K(this.A02, n5e.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A02);
    }

    public N5E(C47163Dre dre, String str, String str2) {
        this.A01 = str;
        this.A00 = dre;
        this.A02 = str2;
    }
}
