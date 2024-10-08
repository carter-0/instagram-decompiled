package X;

/* renamed from: X.ToC  reason: case insensitive filesystem */
public final class C14010ToC extends Thread {
    public final /* synthetic */ 2QF A00;
    public final /* synthetic */ 2QR A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14010ToC(2QF r2, 2QR r3) {
        super("MemoryDumpCleaner");
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void run() {
        2QF r2 = this.A00;
        2QP.A00(r2.A02().A0C, false);
        r2.A08().A00();
    }
}
