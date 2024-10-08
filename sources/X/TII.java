package X;

public final class TII implements Runnable {
    public final /* synthetic */ C307896Rx A00;
    public final /* synthetic */ C277014uI A01;
    public final /* synthetic */ String A02;

    public TII(C307896Rx r1, C277014uI r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C308276Tl A0P = DbS.A0P();
        A0P.A01(this.A02);
        C299275ur.A00(this.A00, A0P.A00(), this.A01);
    }
}
