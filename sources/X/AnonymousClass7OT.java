package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.7OT  reason: invalid class name */
public abstract class AnonymousClass7OT {
    public static final void A00(View view) {
        C294975nL A01 = C294975nL.A01(view, 0);
        A01.A0G();
        A01.A0P(1.0f, -1.0f);
        A01.A0Q(1.0f, -1.0f);
        A01.A03 = 0;
        A01.A0E(C71392co.A04(60.0d, 5.0d)).A0F(true).A0H();
    }

    public static final void A01(View view, ViewGroup viewGroup, boolean z) {
        0qQ.A0B(viewGroup, 2);
        boolean z2 = false;
        if (view.getLayoutDirection() == 1) {
            z2 = true;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        if (z) {
            f2 = 1.0f;
            viewGroup.setVisibility(0);
        }
        C294975nL A01 = C294975nL.A01(viewGroup, 0);
        A01.A0G();
        if (z2) {
            f = (float) viewGroup.getWidth();
        }
        A01.A0P(f2, f);
        A01.A0Q(f2, ((float) viewGroup.getHeight()) / 2.0f);
        C294975nL A0F = A01.A0F(true);
        A0F.A05 = new PQK(viewGroup, z);
        A0F.A0H();
    }
}
