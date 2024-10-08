package X;

import android.view.View;

/* renamed from: X.PZh  reason: case insensitive filesystem */
public final class C73263PZh implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ PMP A01;

    public C73263PZh(View view, PMP pmp) {
        this.A01 = pmp;
        this.A00 = view;
    }

    public final void run() {
        PMP pmp = this.A01;
        View view = this.A00;
        C66583MXo.A0C(pmp.A08).removeView(view);
        view.setVisibility(0);
        view.setTranslationX(0.0f);
    }
}
