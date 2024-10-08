package X;

public final class UNU extends AnonymousClass0T0 implements XA1 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNU) {
                UNU unu = (UNU) obj;
                if (!0qQ.A0K(this.A01, unu.A01) || !0qQ.A0K(this.A00, unu.A00)) {
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

    public UNU(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }
}
