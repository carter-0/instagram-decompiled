package X;

public final class N8F extends AnonymousClass0T0 implements PrW {
    public final String A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8F) {
                N8F n8f = (N8F) obj;
                if (this.A01 != n8f.A01 || !0qQ.A0K(this.A00, n8f.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, C51975G9x.A03(this.A01));
    }

    public N8F(long j, String str) {
        this.A01 = j;
        this.A00 = str;
    }
}
