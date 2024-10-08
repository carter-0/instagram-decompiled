package X;

/* renamed from: X.Mh5  reason: case insensitive filesystem */
public final class C67032Mh5 implements Runnable {
    public final /* synthetic */ C273624mt A00;
    public final /* synthetic */ C376369Hs A01;

    public C67032Mh5(C273624mt r1, C376369Hs r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        String str;
        C273624mt r5 = this.A00;
        C376369Hs r1 = this.A01;
        0qQ.A0B(r1, 0);
        boolean A1R = AnonymousClass7TF.A1R((r1.A00 > 0 ? 1 : (r1.A00 == 0 ? 0 : -1)));
        C66934MfT mfT = r5.A02;
        if (mfT == null) {
            str = "actionBarController";
        } else {
            mfT.A02 = A1R;
            2dZ r0 = mfT.A00;
            if (r0 != null) {
                r0.A0T();
            }
            MeY meY = r5.A04;
            if (meY == null) {
                str = "actionBarRepository";
            } else if (meY.A02 != A1R) {
                meY.A02 = A1R;
                MeY.A01(meY);
                return;
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
