package X;

/* renamed from: X.HKi  reason: case insensitive filesystem */
public final class C54599HKi extends HQI {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54599HKi) {
                C54599HKi hKi = (C54599HKi) obj;
                if (!0qQ.A0K(this.A02, hKi.A02) || !0qQ.A0K(this.A01, hKi.A01) || !0qQ.A0K(this.A00, hKi.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A02)));
    }

    public C54599HKi(String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }
}
