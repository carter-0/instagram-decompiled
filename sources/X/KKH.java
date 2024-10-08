package X;

public final class KKH extends C63945LEl {
    public final int A00;
    public final String A01;

    public KKH(int i, String str) {
        super(i, (Integer) null);
        this.A00 = i;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KKH) {
                KKH kkh = (KKH) obj;
                if (this.A00 != kkh.A00 || !0qQ.A0K(this.A01, kkh.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, this.A00 * 31);
    }
}
