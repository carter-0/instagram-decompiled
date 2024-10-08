package X;

import android.view.View;

/* renamed from: X.Dg7  reason: case insensitive filesystem */
public final class C46504Dg7 implements View.OnClickListener {
    public final /* synthetic */ C316006kx A00;

    public C46504Dg7(C316006kx r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        IllegalArgumentException illegalArgumentException;
        int i;
        int A05 = AnonymousClass0fD.A05(160049510);
        C316006kx r0 = this.A00;
        C317116mk r3 = r0.A0E;
        if (r3 != null) {
            C250973mM r1 = r0.A09;
            if (r1 != null) {
                C255773uh r02 = r0.A08;
                if (r02 != null) {
                    r3.DEs(r02, r1);
                    AnonymousClass0fD.A0C(-368745707, A05);
                    return;
                }
                illegalArgumentException = AnonymousClass7TE.A0w("Required value was null.");
                i = -298920400;
            } else {
                illegalArgumentException = AnonymousClass7TE.A0w("Required value was null.");
                i = 1340609368;
            }
        } else {
            illegalArgumentException = AnonymousClass7TE.A0w("Required value was null.");
            i = -429677130;
        }
        AnonymousClass0fD.A0C(i, A05);
        throw illegalArgumentException;
    }
}
