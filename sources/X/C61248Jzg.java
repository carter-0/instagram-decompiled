package X;

/* renamed from: X.Jzg  reason: case insensitive filesystem */
public final class C61248Jzg extends AnonymousClass0T0 implements MR6 {
    public final C255773uh A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61248Jzg) {
                C61248Jzg jzg = (C61248Jzg) obj;
                if (!0qQ.A0K(this.A00, jzg.A00) || this.A01 != jzg.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A00) + C63410KwW.A00(this.A01)) * 31 * 31) + C54732HQn.A00();
    }

    public C61248Jzg(C255773uh r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }
}
