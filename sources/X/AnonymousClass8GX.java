package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.8GX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8GX implements AnonymousClass8GY {
    public final /* synthetic */ C352888Fl A00;

    public /* synthetic */ AnonymousClass8GX(C352888Fl r1) {
        this.A00 = r1;
    }

    public final void Dkf(float f, float f2) {
        C352888Fl r2 = this.A00;
        C3497281m r3 = r2.A19;
        ViewGroup BqZ = r3.A00().BqZ();
        if (BqZ != null) {
            BqZ.setTranslationY(-f2);
        }
        if (r2.A0g.A08.A00 instanceof AnonymousClass80O) {
            if (0mk.A02(r2.A0T.getContext())) {
                f2 *= -1.0f;
            }
            View Ao7 = r3.A00().Ao7();
            if (Ao7 != null) {
                Ao7.setTranslationX(f2);
                Ao7.setAlpha(1.0f - f);
            }
            View Anx = r3.A00().Anx();
            if (Anx != null) {
                Anx.setTranslationX(-f2);
                Anx.setAlpha(1.0f - f);
            }
        }
    }
}
