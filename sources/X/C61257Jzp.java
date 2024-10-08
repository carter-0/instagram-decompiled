package X;

/* renamed from: X.Jzp  reason: case insensitive filesystem */
public final class C61257Jzp extends AnonymousClass0T0 implements MRK {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61257Jzp) {
                C61257Jzp jzp = (C61257Jzp) obj;
                if (!0qQ.A0K(this.A01, jzp.A01) || !0qQ.A0K(this.A00, jzp.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C61257Jzp(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }
}
