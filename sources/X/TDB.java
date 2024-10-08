package X;

import android.view.ContextThemeWrapper;

public final class TDB implements Runnable {
    public final /* synthetic */ C8131QhP A00;

    public TDB(C8131QhP qhP) {
        this.A00 = qhP;
    }

    public final void run() {
        SIG A0H = AnonymousClass2E0.A0H();
        C8131QhP qhP = this.A00;
        ContextThemeWrapper contextThemeWrapper = qhP.A00;
        if (contextThemeWrapper == null) {
            0qQ.A0F("wrapperContext");
            throw AnonymousClass00P.createAndThrow();
        } else {
            SIG.A00(contextThemeWrapper, C8131QhP.A02(qhP), A0H);
        }
    }
}
