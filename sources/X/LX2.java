package X;

import android.view.View;

public final class LX2 implements View.OnClickListener {
    public final /* synthetic */ C64855LjH A00;

    public LX2(C64855LjH ljH) {
        this.A00 = ljH;
    }

    public final void onClick(View view) {
        C270194gL r0;
        int A05 = AnonymousClass0fD.A05(446700222);
        C60205JhO jhO = this.A00.A00;
        if (jhO == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        C250973mM r02 = jhO.A01.A00;
        if (!(r02 == null || (r0 = r02.A0H.A0H) == null)) {
            DbX.A1W(jhO, JTP.A0q(r0), C318116oQ.A00(jhO), 41);
        }
        AnonymousClass0fD.A0C(136781804, A05);
    }
}
