package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.H7t  reason: case insensitive filesystem */
public final class C54324H7t extends C255963v0 {
    public final float A00;

    public C54324H7t(float f) {
        this.A00 = f;
    }

    public final void E3E(View view, ReboundViewPager reboundViewPager, float f, int i) {
        AnonymousClass7TG.A1N(reboundViewPager, view);
        view.setTranslationX((((float) (reboundViewPager.getWidth() / 2)) - (this.A00 / 2.0f)) + (f * (((float) reboundViewPager.getPageSize()) + reboundViewPager.A00)));
    }
}
