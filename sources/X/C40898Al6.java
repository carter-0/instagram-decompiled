package X;

import com.instagram.ui.widget.drawing.EffectSlider;

/* renamed from: X.Al6  reason: case insensitive filesystem */
public final class C40898Al6 implements Runnable {
    public final /* synthetic */ EffectSlider A00;

    public C40898Al6(EffectSlider effectSlider) {
        this.A00 = effectSlider;
    }

    public final void run() {
        EffectSlider effectSlider = this.A00;
        effectSlider.A0H = true;
        effectSlider.invalidate();
    }
}
