package X;

public final class BB7 extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BB7) {
                BB7 bb7 = (BB7) obj;
                if (!0qQ.A0K(this.A00, bb7.A00) || !0qQ.A0K(this.A01, bb7.A01) || !0qQ.A0K(this.A02, bb7.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00)) + AnonymousClass7TG.A0E(this.A02);
    }

    public BB7(String str, String str2, String str3) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
