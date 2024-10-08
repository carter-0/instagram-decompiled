package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.WMk  reason: case insensitive filesystem */
public final class C19129WMk implements X6D {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03;

    public final Animator ALV(View view, ViewGroup viewGroup) {
        float f;
        if (this.A03) {
            f = this.A00;
        } else {
            f = this.A01;
        }
        return A00(view, f, 1.0f);
    }

    public final Animator ALu(View view, ViewGroup viewGroup) {
        float f;
        if (!this.A02) {
            return null;
        }
        if (this.A03) {
            f = this.A01;
        } else {
            f = this.A00;
        }
        return A00(view, 1.0f, f);
    }

    public C19129WMk(boolean z) {
        this.A01 = 1.1f;
        this.A00 = 0.8f;
        this.A02 = true;
        this.A03 = z;
    }

    public static ObjectAnimator A00(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{scaleX * f, scaleX * f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * scaleY, f2 * scaleY})});
        ofPropertyValuesHolder.addListener(new U0A(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    public C19129WMk() {
        this(true);
    }
}
