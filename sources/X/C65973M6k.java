package X;

/* renamed from: X.M6k  reason: case insensitive filesystem */
public final class C65973M6k implements Runnable {
    public final /* synthetic */ MV5 A00;
    public final /* synthetic */ String A01;

    public C65973M6k(MV5 mv5, String str) {
        this.A00 = mv5;
        this.A01 = str;
    }

    public final void run() {
        MV5 mv5 = this.A00;
        mv5.onFinish();
        mv5.Doe(this.A01);
    }
}
