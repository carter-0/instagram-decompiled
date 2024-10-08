package X;

/* renamed from: X.TIb  reason: case insensitive filesystem */
public final /* synthetic */ class C13019TIb implements Runnable {
    public final /* synthetic */ RRG A00;
    public final /* synthetic */ C63577KzQ A01;
    public final /* synthetic */ C13712Tfa A02;

    public /* synthetic */ C13019TIb(RRG rrg, C63577KzQ kzQ, C13712Tfa tfa) {
        this.A01 = kzQ;
        this.A02 = tfa;
        this.A00 = rrg;
    }

    public final void run() {
        C63577KzQ kzQ = this.A01;
        C13712Tfa tfa = this.A02;
        RRG rrg = this.A00;
        try {
            SO5.A01(kzQ.A00, tfa).A02(rrg.A00());
        } catch (C8991RKj e) {
            tfa.Ew3("OxygenInstallSDK_MARK_EXPOSURE_FAILED", e);
        }
    }
}
