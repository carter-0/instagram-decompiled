package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.ADk  reason: case insensitive filesystem */
public final class C39888ADk {
    public View A00;
    public View A01;
    public Animation A02;
    public Animation A03;
    public AnonymousClass4UR A04;
    public SlideInAndOutIconView A05;

    public static void A00(Drawable drawable, C39888ADk aDk, C232822uV r3, String str) {
        SlideInAndOutIconView slideInAndOutIconView = aDk.A05;
        if (slideInAndOutIconView != null) {
            slideInAndOutIconView.setIcon(drawable);
            aDk.A05.setText(str);
        }
        AnonymousClass4UR r0 = aDk.A04;
        if (r0 != null) {
            r0.A02(r3);
        }
    }

    public final void A01(View view) {
        this.A00 = view;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A02 = alphaAnimation;
        alphaAnimation.setDuration(250);
        this.A02.setFillAfter(true);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.A03 = alphaAnimation2;
        alphaAnimation2.setDuration(250);
        this.A03.setFillAfter(true);
    }
}
