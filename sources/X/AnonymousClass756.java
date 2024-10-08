package X;

/* renamed from: X.756  reason: invalid class name */
public final class AnonymousClass756 extends AnonymousClass755 {
    public final C68147N2n A00;
    public final C44046CTp A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass756) {
                AnonymousClass756 r5 = (AnonymousClass756) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C68147N2n n2n = this.A00;
        int i = 0;
        int hashCode = (n2n == null ? 0 : n2n.hashCode()) * 31;
        C44046CTp cTp = this.A01;
        if (cTp != null) {
            i = cTp.hashCode();
        }
        return hashCode + i;
    }

    public AnonymousClass756(C68147N2n n2n, C44046CTp cTp) {
        this.A00 = n2n;
        this.A01 = cTp;
    }
}
