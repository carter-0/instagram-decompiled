package X;

/* renamed from: X.Vh1  reason: case insensitive filesystem */
public final class C17848Vh1 {
    public final C344557s3 A00;
    public final Object A01 = new Object();
    public final C344557s3 A02;
    public volatile boolean A03 = false;

    public final void A00() {
        Object obj = this.A01;
        synchronized (obj) {
            this.A03 = false;
            obj.notifyAll();
        }
        this.A00.release();
        this.A02.release();
    }

    public C17848Vh1(C344557s3 r2, int i) {
        this.A00 = r2;
        this.A02 = C344577s5.A00(i);
    }
}
