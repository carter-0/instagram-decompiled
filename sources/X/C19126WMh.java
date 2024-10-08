package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.WMh  reason: case insensitive filesystem */
public final class C19126WMh implements X6D {
    public final Animator ALV(View view, ViewGroup viewGroup) {
        float alpha;
        View view2 = view;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new W4N(view2, 0.0f, alpha, 0.35f, 1.0f));
        ofFloat.addListener(new U0D(view, alpha, 1));
        return ofFloat;
    }

    public final Animator ALu(View view, ViewGroup viewGroup) {
        float alpha;
        View view2 = view;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new W4N(view2, alpha, 0.0f, 0.0f, 0.35f));
        ofFloat.addListener(new U0D(view, alpha, 1));
        return ofFloat;
    }
}
