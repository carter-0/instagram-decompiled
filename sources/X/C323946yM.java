package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.6yM  reason: invalid class name and case insensitive filesystem */
public abstract class C323946yM {
    public static void A00(View view, C297875sV r3) {
        C298025sk r0 = r3.A00.A0J;
        if (r0 != null && r0.A03) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += ((View) parent).getElevation();
            }
            C297955sd r1 = r3.A00;
            if (r1.A02 != f) {
                r1.A02 = f;
                C297875sV.A03(r3);
            }
        }
    }
}
