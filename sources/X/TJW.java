package X;

public final class TJW implements Runnable {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public TJW(C307786Rm r1, C276544tV r2, String str, String str2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void run() {
        C276544tV r5 = this.A01;
        if (r5.A0A(55) != null) {
            C277014uI A0A = r5.A0A(55);
            C308276Tl A0P = DbS.A0P();
            C307786Rm r2 = this.A00;
            A0P.A01(r2);
            A0P.A02(this.A02);
            A0P.A03(this.A03, 2);
            DbT.A1R(r2, r5, A0P, A0A);
        }
    }
}
