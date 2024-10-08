package X;

/* renamed from: X.Amu  reason: case insensitive filesystem */
public final /* synthetic */ class C41010Amu implements Runnable {
    public final /* synthetic */ C41458AuI A00;
    public final /* synthetic */ Float A01;

    public /* synthetic */ C41010Amu(C41458AuI auI, Float f) {
        this.A00 = auI;
        this.A01 = f;
    }

    public final void run() {
        C41458AuI auI = this.A00;
        Float f = this.A01;
        AnonymousClass9WJ r2 = (AnonymousClass9WJ) auI.A00.A1y.getValue();
        if (r2.isShowing()) {
            float floatValue = f.floatValue();
            if (floatValue == 1.0f) {
                r2.dismiss();
                return;
            }
            r2.A00.setProgress((int) (floatValue * 100.0f));
        }
    }
}
