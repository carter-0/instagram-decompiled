package X;

/* renamed from: X.BEo  reason: case insensitive filesystem */
public final class C42036BEo extends AnonymousClass0T0 implements DR9 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42036BEo) {
                C42036BEo bEo = (C42036BEo) obj;
                if (!0qQ.A0K(this.A00, bEo.A00) || !0qQ.A0K(this.A01, bEo.A01)) {
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

    public C42036BEo(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
