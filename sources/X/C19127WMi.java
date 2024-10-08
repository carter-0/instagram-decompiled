package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.WMi  reason: case insensitive filesystem */
public final class C19127WMi implements X6D {
    public float A00 = 1.0f;

    public final Animator ALV(View view, ViewGroup viewGroup) {
        float alpha;
        View view2 = view;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        float f = this.A00;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new W4M(view2, 0.0f, alpha, f, 0));
        ofFloat.addListener(new U0D(view, alpha, 0));
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
        ofFloat.addUpdateListener(new W4M(view2, alpha, 0.0f, 1.0f, 0));
        ofFloat.addListener(new U0D(view, alpha, 0));
        return ofFloat;
    }
}
