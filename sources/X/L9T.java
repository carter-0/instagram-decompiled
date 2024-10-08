package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.ui.widget.drawing.EffectSlider;

public final class L9T {
    public float A00;
    public EffectSlider A01;
    public boolean A02;
    public boolean A03;
    public final C74589Pxc A04 = new C52395GQu(0.0f, 1.0f);
    public final 05G A05;

    public L9T(ViewStub viewStub, C262224Cq r6) {
        02z A0s = JTQ.A0s(this.A02);
        this.A05 = A0s;
        View inflate = viewStub.inflate();
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.drawing.EffectSlider");
        EffectSlider effectSlider = (EffectSlider) inflate;
        this.A01 = effectSlider;
        effectSlider.setProgress(this.A00);
        C51968G9o.A1P(new MG9(this, (AnonymousClass4D7) null, 9), r6, 10b.A03(A0s));
    }
}
