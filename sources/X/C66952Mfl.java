package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.Mfl  reason: case insensitive filesystem */
public final class C66952Mfl implements C74500Pvu {
    public C309426Yf A00;
    public AnimatorSet A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final C316146lB A05;

    public C66952Mfl(C316146lB r2) {
        0qQ.A0B(r2, 1);
        this.A05 = r2;
        this.A04 = r2.A04;
        this.A02 = r2.A01;
        this.A03 = r2.A02;
    }

    public final void Eqh() {
        View view;
        int i;
        this.A03.setAlpha(1.0f);
        this.A02.setAlpha(0.0f);
        C309426Yf r0 = this.A00;
        if (r0 == null || r0.A0V == null) {
            view = this.A04;
            i = 0;
        } else {
            view = this.A04;
            i = 8;
        }
        view.setVisibility(i);
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    public final AnimatorSet Abq() {
        return this.A01;
    }

    public final C309426Yf Bkh() {
        return this.A00;
    }

    public final void EIN() {
        View view;
        int i;
        this.A02.setAlpha(1.0f);
        this.A03.setAlpha(0.0f);
        C309426Yf r0 = this.A00;
        if (r0 == null || r0.A0V == null) {
            view = this.A04;
            i = 0;
        } else {
            view = this.A04;
            i = 8;
        }
        view.setVisibility(i);
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    public final void EOh() {
        AnimatorSet animatorSet = new AnimatorSet();
        this.A01 = animatorSet;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setStartDelay(2000);
        C71170Oej.A00(ofFloat, this, 14);
        animatorSet.play(ofFloat);
    }

    public final void Eu9() {
        if (this.A05.A00) {
            C66951Mfk.A01(this);
        }
    }

    public final void start() {
        if (this.A05.A00) {
            C66951Mfk.A02(this);
        }
    }

    public final void Ehz(C309426Yf r1) {
        this.A00 = r1;
    }
}
