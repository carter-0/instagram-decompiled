package X;

/* renamed from: X.Api  reason: case insensitive filesystem */
public final class C41184Api implements Runnable {
    public final /* synthetic */ B2G A00;
    public final /* synthetic */ C365768ne A01;
    public final /* synthetic */ 0rm A02;

    public C41184Api(B2G b2g, C365768ne r2, 0rm r3) {
        this.A01 = r2;
        this.A00 = b2g;
        this.A02 = r3;
    }

    public final void run() {
        C365768ne r1 = this.A01;
        if (AnonymousClass7TE.A1b(r1.A09) || r1.A03 != null) {
            this.A00.onSuccess();
        } else {
            this.A00.onFailure((Exception) this.A02.A00);
        }
    }
}
