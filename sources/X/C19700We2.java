package X;

import android.content.Context;
import android.view.MotionEvent;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.ArrayList;

/* renamed from: X.We2  reason: case insensitive filesystem */
public final class C19700We2 implements C317956o7 {
    public final C19718WeK A00;
    public final XCF A01;
    public final C19701We3 A02;
    public final C317396nC A03;
    public final TouchInterceptorFrameLayout A04;
    public final C19697Wdz A05;

    public C19700We2(TouchInterceptorFrameLayout touchInterceptorFrameLayout, XCF xcf, float f) {
        0qQ.A0B(touchInterceptorFrameLayout, 1);
        this.A04 = touchInterceptorFrameLayout;
        this.A01 = xcf;
        C19718WeK weK = new C19718WeK(touchInterceptorFrameLayout, xcf, f);
        this.A00 = weK;
        Context A0S = AnonymousClass7TE.A0S(touchInterceptorFrameLayout);
        C19701We3 we3 = new C19701We3(A0S, new VN5(this));
        this.A02 = we3;
        C317396nC r2 = new C317396nC(A0S, weK);
        this.A03 = r2;
        r2.EHq(touchInterceptorFrameLayout.getTranslationX(), touchInterceptorFrameLayout.getTranslationY());
        ArrayList A14 = DbV.A14(we3);
        A14.add(new C19699We1(A0S, this, xcf));
        A14.add(r2);
        this.A05 = new C19697Wdz(A14);
    }

    public final boolean DL9(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A05.DL9(motionEvent);
    }

    public final boolean DsV(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A05.DsV(motionEvent);
    }

    public final void A00() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A04;
        touchInterceptorFrameLayout.setTranslationY(0.0f);
        JTR.A1B(touchInterceptorFrameLayout);
        this.A05.EHq(touchInterceptorFrameLayout.getTranslationX(), touchInterceptorFrameLayout.getTranslationY());
    }

    public final void EHq(float f, float f2) {
        this.A05.EHq(f, f2);
    }

    public final void destroy() {
        A00();
        this.A05.destroy();
    }
}
