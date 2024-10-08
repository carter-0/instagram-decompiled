package X;

public final class TH9 implements Runnable {
    public final /* synthetic */ C8481QvT A00;
    public final /* synthetic */ C13479Tb6 A01;

    public TH9(C8481QvT qvT, C13479Tb6 tb6) {
        this.A00 = qvT;
        this.A01 = tb6;
    }

    public final void run() {
        long j;
        C8490Qvc qvc = this.A00.A00;
        C13479Tb6 tb6 = this.A01;
        long j2 = qvc.A00;
        C11200SFa.A00();
        qvc.A0J();
        C8486QvY qvY = qvc.A00.A0D;
        C11381SQt.A02(qvY);
        long A0L = qvY.A0L();
        if (A0L != 0) {
            j = Math.abs(C51966G9m.A07(A0L));
        } else {
            j = -1;
        }
        qvc.A0F("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j));
        C8490Qvc.A03(qvc);
        try {
            C8490Qvc.A04(qvc);
            C11381SQt.A02(qvY);
            qvY.A0M();
            qvc.A0L();
            if (tb6 != null) {
                SyH syH = (SyH) tb6;
                syH.A00.A01.post(syH.A01);
            }
            if (qvc.A00 != j2) {
                C8492Qve.A06(qvc);
            }
        } catch (Exception e) {
            qvc.A0H("Local dispatch failed", e);
            C11381SQt.A02(qvY);
            qvY.A0M();
            qvc.A0L();
            if (tb6 != null) {
                SyH syH2 = (SyH) tb6;
                syH2.A00.A01.post(syH2.A01);
            }
        }
    }
}
