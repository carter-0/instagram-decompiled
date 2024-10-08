package X;

/* renamed from: X.6BP  reason: invalid class name */
public final class AnonymousClass6BP extends AnonymousClass6BM {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BP) {
                AnonymousClass6BP r5 = (AnonymousClass6BP) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public AnonymousClass6BP(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
