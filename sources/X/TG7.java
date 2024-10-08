package X;

public final class TG7 implements Runnable {
    public final /* synthetic */ C12216SpG A00;
    public final /* synthetic */ boolean A01;

    public TG7(C12216SpG spG, boolean z) {
        this.A00 = spG;
        this.A01 = z;
    }

    public final void run() {
        boolean z;
        C12216SpG spG = this.A00;
        Object obj = spG.A0A;
        boolean z2 = this.A01;
        synchronized (obj) {
            if (z2) {
                if (!spG.A02) {
                    spG.A08.A02(spG.A06, RFI.IDLE_EVENT);
                    z = true;
                }
            } else if (spG.A02) {
                spG.A08.A03(spG.A06, RFI.IDLE_EVENT);
                z = false;
            }
            spG.A02 = z;
        }
    }
}
