package X;

import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.WeK  reason: case insensitive filesystem */
public final class C19718WeK implements C273424mY {
    public static final C71392co A04 = C71392co.A04(40.0d, 8.0d);
    public boolean A00 = true;
    public final float A01;
    public final TouchInterceptorFrameLayout A02;
    public final XCF A03;

    public C19718WeK(TouchInterceptorFrameLayout touchInterceptorFrameLayout, XCF xcf, float f) {
        this.A03 = xcf;
        this.A02 = touchInterceptorFrameLayout;
        this.A01 = f;
    }

    public final boolean DAA(C317396nC r2, float f, float f2) {
        0qQ.A0B(r2, 0);
        this.A03.DA9(f);
        return r2.A04();
    }

    public final void DAS(C317396nC r16, float f, float f2, float f3, boolean z) {
        0qQ.A0B(r16, 0);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A02;
        touchInterceptorFrameLayout.setTranslationY(0.5f * f2);
        float A042 = (float) AnonymousClass37Q.A04(Math.min(Math.max((double) Math.abs(f3), 0.0d), (double) touchInterceptorFrameLayout.getHeight()), 0.0d, (double) touchInterceptorFrameLayout.getHeight(), 1.0d, 0.0d);
        float A032 = (float) AnonymousClass37Q.A03((double) A042, (double) this.A01, 1.0d);
        touchInterceptorFrameLayout.setPivotX((float) (touchInterceptorFrameLayout.getWidth() / 2));
        touchInterceptorFrameLayout.setPivotY((float) (touchInterceptorFrameLayout.getHeight() / 2));
        touchInterceptorFrameLayout.setScaleX(A032);
        touchInterceptorFrameLayout.setScaleY(A032);
        if (z) {
            XCF xcf = this.A03;
            if (f2 <= 0.0f) {
                A042 = 1.0f;
            }
            xcf.DAd(A042);
        }
    }

    public final void DAZ(C317396nC r10, float f, float f2, float f3, float f4, float f5) {
        C317396nC r3 = r10;
        0qQ.A0B(r10, 0);
        boolean z = true;
        boolean A1R = AnonymousClass7TF.A1R((f2 > 400.0f ? 1 : (f2 == 400.0f ? 0 : -1)));
        float f6 = f5;
        if (f2 <= 0.0f || f5 <= 1250.0f) {
            z = false;
        }
        if (A1R || z) {
            this.A03.DPy();
            return;
        }
        this.A03.DAd(1.0f);
        r3.A02(A04, 0.0f, 0.0f, f4, f6);
    }

    public final boolean DAg(C317396nC r3, float f, float f2, float f3, float f4, boolean z) {
        if (!this.A00 || f2 >= 0.0f) {
            return false;
        }
        return true;
    }

    public final boolean DlG(C317396nC r3, float f, float f2) {
        return this.A03.Dqq(this.A02, f, f2);
    }

    public final void DvA(C317396nC r2) {
        this.A03.Dv9();
    }
}
