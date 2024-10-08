package X;

import android.view.View;

/* renamed from: X.PVx  reason: case insensitive filesystem */
public final class C73090PVx implements Runnable {
    public final /* synthetic */ View A00;

    public C73090PVx(View view) {
        this.A00 = view;
    }

    public final void run() {
        View view = this.A00;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        C66581MXm.A0E(view.animate(), 1.0f).setDuration(100).start();
    }
}
