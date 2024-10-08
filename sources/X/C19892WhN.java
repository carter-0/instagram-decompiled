package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.WhN  reason: case insensitive filesystem */
public final class C19892WhN implements Runnable {
    public final /* synthetic */ WC5 A00;

    public C19892WhN(WC5 wc5) {
        this.A00 = wc5;
    }

    public final void run() {
        WC5 wc5 = this.A00;
        WC5.A00(wc5);
        View view = wc5.A07;
        if (view.isEnabled() && !view.isLongClickable() && wc5.A02()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            wc5.A03 = true;
        }
    }
}
