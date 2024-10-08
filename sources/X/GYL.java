package X;

import android.os.Handler;

public final class GYL {
    public Runnable A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(GYN.A00);
    public final C52054GDa A02;

    public final void A01(JMF jmf) {
        0qQ.A0B(jmf, 0);
        C52054GDa gDa = this.A02;
        C52056GDc gDc = (C52056GDc) gDa.A03.get(jmf);
        if (gDc != null && gDc.equals(gDa.A01)) {
            gDc.A01.A03 = true;
        }
        C52056GDc gDc2 = gDa.A01.A00;
        if (gDc2 != null) {
            gDa.A01 = gDc2;
            GL1 gl1 = gDc2.A01;
            gl1.A00.EJV(gl1, this);
        }
    }

    public GYL(C52054GDa gDa) {
        this.A02 = gDa;
    }

    public final void A00(C52206GIx gIx, JMF jmf, long j) {
        AnonymousClass7TG.A1N(jmf, gIx);
        Runnable runnable = this.A00;
        if (runnable != null) {
            ((Handler) this.A01.getValue()).removeCallbacks(runnable);
        }
        GYM gym = new GYM(gIx, jmf, this);
        ((Handler) this.A01.getValue()).postDelayed(gym, j);
        this.A00 = gym;
    }
}
