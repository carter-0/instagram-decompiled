package X;

public final class Dwk extends C48159Ea1 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Dwk) {
                Dwk dwk = (Dwk) obj;
                if (!0qQ.A0K(this.A02, dwk.A02) || !0qQ.A0K(this.A00, dwk.A00) || !0qQ.A0K(this.A01, dwk.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0O(this.A02)) + AnonymousClass7TG.A0E(this.A01);
    }

    public Dwk(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
