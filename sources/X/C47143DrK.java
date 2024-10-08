package X;

/* renamed from: X.DrK  reason: case insensitive filesystem */
public final class C47143DrK extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47143DrK) {
                C47143DrK drK = (C47143DrK) obj;
                if (!0qQ.A0K(this.A00, drK.A00) || !0qQ.A0K(this.A01, drK.A01)) {
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

    public C47143DrK(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
