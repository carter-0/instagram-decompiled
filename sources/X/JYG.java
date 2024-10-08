package X;

import android.view.View;

public abstract class JYG {
    public static final void A00(View view, float f) {
        C294975nL A01 = C294975nL.A01(view, 0);
        A01.A0G();
        C294975nL A0F = A01.A0E(JYD.A0f).A0F(true);
        A0F.A0K(-f);
        A0F.A0H();
    }

    public static void A01(View view, JYD jyd, float f) {
        A00(view, f);
        A00(jyd.A0N, f);
        A00(jyd.A0B, f);
        A00(jyd.A0A, f);
    }
}
