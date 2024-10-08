package X;

/* renamed from: X.PZ1  reason: case insensitive filesystem */
public final class C73223PZ1 implements Runnable {
    public final /* synthetic */ C71500Olp A00;
    public final /* synthetic */ C68074Mzf A01;

    public C73223PZ1(C71500Olp olp, C68074Mzf mzf) {
        this.A00 = olp;
        this.A01 = mzf;
    }

    public final void run() {
        C71500Olp olp = this.A00;
        olp.A05.A00(this.A01);
        olp.A03.A0B(07T.ON_CREATE);
    }
}
