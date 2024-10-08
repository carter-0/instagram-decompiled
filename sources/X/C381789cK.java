package X;

/* renamed from: X.9cK  reason: invalid class name and case insensitive filesystem */
public final class C381789cK extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381789cK) {
                C381789cK r5 = (C381789cK) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + this.A01.hashCode();
    }

    public C381789cK(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public C381789cK() {
        this("", "");
    }
}
