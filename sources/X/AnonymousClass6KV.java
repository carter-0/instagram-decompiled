package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;

/* renamed from: X.6KV  reason: invalid class name */
public final class AnonymousClass6KV implements C74500Pvu {
    public AnimatorSet A00;
    public C309426Yf A01;
    public final View A02;
    public final View A03;
    public final C316246lL A04;

    public AnonymousClass6KV(C316246lL r3) {
        0qQ.A0B(r3, 1);
        this.A04 = r3;
        View view = r3.A02;
        if (view != null) {
            this.A02 = view;
            View view2 = r3.A03;
            if (view2 != null) {
                this.A03 = view2;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final AnimatorSet Abq() {
        return this.A00;
    }

    public final C309426Yf Bkh() {
        return this.A01;
    }

    public final void EIN() {
        this.A02.setAlpha(1.0f);
        this.A03.setAlpha(0.0f);
        this.A04.A02();
    }

    public final void EOh() {
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setStartDelay(2000);
        ofFloat.setDuration(300).addUpdateListener(new AnonymousClass6KD(this));
        ofFloat.addListener(new AnonymousClass6KE(this));
        animatorSet.play(ofFloat);
    }

    public final void Eqh() {
        this.A03.setAlpha(1.0f);
        this.A02.setAlpha(0.0f);
        C316246lL r4 = this.A04;
        C316246lL.A00(r4, Color.red(r4.A00), Color.green(r4.A00), Color.blue(r4.A00), Color.alpha(r4.A00));
    }

    public final void Eu9() {
        if (this.A04.A0A) {
            C66951Mfk.A01(this);
        }
    }

    public final void start() {
        if (this.A04.A0A) {
            C66951Mfk.A02(this);
        }
    }

    public final void Ehz(C309426Yf r1) {
        this.A01 = r1;
    }
}
