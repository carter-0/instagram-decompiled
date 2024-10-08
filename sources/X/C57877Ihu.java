package X;

/* renamed from: X.Ihu  reason: case insensitive filesystem */
public final class C57877Ihu implements Runnable {
    public final /* synthetic */ AnonymousClass3W1 A00;
    public final /* synthetic */ GFS A01;

    public C57877Ihu(AnonymousClass3W1 r1, GFS gfs) {
        this.A01 = gfs;
        this.A00 = r1;
    }

    public final void run() {
        GFS gfs = this.A01;
        C51967G9n.A1B(gfs.A03, false);
        AnonymousClass3W1 r2 = this.A00;
        if (r2.A2F) {
            r2.A2F = false;
            AnonymousClass3W1.A00(r2, 60);
        }
        C51967G9n.A1B(gfs.A02, r2.A2E);
    }
}
