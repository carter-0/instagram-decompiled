package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.FpU  reason: case insensitive filesystem */
public final class C51158FpU implements Runnable {
    public final /* synthetic */ C49575Eyk A00;

    public C51158FpU(C49575Eyk eyk) {
        this.A00 = eyk;
    }

    public final void run() {
        FrameLayout frameLayout = this.A00.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(frameLayout);
                frameLayout.removeAllViews();
            }
        }
    }
}
