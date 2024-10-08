package X;

/* renamed from: X.Jxm  reason: case insensitive filesystem */
public final class C61136Jxm extends AnonymousClass0T0 implements C66383MPp {
    public final C266444Yx A00;
    public final C266444Yx A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61136Jxm) {
                C61136Jxm jxm = (C61136Jxm) obj;
                if (!0qQ.A0K(this.A01, jxm.A01) || !0qQ.A0K(this.A00, jxm.A00)) {
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

    public C61136Jxm(C266444Yx r1, C266444Yx r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
