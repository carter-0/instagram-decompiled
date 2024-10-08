package X;

import android.view.View;

/* renamed from: X.PZi  reason: case insensitive filesystem */
public final class C73264PZi implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Runnable A01;

    public C73264PZi(View view, Runnable runnable) {
        this.A00 = view;
        this.A01 = runnable;
    }

    public final void run() {
        View view = this.A00;
        view.setVisibility(8);
        view.setAlpha(1.0f);
        this.A01.run();
    }
}
