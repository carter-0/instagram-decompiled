package X;

/* renamed from: X.8mN  reason: invalid class name and case insensitive filesystem */
public final class C365008mN implements Runnable {
    public final /* synthetic */ C364988mL A00;

    public C365008mN(C364988mL r1) {
        this.A00 = r1;
    }

    public final void run() {
        C364988mL r0 = this.A00;
        C365018mO r3 = r0.A0D;
        C365328mu r2 = r3.A03;
        if (r2 == null) {
            C344727sK.A00(r0.A0C, (Long) null);
        } else if (r3.A00) {
            if (!r3.A02) {
                r3.A02 = true;
                r2.CMb(r3.A04);
            }
            if (!r3.A01) {
                r3.A01 = true;
            }
            r2.EEr(r3.A04);
        }
    }
}
