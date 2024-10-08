package X;

public final class TID implements Runnable {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;
    public final /* synthetic */ boolean A02;

    public TID(C307786Rm r1, C276544tV r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }

    public final void run() {
        C276544tV r4 = this.A01;
        C277014uI A0A = r4.A0A(44);
        C308276Tl A0P = DbS.A0P();
        C307786Rm r1 = this.A00;
        A0P.A01(r1);
        A0P.A02(Boolean.valueOf(this.A02));
        DbT.A1R(r1, r4, A0P, A0A);
    }
}
