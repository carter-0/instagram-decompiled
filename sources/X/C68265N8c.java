package X;

/* renamed from: X.N8c  reason: case insensitive filesystem */
public final class C68265N8c extends AnonymousClass0T0 implements C74250Pre {
    public final String A00;
    public final String A01;

    public C68265N8c(String str, String str2) {
        0qQ.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68265N8c) {
                C68265N8c n8c = (C68265N8c) obj;
                if (!0qQ.A0K(this.A00, n8c.A00) || !0qQ.A0K(this.A01, n8c.A01)) {
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
