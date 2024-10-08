package X;

/* renamed from: X.GlE  reason: case insensitive filesystem */
public final class C53266GlE extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53266GlE) {
                C53266GlE glE = (C53266GlE) obj;
                if (!0qQ.A0K(this.A00, glE.A00) || !0qQ.A0K(this.A02, glE.A02) || !0qQ.A0K(this.A01, glE.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A00)) + AnonymousClass7TG.A0E(this.A01);
    }

    public C53266GlE(String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
