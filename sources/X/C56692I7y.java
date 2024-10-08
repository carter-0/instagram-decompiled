package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.LayerDrawable;
import com.instagram.android.R;

/* renamed from: X.I7y  reason: case insensitive filesystem */
public final class C56692I7y implements ValueAnimator.AnimatorUpdateListener {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C56692I7y(Object obj, Object obj2, Object obj3, float f, int i, int i2) {
        this.A01 = i2;
        this.A02 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A05 = obj3;
        this.A00 = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        2V5 r1;
        LayerDrawable A002;
        Number number;
        float f2;
        Number number2;
        if (this.A01 != 0) {
            0qQ.A0B(valueAnimator, 0);
            int i = this.A02;
            int A022 = C244013aV.A02((AnonymousClass3Y5) this.A04, R.color.primary_text_disabled_material_dark);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (!(animatedValue instanceof Float) || (number2 = (Number) animatedValue) == null) {
                f2 = 0.0f;
            } else {
                f2 = number2.floatValue();
            }
            int A023 = 0nH.A02(f2, i, A022);
            r1 = (2V5) this.A03;
            A002 = C53928GwY.A00(this.A00, A023, 0, 0, false, false);
        } else {
            0qQ.A0B(valueAnimator, 0);
            int i2 = this.A02;
            int A024 = C244013aV.A02((AnonymousClass3Y5) this.A04, R.color.primary_text_disabled_material_dark);
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            if (!(animatedValue2 instanceof Float) || (number = (Number) animatedValue2) == null) {
                f = 0.0f;
            } else {
                f = number.floatValue();
            }
            int A025 = 0nH.A02(f, i2, A024);
            r1 = (2V5) this.A03;
            A002 = C52646GaK.A00(this.A00, A025, 0, 0, false, false);
        }
        r1.A00(A002);
    }
}
