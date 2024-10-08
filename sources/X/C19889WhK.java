package X;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.WhK  reason: case insensitive filesystem */
public final class C19889WhK implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public C19889WhK(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    public final void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A01();
        actionBarOverlayLayout.A00 = actionBarOverlayLayout.A02.animate().translationY((float) (-actionBarOverlayLayout.A02.getHeight())).setListener(actionBarOverlayLayout.A0J);
    }
}
