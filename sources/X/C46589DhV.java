package X;

/* renamed from: X.DhV  reason: case insensitive filesystem */
public final class C46589DhV implements Runnable {
    public final /* synthetic */ C49441Evh A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ C276544tV A03;
    public final /* synthetic */ Runnable A04;

    public C46589DhV(C49441Evh evh, C307786Rm r2, C276544tV r3, C276544tV r4, Runnable runnable) {
        this.A00 = evh;
        this.A03 = r3;
        this.A04 = runnable;
        this.A02 = r4;
        this.A01 = r2;
    }

    public final void run() {
        C49441Evh evh = this.A00;
        evh.A00 = null;
        if (!evh.A01) {
            evh.A01 = true;
            C277014uI A09 = this.A03.A09();
            if (A09 != null) {
                C276544tV r2 = this.A02;
                C307786Rm r1 = this.A01;
                C308276Tl A0T = DbU.A0T(r2);
                A0T.A03(r1, 1);
                DbT.A1R(r1, r2, A0T, A09);
            }
        }
        C277014uI A08 = this.A03.A08();
        if (A08 != null) {
            C276544tV r22 = this.A02;
            C307786Rm r12 = this.A01;
            C308276Tl A0T2 = DbU.A0T(r22);
            A0T2.A03(r12, 1);
            DbT.A1R(r12, r22, A0T2, A08);
        }
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }
}
