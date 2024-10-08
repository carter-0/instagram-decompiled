package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

/* renamed from: X.76q  reason: invalid class name and case insensitive filesystem */
public final class C3264076q {
    public View A00;
    public ImageView A01;
    public A47 A02;
    public Integer A03;
    public Runnable A04;
    public boolean A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;

    public static final void A00(View view) {
        if (view != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(500);
            alphaAnimation.setAnimationListener(new LZ6(view));
            view.startAnimation(alphaAnimation);
        }
    }

    public static final void A01(View view) {
        if (view != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(500);
            alphaAnimation.setAnimationListener(new LZ7(view));
            view.startAnimation(alphaAnimation);
        }
    }

    public C3264076q() {
        0eO r2 = 0eO.A02;
        this.A07 = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 37));
        this.A06 = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 36));
        this.A08 = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 38));
        this.A09 = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 39));
    }
}
