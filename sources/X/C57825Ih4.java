package X;

/* renamed from: X.Ih4  reason: case insensitive filesystem */
public final class C57825Ih4 implements Runnable {
    public final /* synthetic */ C55965HqW A00;
    public final /* synthetic */ Runnable A01;

    public C57825Ih4(C55965HqW hqW, Runnable runnable) {
        this.A00 = hqW;
        this.A01 = runnable;
    }

    public final void run() {
        C55965HqW hqW = this.A00;
        if (!hqW.A02.get()) {
            hqW.A00.removeCallbacksAndMessages((Object) null);
            this.A01.run();
            return;
        }
        0kD.A0J("MsysMailboxSessionManagerImpl: Timeout tearing down Mailbox", (Throwable) null, 0Yt.A0E(), 20134884);
    }
}
