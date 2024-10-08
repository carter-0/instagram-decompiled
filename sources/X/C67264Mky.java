package X;

/* renamed from: X.Mky  reason: case insensitive filesystem */
public final class C67264Mky {
    public final /* synthetic */ C273624mt A00;

    public C67264Mky(C273624mt r1) {
        this.A00 = r1;
    }

    public final 2EM A00() {
        C66633Ma2 ma2 = this.A00.A05;
        if (ma2 != null) {
            return ma2.A0t();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A01() {
        String str;
        2dZ r0;
        C273624mt r2 = this.A00;
        C66934MfT mfT = r2.A02;
        if (mfT == null) {
            str = "actionBarController";
        } else {
            if (mfT.A04.isResumed() && (r0 = mfT.A00) != null) {
                r0.A0T();
            }
            C67263Mkx mkx = r2.A06;
            if (mkx != null) {
                MeY meY = r2.A04;
                if (meY == null) {
                    str = "actionBarRepository";
                } else {
                    boolean z = mkx.A03;
                    int size = mkx.A0D.size();
                    if (meY.A03 != z || meY.A00 != size) {
                        meY.A03 = z;
                        meY.A00 = size;
                        MeY.A01(meY);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
