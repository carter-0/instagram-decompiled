package X;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class LTn implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public LTn(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        Number number;
        View view;
        Number number2;
        switch (this.A00) {
            case 0:
                int A04 = DbW.A04(C51971G9r.A0o(valueAnimator), "null cannot be cast to non-null type kotlin.Int");
                C14554TyJ tyJ = (C14554TyJ) this.A02;
                C14554TyJ.A00(tyJ, A04);
                if (A04 == this.A01) {
                    tyJ.A00 = A04;
                    return;
                }
                return;
            case 1:
                0qQ.A0B(valueAnimator, 0);
                C249703kE A0W = ((RecyclerView) this.A02).A0W(this.A01);
                if ((A0W instanceof C60691Jpc) && A0W != null && (view = A0W.itemView) != null) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if ((animatedValue instanceof Float) && (number2 = (Number) animatedValue) != null) {
                        int floatValue = (int) number2.floatValue();
                        0nA.A0d(view, floatValue);
                        0nA.A0U(view, floatValue);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                0qQ.A0B(valueAnimator, 0);
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.A02;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (!(animatedValue2 instanceof Integer) || (number = (Number) animatedValue2) == null) {
                    i = this.A01;
                } else {
                    i = number.intValue();
                }
                bottomSheetBehavior.A0V(i);
                return;
            default:
                0qQ.A0B(valueAnimator, 0);
                C60066Jeq jeq = (C60066Jeq) this.A02;
                C60066Jeq.A00(jeq, valueAnimator.getAnimatedFraction(), jeq.A01, this.A01);
                return;
        }
    }
}
