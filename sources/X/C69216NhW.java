package X;

/* renamed from: X.NhW  reason: case insensitive filesystem */
public final class C69216NhW extends C62875Knp {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69216NhW) {
                C69216NhW nhW = (C69216NhW) obj;
                if (!0qQ.A0K(this.A00, nhW.A00) || !0qQ.A0K(this.A01, nhW.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }

    public C69216NhW(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
