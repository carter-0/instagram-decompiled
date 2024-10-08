package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.OvershootInterpolator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6nH  reason: invalid class name and case insensitive filesystem */
public abstract class C317446nH {
    public static final OvershootInterpolator A00 = new OvershootInterpolator(1.0f);
    public static final C317466nJ A01 = new C317456nI(C317886o0.A06(C318046oG.PLACEHOLDER_STICKER, "placeholder_sticker_id"));
    public static final List A02 = 0sr.A1P(new Integer[]{0, 2, 3});
    public static final AtomicBoolean A03 = new AtomicBoolean(false);

    static {
        C317876nz r0 = C317876nz.A0a;
    }

    public static final void A00(Animator.AnimatorListener animatorListener, List list) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.setDuration(50);
        ofFloat.addUpdateListener(new C56682I7n(list));
        ofFloat.addListener(animatorListener);
        ofFloat.start();
    }

    public static final void A01(List list) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(150);
        ofFloat.setInterpolator(A00);
        ofFloat.addUpdateListener(new C56683I7o(list));
        ofFloat.start();
    }
}
