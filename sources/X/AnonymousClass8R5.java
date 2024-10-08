package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.8R5  reason: invalid class name */
public final class AnonymousClass8R5 implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass8QN A00;

    public AnonymousClass8R5(AnonymousClass8QN r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass8QN r4 = this.A00;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = r4.A0H;
        boolean z = touchInterceptorFrameLayout.A02.A01;
        AnonymousClass8R4 r0 = r4.A0e;
        if (z) {
            r0.A00();
        } else {
            boolean onTouch = r0.onTouch(touchInterceptorFrameLayout, motionEvent);
            if (motionEvent.getActionMasked() == 0 || !onTouch) {
                return false;
            }
            return true;
        }
        return false;
    }
}
