package X;

public final class NQS extends 2Cn {
    public final /* synthetic */ C74455PvA A00;
    public final /* synthetic */ ON2 A01;
    public final /* synthetic */ boolean A02;

    public NQS(C74455PvA pvA, ON2 on2, boolean z) {
        this.A00 = pvA;
        this.A01 = on2;
        this.A02 = z;
    }

    public final void onFail(Exception exc) {
        this.A00.DOd();
        this.A01.A01(this.A02, false);
    }

    public final void onStart() {
        this.A00.DOe();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.DQc();
        this.A01.A00();
    }
}
