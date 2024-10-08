package X;

import android.view.View;

/* renamed from: X.6Xf  reason: invalid class name and case insensitive filesystem */
public final class C309176Xf implements View.OnClickListener {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C317116mk A01;
    public final /* synthetic */ C316006kx A02;

    public C309176Xf(C255773uh r1, C317116mk r2, C316006kx r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-45529475);
        C317116mk r3 = this.A01;
        C316006kx r0 = this.A02;
        C250973mM r6 = r0.A09;
        if (r6 != null) {
            r3.DcP(0nA.A0F(r0.A1V), this.A00, r6, AnonymousClass05K.A01, false);
            AnonymousClass0fD.A0C(-1027396871, A05);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required value was null.");
        AnonymousClass0fD.A0C(-1814694994, A05);
        throw illegalArgumentException;
    }
}
