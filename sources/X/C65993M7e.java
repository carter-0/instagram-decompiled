package X;

/* renamed from: X.M7e  reason: case insensitive filesystem */
public final class C65993M7e implements Runnable {
    public final /* synthetic */ C61940KSp A00;
    public final /* synthetic */ String A01;

    public C65993M7e(C61940KSp kSp, String str) {
        this.A00 = kSp;
        this.A01 = str;
    }

    public final void run() {
        C61940KSp kSp = this.A00;
        AnonymousClass6ST r0 = kSp.A01;
        if (r0 == null) {
            0qQ.A0F("coverFrameExtractionProgressDialog");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.dismiss();
        kSp.A02 = false;
        AnonymousClass0eM r2 = kSp.A0D;
        JTO.A0k(r2).ET0(this.A01);
        if (kSp.A03) {
            kSp.A03 = false;
            if (kSp.isResumed()) {
                JTO.A0k(r2).A04(kSp, KTP.A00);
            }
        }
    }
}
