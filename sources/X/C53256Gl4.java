package X;

/* renamed from: X.Gl4  reason: case insensitive filesystem */
public final class C53256Gl4 extends AnonymousClass0T0 {
    public final C304836Fk A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53256Gl4) {
                C53256Gl4 gl4 = (C53256Gl4) obj;
                if (this.A01 != gl4.A01 || !0qQ.A0K(this.A00, gl4.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, C51965G9l.A05(this.A01));
    }

    public C53256Gl4(C304836Fk r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }
}
