package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.FpS  reason: case insensitive filesystem */
public final class C51156FpS implements Runnable {
    public final /* synthetic */ C49535ExH A00;

    public C51156FpS(C49535ExH exH) {
        this.A00 = exH;
    }

    public final void run() {
        ViewParent parent;
        FrameLayout frameLayout = this.A00.A00;
        if (frameLayout != null && (parent = frameLayout.getParent()) != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(frameLayout);
            frameLayout.removeAllViews();
        }
    }
}
