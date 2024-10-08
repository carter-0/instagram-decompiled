package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

public final class H7v extends C255963v0 {
    public final float A00;
    public final float A01;

    public H7v(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }

    public final void E3E(View view, ReboundViewPager reboundViewPager, float f, int i) {
        AnonymousClass7TG.A1N(reboundViewPager, view);
        float min = Math.min(1.0f, Math.abs(f));
        float f2 = this.A01 / 2.0f;
        view.setTranslationX((((float) (reboundViewPager.getWidth() / 2)) - f2) + (((float) reboundViewPager.getPageSize()) * f) + (f * reboundViewPager.A00));
        view.setPivotX(f2);
        view.setPivotY(this.A00 / 2.0f);
        float f3 = 1.0f - (min * 0.2f);
        view.setScaleX(f3);
        view.setScaleY(f3);
    }
}
