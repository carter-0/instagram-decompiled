package X;

import android.view.View;

public final class ALx implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C2806852z A00;

    public ALx(C2806852z r1) {
        this.A00 = r1;
    }

    public final void onViewAttachedToWindow(View view) {
        GAM gam = this.A00.A04;
        if (gam != null) {
            gam.A01();
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        GAM gam = this.A00.A04;
        if (gam != null) {
            gam.A08.cancel();
        }
    }
}
