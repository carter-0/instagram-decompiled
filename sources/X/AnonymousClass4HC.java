package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.4HC  reason: invalid class name */
public class AnonymousClass4HC extends C255963v0 {
    public final float A00;
    public final int A01;
    public final int A02;

    public void E3E(View view, ReboundViewPager reboundViewPager, float f, int i) {
        0qQ.A0B(reboundViewPager, 0);
        0qQ.A0B(view, 1);
        float A012 = A01(f);
        if (view.getHeight() == 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C64293LYt(view, this, A012));
        } else {
            A00(view, A012);
        }
        float f2 = f - ((float) ((int) f));
        if (((double) Math.abs(f2)) >= 0.5d) {
            if (f2 < 0.0f) {
                f2 += 1.0f;
            } else {
                f2 -= 1.0f;
            }
        }
        int round = Math.round(f - f2);
        float A013 = A01(f2);
        float f3 = (float) this.A02;
        float f4 = A013 * f3;
        int i2 = this.A01;
        float f5 = (float) i2;
        float width = (((float) reboundViewPager.getWidth()) / 2.0f) + ((f2 - 0.5f) * f4) + (f5 * f2);
        float A014 = A01(f2 + 1.0f) * f3;
        float f6 = width + f4 + f5;
        float A015 = (width - f5) - (A01(f2 - 1.0f) * f3);
        if (round != 0) {
            if (round == 1) {
                width = f6;
            } else if (round == -1) {
                width = A015;
            } else if (round > 0) {
                width = f6 + A014 + ((float) (i2 * (round - 1))) + (f3 * this.A00 * ((float) (round - 2)));
            } else {
                int i3 = round + 1;
                width = A015 + ((float) (i2 * i3)) + (f3 * this.A00 * ((float) i3));
            }
        }
        if (reboundViewPager.A0S()) {
            width = (width + f4) - ((float) reboundViewPager.getWidth());
        }
        view.setTranslationX(width);
    }

    public AnonymousClass4HC(int i, int i2, float f) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
    }

    public static final void A00(View view, float f) {
        view.setScaleX(f);
        view.setScaleY(f);
        view.setPivotX(0.0f);
        view.setPivotY(((float) view.getHeight()) / 2.0f);
    }

    public final float A01(float f) {
        float abs = Math.abs(f);
        if (abs <= 1.0f) {
            return (float) AnonymousClass37Q.A04((double) abs, 0.0d, 1.0d, 1.0d, (double) this.A00);
        }
        return this.A00;
    }
}
