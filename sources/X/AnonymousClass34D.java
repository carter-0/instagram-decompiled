package X;

/* renamed from: X.34D  reason: invalid class name */
public final /* synthetic */ class AnonymousClass34D implements 1wn {
    public final /* synthetic */ AnonymousClass348 A00;

    public /* synthetic */ AnonymousClass34D(AnonymousClass348 r1) {
        this.A00 = r1;
    }

    public final void onEvent(Object obj) {
        String str;
        AnonymousClass348 r2 = this.A00;
        1Xj r5 = ((AnonymousClass3K0) obj).A00;
        AnonymousClass3W1 BQr = r2.A04.BQr(r5);
        if (BQr != null) {
            C249763kK r0 = r2.A06;
            if (r0 != null) {
                str = r0.getSessionId();
            } else {
                str = null;
            }
            C56624I5c.A01(r2.A00, r2.A01, r5, r2.A02, AnonymousClass05K.A00, String.valueOf(BQr.getPosition()), String.valueOf(BQr.A0W), str);
        }
    }
}
