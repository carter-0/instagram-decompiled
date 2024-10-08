package X;

import android.view.View;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.9qN  reason: invalid class name and case insensitive filesystem */
public final class C389879qN extends C262934Go {
    public View A00;
    public final int A01;
    public final /* synthetic */ AnonymousClass8X3 A02;

    public C389879qN(AnonymousClass8X3 r2) {
        this.A02 = r2;
        this.A01 = 0nA.A08(r2.A02);
    }

    public final void DYG(int i, int i2) {
        float f;
        AnonymousClass37D A012;
        if (!(this.A00 != null || (A012 = AnonymousClass37D.A00.A01(this.A02.A02)) == null || A012.A09() == null)) {
            this.A00 = A012.A09().bottomSheetContainer;
        }
        View view = this.A00;
        if (view != null) {
            f = AnonymousClass7TE.A03(view);
        } else {
            f = 0.0f;
        }
        int i3 = this.A01;
        float min = Math.min(1.0f, Math.max((((float) (i + i3)) - f) / ((float) i3), 0.0f));
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A02.A07;
        touchInterceptorFrameLayout.setScaleX(min);
        touchInterceptorFrameLayout.setScaleY(min);
    }
}
