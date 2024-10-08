package X;

public final class Dwz extends C48161Ea3 {
    public final boolean A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Dwz) {
                Dwz dwz = (Dwz) obj;
                if (this.A00 != dwz.A00 || !0qQ.A0K(this.A01, dwz.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return C41845B3m.A01(this.A01, i * 31);
    }

    public Dwz(boolean z, String str) {
        this.A00 = z;
        this.A01 = str;
    }
}
