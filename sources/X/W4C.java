package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class W4C implements ValueAnimator.AnimatorUpdateListener {
    public final RecyclerView A00;
    public final C14811UAh A01;

    public W4C(RecyclerView recyclerView, C14811UAh uAh) {
        this.A00 = recyclerView;
        this.A01 = uAh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A00 = C13989Tnp.A02(valueAnimator);
        this.A00.invalidate();
    }
}
