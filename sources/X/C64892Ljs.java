package X;

/* renamed from: X.Ljs  reason: case insensitive filesystem */
public final /* synthetic */ class C64892Ljs implements 0qb {
    public final /* synthetic */ C64913LkD A00;
    public final /* synthetic */ AnonymousClass3Q2 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C64892Ljs(C64913LkD lkD, AnonymousClass3Q2 r2, String str, boolean z) {
        this.A00 = lkD;
        this.A01 = r2;
        this.A02 = str;
        this.A03 = z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.creation.activity.MediaCaptureActivity, android.app.Activity] */
    public final void DX4(boolean z) {
        C64913LkD lkD = this.A00;
        AnonymousClass3Q2 r4 = this.A01;
        String str = this.A02;
        boolean z2 = this.A03;
        if (z) {
            r4.A3Z = str;
            ? r2 = lkD.A00;
            1ua r1 = r2.A0B;
            r4.A5U = true;
            r4.A5S = true;
            r1.A05.A04();
            JW1.A00(r2.A04).A01();
            r2.runOnUiThread(new M64(r2, z2));
            return;
        }
        JW1.A00(lkD.A00.A04).A08("captureCompleted(): failure in saving photo draft");
    }
}
