package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;

/* renamed from: X.LTl  reason: case insensitive filesystem */
public final class C64199LTl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass4UR A00;

    public C64199LTl(AnonymousClass4UR r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Iterator it = this.A00.A07.iterator();
        while (it.hasNext()) {
            C242213Tb r1 = (C242213Tb) JTR.A10(it);
            if (r1 != null) {
                ((View) r1).setAlpha(AnonymousClass7TE.A04(valueAnimator.getAnimatedValue()));
            }
        }
    }
}
