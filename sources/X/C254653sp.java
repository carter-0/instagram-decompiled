package X;

/* renamed from: X.3sp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C254653sp implements Runnable {
    public final /* synthetic */ C226952iF A00;
    public final /* synthetic */ AnonymousClass1MK A01;
    public final /* synthetic */ AnonymousClass2iL A02;

    public /* synthetic */ C254653sp(C226952iF r1, AnonymousClass1MK r2, AnonymousClass2iL r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass2iL r1 = this.A02;
        AnonymousClass1MK r7 = this.A01;
        C226952iF r6 = this.A00;
        0lp A002 = 0lq.A00("IgImageInfra.onImageErrorCallback");
        try {
            int i = r1.A01;
            String str = r1.A0D;
            C254663sq r2 = C254663sq.LOAD_FAILURE;
            String str2 = r1.A0E;
            if (str2 == null) {
                str2 = "undefined";
            }
            r7.DJx(r6, new C254673sr(r2, str, str2, i));
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }
}
