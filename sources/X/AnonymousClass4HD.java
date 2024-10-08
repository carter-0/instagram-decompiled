package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.4HD  reason: invalid class name */
public final class AnonymousClass4HD extends C255963v0 {
    public final C55953HqH A00;

    public final void E3E(View view, ReboundViewPager reboundViewPager, float f, int i) {
        0qQ.A0B(reboundViewPager, 0);
        0qQ.A0B(view, 1);
        super.E3E(view, reboundViewPager, f, i);
        C55953HqH hqH = this.A00;
        int i2 = hqH.A00.A03;
        boolean z = true;
        if (i2 <= 0 || i != i2 - 1) {
            z = false;
        }
        if (z) {
            if (f < 0.0f && f >= -1.0f) {
                view.setTranslationX(0.0f);
            } else if (f < -1.0f && f >= -2.0f) {
                view.setTranslationX((1.0f + f) * (((float) reboundViewPager.getPageSize()) + reboundViewPager.A00));
            }
        }
        if (i2 == i) {
            if (f < 1.0f && f >= 0.0f) {
                view.bringToFront();
            }
            if (f == 0.0f) {
                hqH.A00(true);
            } else if (Math.abs(f) == 1.0f) {
                hqH.A00(false);
            }
        }
    }

    public AnonymousClass4HD(C55953HqH hqH) {
        this.A00 = hqH;
    }
}
