package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

public final class PQC implements C295005nO {
    public final /* synthetic */ AnonymousClass7H6 A00;

    public PQC(AnonymousClass7H6 r1) {
        this.A00 = r1;
    }

    public final void onFinish() {
        AnonymousClass7H6 r4 = this.A00;
        ReboundViewPager reboundViewPager = r4.A0C;
        if (reboundViewPager == null) {
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
        reboundViewPager.setVisibility(0);
        View view = r4.A06;
        if (view != null) {
            view.postDelayed(new PV9(r4), 100);
        }
        C74508Pw3 pw3 = r4.A0L;
        if (pw3 != null) {
            pw3.A9B();
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = r4.A0D;
        if (touchInterceptorFrameLayout != null && touchInterceptorFrameLayout.getHeight() > 0) {
            TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = r4.A0D;
            0qQ.A0A(touchInterceptorFrameLayout2);
            r4.A0U = Integer.valueOf(touchInterceptorFrameLayout2.getHeight());
        }
        r4.A0f = true;
        AnonymousClass7H6.A0I(r4.A08, r4);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout3 = r4.A0D;
        if (touchInterceptorFrameLayout3 != null) {
            touchInterceptorFrameLayout3.requestFocus();
        }
    }
}
