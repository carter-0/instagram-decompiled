package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;

/* renamed from: X.I7l  reason: case insensitive filesystem */
public final class C56680I7l implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C314226hr A00;

    public C56680I7l(C314226hr r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        C314226hr r4 = this.A00;
        Iterator it = r4.A0R.iterator();
        while (it.hasNext()) {
            C51974G9v.A0e(valueAnimator, (View) it.next(), valueAnimator.getAnimatedValue());
        }
        Iterator it2 = r4.A0T.iterator();
        while (it2.hasNext()) {
            C51974G9v.A0e(valueAnimator, (View) it2.next(), valueAnimator.getAnimatedValue());
        }
        r4.A0C.setAlpha(C51970G9q.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float"));
    }
}
