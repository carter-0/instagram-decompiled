package X;

import android.view.View;

/* renamed from: X.PXe  reason: case insensitive filesystem */
public final class C73143PXe implements Runnable {
    public final /* synthetic */ C54177H1x A00;

    public C73143PXe(C54177H1x h1x) {
        this.A00 = h1x;
    }

    public final void run() {
        C54177H1x h1x = this.A00;
        View view = h1x.mView;
        if (view != null && view.getHeight() > h1x.getRecyclerView().computeVerticalScrollRange()) {
            h1x.ACw();
        }
    }
}
