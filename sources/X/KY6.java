package X;

public final class KY6 extends C64185LSs {
    public final Integer A00;
    public final C62230ry A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KY6) {
                KY6 ky6 = (KY6) obj;
                if (this.A00 != ky6.A00 || !0qQ.A0K(this.A01, ky6.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        return (C51971G9r.A0D(num, C63417Kwd.A00(num)) * 31) + this.A01.hashCode();
    }

    public KY6(Integer num, C62230ry r2) {
        this.A00 = num;
        this.A01 = r2;
    }

    public final String toString() {
        String str;
        String lSs = super.toString();
        Integer num = this.A00;
        if (num != null) {
            str = C63417Kwd.A00(num);
        } else {
            str = "null";
        }
        return 002.A0u(lSs, ": { ", str, " }");
    }
}
