package X;

/* renamed from: X.3BG  reason: invalid class name */
public final class AnonymousClass3BG implements Runnable {
    public final /* synthetic */ C2365134a A00;

    public AnonymousClass3BG(C2365134a r1) {
        this.A00 = r1;
    }

    public final void run() {
        C2372336v A002 = C2372236u.A00(this.A00.A0F);
        synchronized (A002) {
            1QP A003 = AnonymousClass1QO.A00(A002.A02);
            C2372436w A004 = C2372336v.A00(A003, A002);
            if (A004 != null) {
                A003.flowMarkPoint(A004.A05, "TRAY_VIEW_APPEARED");
            }
        }
    }
}
