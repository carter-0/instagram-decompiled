package X;

public final class GER extends AnonymousClass0T0 implements C59520JMs {
    public final String A00;
    public final String A01;

    public GER(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GER) {
                GER ger = (GER) obj;
                if (!0qQ.A0K(this.A00, ger.A00) || !0qQ.A0K(this.A01, ger.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }
}
