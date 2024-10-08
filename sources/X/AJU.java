package X;

import android.animation.ValueAnimator;
import android.widget.TextView;

public final class AJU implements ValueAnimator.AnimatorUpdateListener {
    public final float A00;
    public final int A01;
    public final Object A02;

    public AJU(C384879i2 r1, float f, int i) {
        this.A01 = i;
        this.A02 = r1;
        this.A00 = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        String str;
        TextView textView;
        float f;
        if (this.A01 != 0) {
            float A002 = AnonymousClass7TH.A00(valueAnimator);
            C384879i2 r5 = (C384879i2) this.A02;
            TextView textView2 = r5.A0I;
            str = "explosionView";
            if (textView2 != null) {
                float f2 = this.A00;
                int i = -1;
                if (AnonymousClass7TE.A06(100.0f, A002) % 10 >= 5) {
                    i = 1;
                }
                textView2.setRotation(f2 + ((float) (i * 10)));
                textView = r5.A0I;
                if (textView != null) {
                    f = 1.0f - A002;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        float A003 = AnonymousClass7TH.A00(valueAnimator);
        C384879i2 r4 = (C384879i2) this.A02;
        TextView textView3 = r4.A0P;
        str = "projectileView";
        if (textView3 != null) {
            textView3.setX(textView3.getX() + (10.0f * A003 * this.A00));
            textView = r4.A0P;
            if (textView != null) {
                f = 1.0f - A003;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
        textView.setAlpha(f);
    }
}
