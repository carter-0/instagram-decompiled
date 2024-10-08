package X;

import android.view.MotionEvent;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

public final class PA5 implements C328107Dl {
    public final /* synthetic */ OI1 A00;

    public final /* bridge */ /* synthetic */ void DRg(MotionEvent motionEvent, Object obj, boolean z) {
        boolean A1U = AnonymousClass7TF.A1U(0, obj, motionEvent);
        OI1 oi1 = this.A00;
        NVH nvh = oi1.A01;
        if (nvh != null) {
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = oi1.A00;
            if (touchInterceptorFrameLayout == null) {
                0qQ.A0F("cardView");
                throw AnonymousClass00P.createAndThrow();
            }
            touchInterceptorFrameLayout.performHapticFeedback(0);
            OUq oUq = OUq.A00;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            oUq.A00(oi1.A05.requireActivity(), oi1.A06, nvh.A01, oi1.A07, oi1.A09, nvh.A08, "questions", rawX, rawY, A1U);
        }
    }

    public PA5(OI1 oi1) {
        this.A00 = oi1;
    }

    public final /* bridge */ /* synthetic */ boolean DA7(Object obj) {
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean DRb(MotionEvent motionEvent, Object obj) {
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean DsN(MotionEvent motionEvent, Object obj) {
        return false;
    }
}
