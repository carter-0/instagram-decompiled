package X;

/* renamed from: X.Jzh  reason: case insensitive filesystem */
public final class C61249Jzh extends AnonymousClass0T0 implements MR6 {
    public final C255773uh A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61249Jzh) {
                C61249Jzh jzh = (C61249Jzh) obj;
                if (!0qQ.A0K(this.A00, jzh.A00) || this.A01 != jzh.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + C63410KwW.A00(this.A01);
    }

    public C61249Jzh(C255773uh r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }
}
