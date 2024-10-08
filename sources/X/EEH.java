package X;

import android.view.View;

public final class EEH extends C252233om {
    public final C273434mZ A00;

    public static void A00(EEH eeh) {
        C273434mZ r1 = eeh.A00;
        r1.B7u().registerLifecycleListener(eeh);
        r1.C8v().CNi(new C14649Tzv(1));
    }

    public final void onResume() {
        C273434mZ r2 = this.A00;
        r2.B7u().unregisterLifecycleListener(this);
        r2.C8v().CNi((View.OnTouchListener) null);
        r2.EIL();
    }

    public EEH(C273434mZ r1) {
        this.A00 = r1;
    }

    public final void onPause() {
        A00(this);
    }
}
