package X;

/* renamed from: X.2iO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C227012iO implements Runnable {
    public final /* synthetic */ C226952iF A00;
    public final /* synthetic */ AnonymousClass1MK A01;
    public final /* synthetic */ AnonymousClass2iL A02;

    public /* synthetic */ C227012iO(C226952iF r1, AnonymousClass1MK r2, AnonymousClass2iL r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass2iL r4 = this.A02;
        AnonymousClass1MK r3 = this.A01;
        C226952iF r1 = this.A00;
        0lp A002 = 0lq.A00("IgImageInfra.onImageProgressCallback");
        try {
            r3.DK4(r1, r4.A0U);
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }
}
