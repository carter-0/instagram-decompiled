package X;

public final class AWV implements 2IR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C62320sa A01;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        0KC.A0C("AuxDBsState", 002.A05(this.A00, "Callback won't run, onFailure for dbType: ", " failed: ", th.getMessage()));
    }

    public AWV(C62320sa r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A01.invoke();
    }
}
