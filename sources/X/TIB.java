package X;

public final class TIB implements Runnable {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;
    public final /* synthetic */ String A02;

    public TIB(C307786Rm r1, C276544tV r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void run() {
        C276544tV r4 = this.A01;
        if (r4.A0A(54) != null) {
            C277014uI A0A = r4.A0A(54);
            C308276Tl A0P = DbS.A0P();
            C307786Rm r1 = this.A00;
            A0P.A01(r1);
            A0P.A02(this.A02);
            DbT.A1R(r1, r4, A0P, A0A);
        }
    }
}
