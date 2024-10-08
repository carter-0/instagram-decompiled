package X;

public final class CHW extends AnonymousClass6BS {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CHW) {
                CHW chw = (CHW) obj;
                if (!0qQ.A0K(this.A00, chw.A00) || !0qQ.A0K(this.A01, chw.A01)) {
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

    public CHW(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
