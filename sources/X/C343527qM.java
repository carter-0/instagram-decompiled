package X;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7qM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C343527qM implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;
    public final /* synthetic */ C341967np A01;

    public /* synthetic */ C343527qM(GestureDetector gestureDetector, C341967np r2) {
        this.A01 = r2;
        this.A00 = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C341967np r0 = this.A01;
        GestureDetector gestureDetector = this.A00;
        C352888Fl r6 = r0.A00;
        if (r6.A0Z.A00().A0A(motionEvent)) {
            return true;
        }
        boolean onTouchEvent = gestureDetector.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 1 && actionMasked != 3) || !r6.A0L) {
            return onTouchEvent;
        }
        r6.A0L = false;
        long currentTimeMillis = 2000 - (System.currentTimeMillis() - r6.A01);
        if (currentTimeMillis <= 0) {
            C352888Fl.A07(r6);
            return onTouchEvent;
        }
        Handler handler = r6.A0Q;
        Runnable runnable = r6.A1K;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, currentTimeMillis);
        return onTouchEvent;
    }
}
