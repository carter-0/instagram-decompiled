package X;

/* renamed from: X.GrC  reason: case insensitive filesystem */
public final class C53597GrC extends AnonymousClass0T0 implements JNG {
    public final 28D A00;
    public final String A01;
    public final C53451Goj A02;

    public C53597GrC(28D r2, C53451Goj goj, String str) {
        0qQ.A0B(str, 3);
        this.A02 = goj;
        this.A00 = r2;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53597GrC) {
                C53597GrC grC = (C53597GrC) obj;
                if (!0qQ.A0K(this.A02, grC.A02) || this.A00 != grC.A00 || !0qQ.A0K(this.A01, grC.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TG.A0C(this.A02) * 31));
    }
}
