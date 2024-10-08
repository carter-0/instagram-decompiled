package X;

import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8jI  reason: invalid class name and case insensitive filesystem */
public final class C363178jI extends C232922uf {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public B3f A04;
    public final /* synthetic */ InteractiveDrawableContainer A05;

    public final void DmC(2cs r5) {
        this.A02 = 0.0f;
        this.A03 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A04 = null;
        2cs r3 = this.A05.A0n;
        r3.A0B(this);
        r3.A08(0.0d, true);
    }

    public final void DmE(2cs r12) {
        0qQ.A0B(r12, 0);
        B3f b3f = this.A04;
        if (b3f != null) {
            C71412ct r4 = r12.A09;
            b3f.EeI((float) AnonymousClass37Q.A03(r4.A00, (double) this.A02, (double) this.A00));
            b3f.EeJ((float) AnonymousClass37Q.A03(r4.A00, (double) this.A03, (double) this.A01));
        }
    }

    public C363178jI(InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A05 = interactiveDrawableContainer;
    }
}
