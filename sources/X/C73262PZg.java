package X;

import android.view.View;

/* renamed from: X.PZg  reason: case insensitive filesystem */
public final class C73262PZg implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;

    public C73262PZg(View view, View view2) {
        this.A01 = view;
        this.A00 = view2;
    }

    public final void run() {
        View view = this.A01;
        view.setTranslationX(AnonymousClass7TE.A02(view));
        C66580MXl.A1D(C66583MXo.A0D(view.animate().translationX(0.0f)), new PX3(this.A00));
    }
}
