package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8Me  reason: invalid class name and case insensitive filesystem */
public final class C354478Me extends C232922uf {
    public float A00;
    public float A01;
    public Drawable A02;
    public C369458un A03;
    public C62320sa A04 = C354488Mf.A00;
    public final /* synthetic */ C354468Md A05;

    public final void DmC(2cs r4) {
        0qQ.A0B(r4, 0);
        this.A04.invoke();
        this.A05.A04.A0S(this.A02);
        r4.A0B(this);
        r4.A08(0.0d, true);
    }

    public final void DmE(2cs r8) {
        0qQ.A0B(r8, 0);
        float f = (float) (r8.A09.A00 / r8.A01);
        C369458un r5 = this.A03;
        if (r5 != null) {
            InteractiveDrawableContainer interactiveDrawableContainer = this.A05.A04;
            float f2 = 1.0f - f;
            interactiveDrawableContainer.A0p(this.A02, r5.A01 * f2, r5.A02 * f2);
            interactiveDrawableContainer.A0o(this.A02, r5.A06 + (this.A01 * f));
            interactiveDrawableContainer.A0n(this.A02, r5.A05 + (this.A00 * f));
        }
    }

    public C354478Me(C354468Md r2) {
        this.A05 = r2;
    }
}
