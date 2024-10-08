package X;

/* renamed from: X.9lh  reason: invalid class name and case insensitive filesystem */
public final class C387119lh extends 0vM {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C230462pf A03;
    public final /* synthetic */ C230472pg A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387119lh(C230462pf r3, C230472pg r4, Object obj, Object obj2, float f, long j, long j2) {
        super("signalManagerNewSignal", 577195361);
        this.A03 = r3;
        this.A05 = obj;
        this.A06 = obj2;
        this.A04 = r4;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = f;
    }

    public final void loggedRun() {
        C230462pf r0 = this.A03;
        Object obj = this.A05;
        Object obj2 = this.A06;
        C230462pf.A00(r0, this.A04, obj, obj2, this.A00, this.A02, this.A01);
    }
}
