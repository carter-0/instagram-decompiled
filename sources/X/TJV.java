package X;

public final class TJV implements Runnable {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ String A03;

    public TJV(C307786Rm r1, C276544tV r2, C277014uI r3, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
    }

    public final void run() {
        C276544tV r3 = this.A01;
        C277014uI r2 = this.A02;
        C308276Tl A0P = DbS.A0P();
        A0P.A01(this.A03);
        C307886Rw.A03(this.A00, r3, A0P.A00(), r2);
    }
}
