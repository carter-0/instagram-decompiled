package X;

import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: X.VyZ  reason: case insensitive filesystem */
public abstract class C18708VyZ {
    public static final C71392co A00 = C71392co.A02(3.0d);

    public static void A00(View view) {
        ObjectAnimator.ofFloat(view, "rotation", new float[]{0.0f, -4.0f, 4.0f, -4.0f, 0.0f}).setDuration(300).start();
    }

    public static void A01(View view, boolean z) {
        C294975nL A002 = C294975nL.A00(view);
        float f = 0.5f;
        if (z) {
            f = 1.0f;
        }
        A002.A0I(f);
        A002.A0H();
    }
}
