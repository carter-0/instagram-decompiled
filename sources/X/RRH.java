package X;

public final class RRH {
    public String A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (obj instanceof RRH) {
            RRH rrh = (RRH) obj;
            if (!rrh.A00.equals(this.A00) || !rrh.A01.equals(this.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }
}
