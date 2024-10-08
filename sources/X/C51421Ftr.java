package X;

/* renamed from: X.Ftr  reason: case insensitive filesystem */
public final class C51421Ftr implements Runnable {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;
    public final /* synthetic */ C277014uI A02;

    public C51421Ftr(C307786Rm r1, C276544tV r2, C277014uI r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void run() {
        C276544tV r3 = this.A01;
        C277014uI r2 = this.A02;
        C308276Tl A0P = DbS.A0P();
        C307786Rm r0 = this.A00;
        A0P.A01(r0);
        DbT.A1R(r0, r3, A0P, r2);
    }
}
