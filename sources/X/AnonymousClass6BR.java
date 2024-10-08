package X;

/* renamed from: X.6BR  reason: invalid class name */
public final class AnonymousClass6BR extends AnonymousClass6BS {
    public final Exception A00;
    public final String A01;
    public final String A02;

    public AnonymousClass6BR(Exception exc, String str, String str2) {
        0qQ.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = exc;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BR) {
                AnonymousClass6BR r5 = (AnonymousClass6BR) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }
}
