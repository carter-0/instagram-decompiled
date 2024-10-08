package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.6mg  reason: invalid class name and case insensitive filesystem */
public final class C317076mg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C316006kx A01;

    public C317076mg(C316006kx r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        C316006kx r0 = this.A01;
        View view = r0.A01;
        if (view != null) {
            int i = this.A00;
            ViewParent parent = view.getParent();
            if (parent != null) {
                View view2 = (View) parent;
                Rect rect = r0.A0M;
                view.getHitRect(rect);
                int height = i - rect.height();
                if (height < 0) {
                    height = 0;
                }
                int i2 = height / 2;
                rect.top -= i2;
                rect.bottom += i2;
                view2.setTouchDelegate(new TouchDelegate(rect, view));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
