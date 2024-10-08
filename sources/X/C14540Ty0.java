package X;

/* renamed from: X.Ty0  reason: case insensitive filesystem */
public final /* synthetic */ class C14540Ty0 implements Runnable {
    public final /* synthetic */ C14534Txu A00;

    public /* synthetic */ C14540Ty0(C14534Txu txu) {
        this.A00 = txu;
    }

    public final void run() {
        C14534Txu txu = this.A00;
        txu.run();
        synchronized (C276984uE.class) {
            C276984uE.A03.remove(txu);
        }
    }
}
