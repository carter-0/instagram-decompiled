package X;

/* renamed from: X.Cwv  reason: case insensitive filesystem */
public final class C45464Cwv {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45464Cwv) {
                C45464Cwv cwv = (C45464Cwv) obj;
                if (!0qQ.A0K(this.A00, cwv.A00) || !0qQ.A0K(this.A01, cwv.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("MEmuExtendedCaptureImage(id=", this.A00, C66579MXk.A00(83), this.A01, ')');
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C45464Cwv(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
