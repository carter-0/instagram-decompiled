package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8Mg  reason: invalid class name and case insensitive filesystem */
public final class C354498Mg extends C232922uf {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public Drawable A07;
    public final /* synthetic */ C354468Md A08;

    public final void DmC(2cs r4) {
        0qQ.A0B(r4, 0);
        r4.A0B(this);
        r4.A08(0.0d, true);
    }

    public final void DmE(2cs r7) {
        0qQ.A0B(r7, 0);
        float f = (float) (r7.A09.A00 / r7.A01);
        InteractiveDrawableContainer interactiveDrawableContainer = this.A08.A04;
        interactiveDrawableContainer.A0p(this.A07, this.A01 + (this.A05 * f), this.A02 + (this.A06 * f));
        interactiveDrawableContainer.A0o(this.A07, this.A00 + (this.A04 * f));
        interactiveDrawableContainer.A0n(this.A07, this.A03 * f);
    }

    public C354498Mg(C354468Md r1) {
        this.A08 = r1;
    }
}
