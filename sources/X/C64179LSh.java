package X;

import android.view.View;
import android.view.animation.RotateAnimation;

/* renamed from: X.LSh  reason: case insensitive filesystem */
public abstract class C64179LSh {
    public static final C71392co A00 = C71392co.A03(5.0d, 10.0d);

    public static final C294975nL A01(View view) {
        0qQ.A0B(view, 0);
        C294975nL A0A = JTP.A0c(view, 0).A0E(A00).A0A();
        A0A.A0M(0.0f, 1.0f);
        A0A.A0U(0.0f, 1.0f, -1.0f);
        A0A.A0V(0.0f, 1.0f, -1.0f);
        A0A.A04 = 0;
        return A0A;
    }

    public static final void A02(View view, C295005nO r3) {
        0qQ.A0B(view, 0);
        C294975nL A0A = JTP.A0c(view, 0).A0B(0.5f).A0A();
        A0A.A0M(0.0f, 1.0f);
        A0A.A05 = r3;
        A0A.A0H();
    }

    public static final void A03(View view, C295005nO r6) {
        0qQ.A0B(view, 0);
        C294975nL A0E = JTP.A0c(view, 0).A0E(A00);
        A0E.A0U(1.0f, 0.5f, AnonymousClass7TE.A02(view) / 2.0f);
        A0E.A0V(1.0f, 0.5f, AnonymousClass7TE.A03(view) / 2.0f);
        A0E.A0J(view.getTranslationX() + ((float) (view.getWidth() / 4)));
        A0E.A0K(view.getTranslationY() + ((float) (view.getHeight() / 4)));
        A0E.A05 = r6;
        A0E.A0H();
    }

    public static final RotateAnimation A00() {
        RotateAnimation rotateAnimation = new RotateAnimation(-15.0f, 20.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(7);
        rotateAnimation.setDuration(200);
        return rotateAnimation;
    }
}
