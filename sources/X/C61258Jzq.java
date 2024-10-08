package X;

/* renamed from: X.Jzq  reason: case insensitive filesystem */
public final class C61258Jzq extends AnonymousClass0T0 implements MRK {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61258Jzq) {
                C61258Jzq jzq = (C61258Jzq) obj;
                if (!0qQ.A0K(this.A00, jzq.A00) || !0qQ.A0K(this.A02, jzq.A02) || !0qQ.A0K(this.A01, jzq.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A00)));
    }

    public C61258Jzq(String str, String str2, String str3) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
