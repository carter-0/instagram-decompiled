package X;

public final class BFO extends AnonymousClass0T0 implements MWI {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFO) {
                BFO bfo = (BFO) obj;
                if (!0qQ.A0K(this.A00, bfo.A00) || !0qQ.A0K(this.A01, bfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public BFO(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
