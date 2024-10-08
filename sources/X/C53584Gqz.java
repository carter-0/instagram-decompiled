package X;

/* renamed from: X.Gqz  reason: case insensitive filesystem */
public final class C53584Gqz extends AnonymousClass0T0 implements JN8 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53584Gqz) {
                C53584Gqz gqz = (C53584Gqz) obj;
                if (!0qQ.A0K(this.A00, gqz.A00) || !0qQ.A0K(this.A01, gqz.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public C53584Gqz(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
