package X;

/* renamed from: X.SqW  reason: case insensitive filesystem */
public final class C12276SqW implements C13721Tfn {
    public final C8886REd A00;
    public final /* synthetic */ C11349SOi A01;

    public C12276SqW(C8886REd rEd, C11349SOi sOi) {
        this.A01 = sOi;
        this.A00 = rEd;
    }

    public final void DAH() {
        C11349SOi sOi = this.A01;
        Object obj = sOi.A06.get();
        if (sOi.A00 != null && obj != null) {
            synchronized (sOi) {
                sOi.A08.put(this.A00, RE9.DOWNLOAD_FAILED);
                C11349SOi.A01(sOi);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void DAJ(Object obj) {
        C11349SOi sOi = this.A01;
        synchronized (sOi) {
            sOi.A08.put(this.A00, RE9.AVAILABLE);
            C11349SOi.A00(sOi);
        }
    }
}
