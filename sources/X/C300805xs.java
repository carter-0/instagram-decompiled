package X;

import com.instagram.ui.widget.drawing.FloatingIndicator;

/* renamed from: X.5xs  reason: invalid class name and case insensitive filesystem */
public final class C300805xs extends C232922uf {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final /* synthetic */ FloatingIndicator A04;

    public C300805xs(FloatingIndicator floatingIndicator) {
        this.A04 = floatingIndicator;
    }

    public final void DmE(2cs r5) {
        float f = (float) r5.A09.A00;
        FloatingIndicator floatingIndicator = this.A04;
        floatingIndicator.A00 = (0.0f + ((floatingIndicator.A01 - 0.0f) * f)) / 2.0f;
        float f2 = this.A00;
        floatingIndicator.A02 = f2 + ((this.A02 - f2) * f);
        float f3 = this.A01;
        floatingIndicator.A03 = f3 + ((this.A03 - f3) * f);
        int min = Math.min(255, Math.max(0, (int) (0.0f + ((255.0f - 0.0f) * f))));
        floatingIndicator.A09.setAlpha(min);
        floatingIndicator.A08.setAlpha(min);
        floatingIndicator.invalidate();
    }
}
