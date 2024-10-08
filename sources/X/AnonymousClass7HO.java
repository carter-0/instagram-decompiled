package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.7HO  reason: invalid class name */
public final class AnonymousClass7HO extends AnonymousClass7HP {
    public final /* synthetic */ AnonymousClass7H6 A00;

    public final boolean Dgn(C253913rc r2) {
        return false;
    }

    public final boolean Dgo(C253913rc r7) {
        0qQ.A0B(r7, 0);
        AnonymousClass7H6 r4 = this.A00;
        AnonymousClass7HT r3 = r4.A19;
        if (r3.isIdle()) {
            ReboundViewPager reboundViewPager = r4.A0C;
            if (reboundViewPager == null) {
                0qQ.A0F("viewPager");
                throw AnonymousClass00P.createAndThrow();
            } else if (reboundViewPager.A0O == AnonymousClass3TF.IDLE) {
                SimpleZoomableViewContainer simpleZoomableViewContainer = r4.A0E;
                if (simpleZoomableViewContainer != null) {
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = r4.A0D;
                    if (touchInterceptorFrameLayout != null) {
                        r3.Exy(touchInterceptorFrameLayout, simpleZoomableViewContainer, r7);
                        AnonymousClass7H6.A0V(r4, false);
                        AnonymousClass7H6.A0U(r4, false);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        return false;
    }

    public AnonymousClass7HO(AnonymousClass7H6 r1) {
        this.A00 = r1;
    }

    public final void Dgt(C253913rc r3) {
        AnonymousClass7H6 r1 = this.A00;
        AnonymousClass7H6.A0V(r1, true);
        AnonymousClass7H6.A0U(r1, true);
    }
}
