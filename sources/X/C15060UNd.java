package X;

/* renamed from: X.UNd  reason: case insensitive filesystem */
public final class C15060UNd extends AnonymousClass0T0 implements XA5 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15060UNd) {
                C15060UNd uNd = (C15060UNd) obj;
                if (!0qQ.A0K(this.A00, uNd.A00) || !0qQ.A0K(this.A01, uNd.A01) || !0qQ.A0K(this.A02, uNd.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00)));
    }

    public C15060UNd(String str, String str2, String str3) {
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
