package X;

import android.view.View;

/* renamed from: X.FLr  reason: case insensitive filesystem */
public final class C50051FLr implements View.OnClickListener {
    public final /* synthetic */ C316006kx A00;

    public C50051FLr(C316006kx r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        IllegalArgumentException illegalArgumentException;
        int i;
        int A05 = AnonymousClass0fD.A05(-383807114);
        C316006kx r0 = this.A00;
        C317116mk r3 = r0.A0E;
        if (r3 != null) {
            C250973mM r1 = r0.A09;
            if (r1 != null) {
                C255773uh r02 = r0.A08;
                if (r02 != null) {
                    r3.CwO(r02, r1);
                    AnonymousClass0fD.A0C(-502416837, A05);
                    return;
                }
                illegalArgumentException = AnonymousClass7TE.A0w("Required value was null.");
                i = 1550692705;
            } else {
                illegalArgumentException = AnonymousClass7TE.A0w("Required value was null.");
                i = 958865313;
            }
        } else {
            illegalArgumentException = AnonymousClass7TE.A0w("Required value was null.");
            i = -1047314216;
        }
        AnonymousClass0fD.A0C(i, A05);
        throw illegalArgumentException;
    }
}
