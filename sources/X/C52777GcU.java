package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.GcU  reason: case insensitive filesystem */
public final class C52777GcU extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C52777GcU(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            super.onAnimationCancel(animator);
        } else {
            ((C59536JNi) this.A01).DFc(true);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                IIW iiw = (IIW) this.A02;
                if (!iiw.A01) {
                    ((C59536JNi) this.A01).DFc(false);
                    iiw.A00 = false;
                    return;
                }
                return;
            case 1:
                ((View) this.A01).getLayoutParams().height = -2;
                ((View) this.A02).getLayoutParams().height = -2;
                return;
            case 2:
                ImageView imageView = (ImageView) this.A01;
                imageView.setVisibility(8);
                imageView.setImageDrawable((Drawable) null);
                ((View) this.A02).setVisibility(0);
                return;
            case 3:
                C51969G9p.A1M(this.A01);
                ((C70776OKw) this.A02).A01 = false;
                return;
            default:
                C51971G9r.A1I((2Wa) this.A02);
                ((2Wa) this.A01).A00();
                return;
        }
    }
}
