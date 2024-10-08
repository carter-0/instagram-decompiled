package X;

import androidx.fragment.app.Fragment;

public final class AgL implements C273414mX {
    public final /* synthetic */ C3515789k A00;

    public AgL(C3515789k r1) {
        this.A00 = r1;
    }

    public final void Cyc() {
        C3515789k r2 = this.A00;
        r2.A0K.A05 = AnonymousClass05K.A0C;
        C3514789a r1 = r2.A0J;
        if (r1.A02) {
            r2.A0H.Djx();
            r1.A02 = false;
        }
        r2.A0H.DT6();
        C3515189e r0 = r2.A00;
        if (r0 != null) {
            r0.A00();
        }
        r2.A01 = null;
    }

    public final void Cyf() {
        Fragment fragment;
        C3515789k r3 = this.A00;
        C331157Pu r0 = r3.A01;
        if (r0 != null) {
            fragment = r0.A03.A0M();
        } else {
            fragment = null;
        }
        if (fragment instanceof K6M) {
            27r A01 = 27p.A01(r3.A0D);
            A01.A1Q(A01.A04.A0C, "AUDIO_ENHANCE_BACK_TO_POSTCAP");
        }
        r3.A0H.DT5();
    }
}
