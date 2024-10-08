package X;

import android.view.View;

public final class FPL implements View.OnFocusChangeListener {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;
    public final /* synthetic */ C277014uI A02;

    public FPL(C307786Rm r1, C276544tV r2, C277014uI r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            C276544tV r3 = this.A01;
            C277014uI r2 = this.A02;
            C308276Tl A0T = DbU.A0T(r3);
            C307786Rm r0 = this.A00;
            A0T.A02(r0);
            DbT.A1R(r0, r3, A0T, r2);
        }
    }
}
