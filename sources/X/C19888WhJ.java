package X;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.WhJ  reason: case insensitive filesystem */
public final class C19888WhJ implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public C19888WhJ(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    public final void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A01();
        actionBarOverlayLayout.A00 = actionBarOverlayLayout.A02.animate().translationY(0.0f).setListener(actionBarOverlayLayout.A0J);
    }
}
