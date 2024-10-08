package X;

import android.graphics.drawable.Drawable;

public final class UJ5 extends C306916Ob {
    public final /* synthetic */ C18434Vrd A00;

    public UJ5(C18434Vrd vrd) {
        this.A00 = vrd;
    }

    public final void DFY(Drawable drawable, C240493Lc r5, int i, long j) {
        if (!(drawable instanceof UIW)) {
            1Kn.A02(C273654mx.A00(1198), "Can only use BKBloksComponentsKeyframeBinderUtil with AnimatableKeyframesDrawable");
            return;
        }
        C18434Vrd vrd = this.A00;
        C226492gu r1 = ((UIW) drawable).A01;
        0qQ.A07(r1);
        if (!0qQ.A0K(vrd.A00, r1)) {
            vrd.A00 = r1;
            C18434Vrd.A00(vrd);
        }
    }
}
