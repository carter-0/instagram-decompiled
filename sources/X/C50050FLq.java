package X;

import android.view.View;

/* renamed from: X.FLq  reason: case insensitive filesystem */
public final class C50050FLq implements View.OnClickListener {
    public final /* synthetic */ C316006kx A00;

    public C50050FLq(C316006kx r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        IllegalArgumentException illegalArgumentException;
        int i;
        int A05 = AnonymousClass0fD.A05(-1500267256);
        C316006kx r0 = this.A00;
        C317116mk r3 = r0.A0E;
        if (r3 != null) {
            C250973mM r1 = r0.A09;
            if (r1 != null) {
                C255773uh r02 = r0.A08;
                if (r02 != null) {
                    r3.CwO(r02, r1);
                    AnonymousClass0fD.A0C(2060907112, A05);
                    return;
                }
                illegalArgumentException = AnonymousClass7TE.A0w("Required value was null.");
                i = -1759791913;
            } else {
                illegalArgumentException = AnonymousClass7TE.A0w("Required value was null.");
                i = -636342667;
            }
        } else {
            illegalArgumentException = AnonymousClass7TE.A0w("Required value was null.");
            i = -502600102;
        }
        AnonymousClass0fD.A0C(i, A05);
        throw illegalArgumentException;
    }
}
