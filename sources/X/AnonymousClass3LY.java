package X;

/* renamed from: X.3LY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3LY implements Runnable {
    public final /* synthetic */ C226952iF A00;
    public final /* synthetic */ AnonymousClass1MK A01;
    public final /* synthetic */ AnonymousClass3LX A02;

    public /* synthetic */ AnonymousClass3LY(C226952iF r1, AnonymousClass1MK r2, AnonymousClass3LX r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void run() {
        AnonymousClass1MK r3 = this.A01;
        C226952iF r2 = this.A00;
        AnonymousClass3LX r1 = this.A02;
        0lp A002 = 0lq.A00("IgImageInfra.onBitmapLoadedCallback");
        try {
            r3.CyF(r2, r1);
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }
}
