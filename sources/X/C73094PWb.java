package X;

import android.view.View;

/* renamed from: X.PWb  reason: case insensitive filesystem */
public final class C73094PWb implements Runnable {
    public final /* synthetic */ C68462NJa A00;

    public C73094PWb(C68462NJa nJa) {
        this.A00 = nJa;
    }

    public final void run() {
        C68462NJa nJa = this.A00;
        if (nJa.isAdded()) {
            View view = nJa.A00;
            if (view == null) {
                0qQ.A0F("bannerView");
                throw AnonymousClass00P.createAndThrow();
            } else {
                C51972G9s.A0I(view).withEndAction(new C73093PWa(nJa));
            }
        }
    }
}
