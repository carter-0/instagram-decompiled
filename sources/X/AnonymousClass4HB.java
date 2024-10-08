package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.4HB  reason: invalid class name */
public final class AnonymousClass4HB extends AnonymousClass4HC {
    public final C55492Hia A00;
    public final int A01;
    public final int A02;

    public final void E3E(View view, ReboundViewPager reboundViewPager, float f, int i) {
        boolean z;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        int i2 = i;
        float f10 = f;
        ReboundViewPager reboundViewPager2 = reboundViewPager;
        0qQ.A0B(reboundViewPager2, 0);
        View view2 = view;
        0qQ.A0B(view2, 1);
        int i3 = this.A00.A00.A03;
        if (i3 == i2) {
            z = true;
            f2 = A01(f10);
        } else {
            z = false;
            f2 = 1.0f;
        }
        if (!(view2.getScaleX() == f2 && view2.getScaleY() == f2)) {
            if (view2.getHeight() == 0) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(new C64294LYu(view2, this, f2));
            } else {
                AnonymousClass4HC.A00(view2, f2);
            }
        }
        if (!z) {
            f3 = (((float) reboundViewPager2.getPageSize()) * f) + (f * reboundViewPager2.A00);
            if (reboundViewPager2.A0M == AnonymousClass3TI.VERTICAL) {
                view2.setTranslationY(f3);
                return;
            }
        } else {
            int i4 = i2;
            if (f >= 0.0f) {
                i4 = i - 1;
            }
            int i5 = i + 1;
            int i6 = i5;
            if (f >= 0.0f) {
                i5 = i2;
            }
            if (Math.abs(f10) >= 0.5f) {
                if (f >= 0.0f) {
                    i2 = i - 1;
                } else {
                    i2 = i6;
                }
            }
            float f11 = f - ((float) ((int) f10));
            if (((double) Math.abs(f11)) >= 0.5d) {
                if (f11 < 0.0f) {
                    f11 = 1.0f + f11;
                } else {
                    f11 -= 1.0f;
                }
            }
            int A012 = AnonymousClass1GB.A01(f - f11);
            if (i3 == i2) {
                f4 = A01(f11);
            } else {
                f4 = 1.0f;
            }
            float f12 = (float) this.A02;
            float f13 = f4 * f12;
            int i7 = this.A01;
            float f14 = (float) i7;
            f3 = (((float) reboundViewPager2.getWidth()) / 2.0f) + ((f11 - 0.5f) * f13) + (f14 * f11);
            float f15 = f11 + 1.0f;
            if (i3 == i5) {
                f5 = A01(f15);
            } else {
                f5 = 1.0f;
            }
            float f16 = f5 * f12;
            float f17 = f3 + f13 + f14;
            float f18 = f11 - 1.0f;
            if (i3 == i4) {
                f6 = A01(f18);
            } else {
                f6 = 1.0f;
            }
            float f19 = (f3 - f14) - (f6 * f12);
            if (A012 != 0) {
                if (A012 == 1) {
                    f3 = f17;
                } else if (A012 == -1) {
                    f3 = f19;
                } else {
                    if (A012 > 0) {
                        f7 = f17 + f16 + ((float) (i7 * (A012 - 1)));
                        f8 = f12 * 0.1f;
                        f9 = (float) (A012 - 2);
                    } else {
                        int i8 = A012 + 1;
                        f7 = f19 + ((float) (i7 * i8));
                        f8 = f12 * 0.1f;
                        f9 = (float) i8;
                    }
                    f3 = (f8 * f9) + f7;
                }
            }
            if (reboundViewPager2.A0S()) {
                f3 = (f3 + f13) - ((float) reboundViewPager2.getWidth());
            }
        }
        view2.setTranslationX(f3);
    }

    public AnonymousClass4HB(C55492Hia hia, int i, int i2) {
        super(i, i2, 0.1f);
        this.A02 = i;
        this.A01 = i2;
        this.A00 = hia;
    }
}
