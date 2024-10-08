package X;

/* renamed from: X.GQx  reason: case insensitive filesystem */
public final class C52398GQx extends C54698HPd {
    public final C46519DgM A00;
    public final 0sP A01;

    public C52398GQx(C46519DgM dgM, 0sP r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = dgM;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52398GQx) {
                C52398GQx gQx = (C52398GQx) obj;
                if (!0qQ.A0K(this.A01, gQx.A01) || this.A00 != gQx.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public C52398GQx() {
        this((C46519DgM) null, C52521GVy.A00);
    }
}
