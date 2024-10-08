package X;

/* renamed from: X.Fsx  reason: case insensitive filesystem */
public final class C51365Fsx implements Runnable {
    public final /* synthetic */ EDD A00;
    public final /* synthetic */ Runnable A01;

    public C51365Fsx(EDD edd, Runnable runnable) {
        this.A00 = edd;
        this.A01 = runnable;
    }

    public final void run() {
        if (this.A00.A05.A06()) {
            this.A01.run();
        }
    }
}
