package X;

import com.instagram.creation.base.ui.mediatabbar.MediaTabBar;

/* renamed from: X.Jaj  reason: case insensitive filesystem */
public final class C59866Jaj extends C232922uf {
    public final /* synthetic */ C59864Jah A00;

    public C59866Jaj(C59864Jah jah) {
        this.A00 = jah;
    }

    public final void DmB(2cs r3) {
        this.A00.A0I.setVisibility(0);
    }

    public final void DmC(2cs r8) {
        C59864Jah jah = this.A00;
        MediaTabBar mediaTabBar = jah.A0I;
        int i = (jah.A0H.A01 > 0.0d ? 1 : (jah.A0H.A01 == 0.0d ? 0 : -1));
        int i2 = 8;
        if (i == 0) {
            i2 = 0;
        }
        mediaTabBar.setVisibility(i2);
    }

    public final void DmE(2cs r7) {
        double A01 = JTR.A01(r7);
        MediaTabBar mediaTabBar = this.A00.A0I;
        mediaTabBar.setTranslationY((float) AnonymousClass37Q.A01(A01, (double) mediaTabBar.getHeight()));
    }
}
