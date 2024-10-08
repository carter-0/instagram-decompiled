package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MhK  reason: case insensitive filesystem */
public final class C67047MhK {
    public ViewTreeObserver.OnDrawListener A00;
    public ViewTreeObserver.OnGlobalLayoutListener A01;
    public RecyclerView A02;
    public boolean A03;
    public final C67260Mku A04;
    public final boolean A05;

    public C67047MhK(C67260Mku mku, boolean z) {
        0qQ.A0B(mku, 2);
        this.A05 = z;
        this.A04 = mku;
    }

    public final void A00() {
        ViewTreeObserver viewTreeObserver;
        this.A03 = false;
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.A01;
            if (onGlobalLayoutListener != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            ViewTreeObserver.OnDrawListener onDrawListener = this.A00;
            if (onDrawListener != null) {
                viewTreeObserver.removeOnDrawListener(onDrawListener);
            }
        }
    }
}
