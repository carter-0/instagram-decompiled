package X;

/* renamed from: X.Jbo  reason: case insensitive filesystem */
public final class C59925Jbo implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C59863Jag A01;

    public C59925Jbo(C59863Jag jag, int i) {
        this.A01 = jag;
        this.A00 = i;
    }

    public final void run() {
        C59863Jag jag = this.A01;
        int i = jag.A02 + this.A00;
        if (jag.A03 != i) {
            jag.A03 = i;
            MXN mxn = jag.A09.mCaptureProvider;
            if (mxn != null) {
                mxn.setFocusIndicatorOrientation(i);
            }
        }
    }
}
