package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.PVe  reason: case insensitive filesystem */
public final class C73071PVe implements Runnable {
    public final /* synthetic */ C66633Ma2 A00;

    public C73071PVe(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final void run() {
        ViewTreeObserver viewTreeObserver;
        RecyclerView recyclerView = this.A00.A0F;
        if (recyclerView != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.dispatchOnGlobalLayout();
        }
    }
}
