package X;

/* renamed from: X.BEp  reason: case insensitive filesystem */
public final class C42037BEp extends AnonymousClass0T0 implements MWD {
    public final N49 A00;
    public final String A01;

    public C42037BEp(N49 n49, String str) {
        0qQ.A0B(n49, 2);
        this.A01 = str;
        this.A00 = n49;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42037BEp) {
                C42037BEp bEp = (C42037BEp) obj;
                if (!0qQ.A0K(this.A01, bEp.A01) || !0qQ.A0K(this.A00, bEp.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TG.A0E(this.A01) * 31);
    }
}
