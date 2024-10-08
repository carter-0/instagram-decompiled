package X;

public final class HBQ extends C55509Hir {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HBQ) {
                HBQ hbq = (HBQ) obj;
                if (!0qQ.A0K(this.A02, hbq.A02) || !0qQ.A0K(this.A01, hbq.A01) || !0qQ.A0K(this.A00, hbq.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public HBQ(String str, String str2, String str3) {
        super(9001);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A00);
    }
}
