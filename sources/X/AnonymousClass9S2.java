package X;

import android.view.View;

/* renamed from: X.9S2  reason: invalid class name */
public final class AnonymousClass9S2 implements Runnable {
    public final /* synthetic */ C378809Rh A00;

    public AnonymousClass9S2(C378809Rh r1) {
        this.A00 = r1;
    }

    public final void run() {
        View view;
        View view2;
        C378809Rh r3 = this.A00;
        r3.A08 = true;
        C39888ADk aDk = r3.A07;
        if (!(aDk == null || (view2 = aDk.A01) == null)) {
            view2.setVisibility(4);
        }
        if (r3.A0C) {
            r3.A0E();
            r3.A0D();
            r3.A0C = false;
        } else if (aDk != null && (view = aDk.A00) != null) {
            view.clearAnimation();
            aDk.A00.setVisibility(0);
        }
    }
}
