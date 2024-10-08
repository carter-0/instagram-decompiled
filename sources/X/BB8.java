package X;

public final class BB8 extends AnonymousClass0T0 {
    public String A00 = null;
    public String A01 = null;
    public String A02 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BB8) {
                BB8 bb8 = (BB8) obj;
                if (!0qQ.A0K(this.A02, bb8.A02) || !0qQ.A0K(this.A00, bb8.A00) || !0qQ.A0K(this.A01, bb8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A01);
    }
}
