package X;

import com.instagram.common.ui.base.IgFrameLayout;

public final class PQR implements C315616kD {
    public final /* synthetic */ C308476Uk A00;

    public PQR(C308476Uk r1) {
        this.A00 = r1;
    }

    public final void DaF(C294975nL r3, float f) {
        IgFrameLayout igFrameLayout;
        int i;
        C308476Uk r1 = this.A00;
        if (r1.A00 == 0) {
            if (f >= 0.4f) {
                igFrameLayout = r1.A01;
                i = 0;
            } else {
                return;
            }
        } else if (f >= 0.25f) {
            igFrameLayout = r1.A01;
            i = 8;
        } else {
            return;
        }
        igFrameLayout.setVisibility(i);
    }
}
