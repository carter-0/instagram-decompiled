package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import com.instagram.ui.widget.mediabutton.IgMediaButton;

/* renamed from: X.LTd  reason: case insensitive filesystem */
public final class C64195LTd implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64195LTd(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onAnimationCancel(Animator animator) {
        Animator animator2;
        switch (this.A00) {
            case 2:
            case 4:
                DbS.A1U(this.A01);
                animator2 = (Animator) this.A02;
                break;
            case 3:
            case 5:
                DbS.A1U(this.A01);
                animator2 = (Animator) this.A02;
                break;
            default:
                return;
        }
        animator2.removeAllListeners();
    }

    public final void onAnimationEnd(Animator animator) {
        Animator animator2;
        switch (this.A00) {
            case 1:
                View view = (View) this.A02;
                view.setAlpha(0.0f);
                view.setVisibility(8);
                AnonymousClass8GB r1 = (AnonymousClass8GB) this.A01;
                ObjectAnimator objectAnimator = r1.A00;
                if (objectAnimator != null) {
                    objectAnimator.removeAllListeners();
                    r1.A00 = null;
                    return;
                }
                return;
            case 2:
            case 4:
                DbS.A1U(this.A01);
                animator2 = (Animator) this.A02;
                break;
            case 3:
            case 5:
                DbS.A1U(this.A01);
                animator2 = (Animator) this.A02;
                break;
            case 6:
                if (DbT.A07(this.A02) != null) {
                    DbS.A1U(this.A01);
                    return;
                }
                return;
            default:
                return;
        }
        animator2.removeAllListeners();
    }

    public final void onAnimationRepeat(Animator animator) {
        if (7 - this.A00 == 0) {
            PropertyValuesHolder[] values = ((ValueAnimator) this.A01).getValues();
            0qQ.A07(values);
            for (PropertyValuesHolder propertyValuesHolder : values) {
                if (0qQ.A0K(propertyValuesHolder.getPropertyName(), "rotation")) {
                    Interpolator interpolator = IgMediaButton.A0A;
                    propertyValuesHolder.setFloatValues(new float[]{((float) (Math.random() * 29.0d)) - 0.3125f});
                }
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (this.A00 == 0) {
            View view = (View) this.A01;
            view.setVisibility(0);
            C294975nL A012 = C294975nL.A01(view, 0);
            A012.A0U(0.8f, 1.0f, -1.0f);
            A012.A0V(0.8f, 1.0f, -1.0f);
            A012.A0E(C71392co.A02(20.0d)).A0H();
            view.post(new M6D(view, (C39770A8k) this.A02));
        }
    }
}
