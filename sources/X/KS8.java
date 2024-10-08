package X;

public final class KS8 extends C62821Kmx {
    public final String A00;
    public final Throwable A01;

    public KS8(String str, Throwable th) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = th;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KS8) {
                KS8 ks8 = (KS8) obj;
                if (!0qQ.A0K(this.A00, ks8.A00) || !0qQ.A0K(this.A01, ks8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0C(this.A01);
    }
}
