package X;

/* renamed from: X.Kkm  reason: case insensitive filesystem */
public final class C62686Kkm extends Exception {
    public final XRM A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62686Kkm) {
                C62686Kkm kkm = (C62686Kkm) obj;
                if (!0qQ.A0K(this.A01, kkm.A01) || this.A00 != kkm.A00 || !0qQ.A0K(this.A02, kkm.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A02);
    }

    public C62686Kkm(XRM xrm, String str, String str2) {
        this.A01 = str;
        this.A00 = xrm;
        this.A02 = str2;
    }
}
