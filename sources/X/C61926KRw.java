package X;

/* renamed from: X.KRw  reason: case insensitive filesystem */
public final class C61926KRw extends C62820Kmw {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61926KRw) {
                C61926KRw kRw = (C61926KRw) obj;
                if (!0qQ.A0K(this.A01, kRw.A01) || !0qQ.A0K(this.A00, kRw.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + C41845B3m.A00(this.A00);
    }

    public C61926KRw(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
