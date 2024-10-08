package X;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;

public final class LWh implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        0qQ.A0B(view, 0);
        ((ShimmerFrameLayout) view).A02();
    }

    public final void onViewDetachedFromWindow(View view) {
        0qQ.A0B(view, 0);
        ((ShimmerFrameLayout) view).A03();
    }
}
