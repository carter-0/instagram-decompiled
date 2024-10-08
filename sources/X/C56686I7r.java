package X;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.widget.LinearLayout;

/* renamed from: X.I7r  reason: case insensitive filesystem */
public final class C56686I7r implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C56686I7r(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        Number number2;
        switch (this.A00) {
            case 0:
                int A04 = DbW.A04(C51971G9r.A0o(valueAnimator), "null cannot be cast to non-null type kotlin.Int");
                C52878GeD geD = (C52878GeD) this.A02;
                geD.A02 = AnonymousClass7TF.A1S(A04, this.A01);
                C56686I7r.super.setProgress(A04);
                return;
            case 1:
                Object A0o = C51971G9r.A0o(valueAnimator);
                if ((A0o instanceof Integer) && (number = (Number) A0o) != null) {
                    C56626I5e.A01((C56626I5e) this.A02, number.intValue(), this.A01);
                    return;
                }
                return;
            default:
                0qQ.A0B(valueAnimator, 0);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Integer) && (number2 = (Number) animatedValue) != null) {
                    int intValue = number2.intValue();
                    LinearLayout linearLayout = ((C56010HrI) this.A02).A04;
                    linearLayout.setClipBounds(new Rect(0, 0, intValue, this.A01));
                    linearLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
