package X;

public final class KQZ extends C62804Kmg {
    public final Exception A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KQZ) {
                KQZ kqz = (KQZ) obj;
                if (!0qQ.A0K(this.A00, kqz.A00) || !0qQ.A0K(this.A01, kqz.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }

    public KQZ(Exception exc, String str) {
        this.A00 = exc;
        this.A01 = str;
    }
}
