package X;

/* renamed from: X.PYB  reason: case insensitive filesystem */
public final /* synthetic */ class C73175PYB implements Runnable {
    public final /* synthetic */ C226952iF A00;
    public final /* synthetic */ AnonymousClass1MK A01;

    public /* synthetic */ C73175PYB(C226952iF r1, AnonymousClass1MK r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1MK r7 = this.A01;
        C226952iF r6 = this.A00;
        0lp A002 = 0lq.A00("IgImageInfra.onImageErrorCallback");
        try {
            r7.DJx(r6, new C254673sr(C254663sq.NULL_URL, (String) null, "undefined", 0));
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }
}
