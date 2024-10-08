package X;

public final /* synthetic */ class Sz7 implements C3736596k {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C10472Rsn A01;

    public /* synthetic */ Sz7(C10472Rsn rsn, long j) {
        this.A01 = rsn;
        this.A00 = j;
    }

    public final void onFailure(Exception exc) {
        C10472Rsn rsn = this.A01;
        rsn.A01.set(this.A00);
    }
}
