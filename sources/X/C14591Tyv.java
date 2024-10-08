package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.Tyv  reason: case insensitive filesystem */
public final class C14591Tyv implements Runnable {
    public final /* synthetic */ C14576Tyg A00;

    public C14591Tyv(C14576Tyg tyg) {
        this.A00 = tyg;
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
