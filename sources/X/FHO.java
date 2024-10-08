package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public final class FHO implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public FHO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animator animator, AnimatorSet animatorSet, ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new FHO(obj, i));
        animatorSet.playTogether(new Animator[]{animator, valueAnimator});
        animatorSet.start();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        Number number;
        Number number2;
        switch (this.A00) {
            case 0:
            case 1:
                0qQ.A0B(valueAnimator, 0);
                C50422FbV fbV = (C50422FbV) this.A01;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Integer) || (number = (Number) animatedValue) == null) {
                    i = 0;
                } else {
                    i = number.intValue();
                }
                RecyclerView recyclerView = fbV.A00;
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                layoutParams.height = i;
                recyclerView.setLayoutParams(layoutParams);
                return;
            case 2:
                0qQ.A0B(valueAnimator, 0);
                ImageView imageView = (ImageView) this.A01;
                Drawable drawable = imageView.getDrawable();
                AnonymousClass7TE.A1R(drawable, DbW.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int"));
                imageView.setImageDrawable(drawable);
                return;
            case 3:
            case 4:
                0qQ.A0B(valueAnimator, 0);
                CardView cardView = (CardView) this.A01;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if ((animatedValue2 instanceof Float) && (number2 = (Number) animatedValue2) != null) {
                    cardView.setCardElevation(number2.floatValue());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
