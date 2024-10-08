package X;

/* renamed from: X.FtE  reason: case insensitive filesystem */
public final class C51382FtE implements Runnable {
    public final /* synthetic */ 0SM A00;
    public final /* synthetic */ EBU A01;

    public C51382FtE(0SM r1, EBU ebu) {
        this.A01 = ebu;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void run() {
        C48255Eba eba = this.A01.A00;
        if (!eba.A01.isFinishing()) {
            this.A00.A0B(eba.A01.getSupportFragmentManager(), "feedbackDialog");
        }
    }
}
