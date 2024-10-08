package X;

/* renamed from: X.Ap0  reason: case insensitive filesystem */
public final /* synthetic */ class C41140Ap0 implements Runnable {
    public final /* synthetic */ A70 A00;
    public final /* synthetic */ LOF A01;
    public final /* synthetic */ C353118Gi A02;

    public /* synthetic */ C41140Ap0(A70 a70, LOF lof, C353118Gi r3) {
        this.A02 = r3;
        this.A01 = lof;
        this.A00 = a70;
    }

    public final void run() {
        C353118Gi r3 = this.A02;
        LOF lof = this.A01;
        A70 a70 = this.A00;
        AnonymousClass8A1.A01(r3.A0H).A0E("recording_starting_oc");
        C340297l2 r4 = r3.A01;
        r4.getClass();
        r4.A0F(new ADm(a70), r3.A0E, r3.A0F, r3.A0D, lof);
    }
}
