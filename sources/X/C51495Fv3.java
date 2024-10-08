package X;

/* renamed from: X.Fv3  reason: case insensitive filesystem */
public final /* synthetic */ class C51495Fv3 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C226952iF A01;
    public final /* synthetic */ AnonymousClass2hE A02;
    public final /* synthetic */ AnonymousClass2l6 A03;

    public /* synthetic */ C51495Fv3(C226952iF r1, AnonymousClass2hE r2, AnonymousClass2l6 r3, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass2hE r4 = this.A02;
        C226952iF r3 = this.A01;
        AnonymousClass2l6 r1 = this.A03;
        int i = this.A00;
        0lp A002 = 0lq.A00("IgImageInfra.onProgressiveImageCallback");
        try {
            r4.DaX(r3, new AnonymousClass3LX(r1.A02, r1.A03, "memory", r1.A04, i), r1.A01);
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }
}
