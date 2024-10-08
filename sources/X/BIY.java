package X;

public final class BIY extends AnonymousClass0T0 implements C46223DRe {
    public final Boolean A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIY) {
                BIY biy = (BIY) obj;
                if (!0qQ.A0K(this.A00, biy.A00) || !0qQ.A0K(this.A01, biy.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public BIY(String str, Boolean bool) {
        this.A00 = bool;
        this.A01 = str;
    }
}
