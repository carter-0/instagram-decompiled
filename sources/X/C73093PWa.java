package X;

import android.view.View;

/* renamed from: X.PWa  reason: case insensitive filesystem */
public final class C73093PWa implements Runnable {
    public final /* synthetic */ C68462NJa A00;

    public C73093PWa(C68462NJa nJa) {
        this.A00 = nJa;
    }

    public final void run() {
        C68462NJa nJa = this.A00;
        View view = nJa.A00;
        if (view != null) {
            view.clearAnimation();
            View view2 = nJa.A00;
            if (view2 != null) {
                view2.setVisibility(8);
                return;
            }
        }
        0qQ.A0F("bannerView");
        throw AnonymousClass00P.createAndThrow();
    }
}
